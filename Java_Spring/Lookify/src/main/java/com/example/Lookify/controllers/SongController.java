package com.example.Lookify.controllers;



import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.Lookify.models.Song;
import com.example.Lookify.services.SongService;

@Controller
public class SongController {
	
	private final SongService songService;
	
	
	public SongController(SongService songSerivce) {
		this.songService = songSerivce;
	}

	@RequestMapping("/")
	public String home() {
		
		return "index.jsp";
	}
	
	@RequestMapping("/dashboard")
	public String dashboard(Model model,  @ModelAttribute("song") Song song) {
		List<Song> songs = songService.allSongs();
		model.addAttribute("songs" , songs);
		
		return "dashboard.jsp";
	}
	
 	@RequestMapping("/songs/new")
	public String renderAddSong(@ModelAttribute("addSong")Song song) {
		return "addSong.jsp";
	}
	
	@PostMapping("/songs/new")
	public String createSong(@Valid @ModelAttribute("addSong") Song song, BindingResult result) {
		if(result.hasErrors()) {
			return "addSong.jsp";
		}else {
			songService.createSong(song);
			return "redirect:/dashboard";
		}
	}
	
 	@RequestMapping("/songs/{id}")
	public String show(Model model , @PathVariable("id")Long id) {
 		Song mySong = songService.findSong(id);
 		model.addAttribute("song" , mySong);
 		
		return "showSong.jsp";
	}
 	
 	@RequestMapping("/delete/{id}")
	public String delete(@PathVariable("id")Long id) {
 		songService.deleteSong(id);
 		
		return "redirect:/dashboard";
	}
 	
 	@RequestMapping("/search/topTen")
	public String topTen(Model model) {
 		List<Song> topTenSongs =  songService.topTen();
 		model.addAttribute("songs", topTenSongs);
 		
		return "topTen.jsp";
	}
 	
  	@PostMapping("/search")
	public String searchArtist(@RequestParam("artist") String artist) {
		return "redirect:/search/" + artist;
	}
  	
  	@RequestMapping("/search/{artist}")
	public String showSearch(Model model, @PathVariable("artist") String artist) {
		List<Song> songs = songService.findByArtist(artist);
		model.addAttribute("songs", songs);
		model.addAttribute("artist", artist);
		return "searchByArtist.jsp";
	}

}
