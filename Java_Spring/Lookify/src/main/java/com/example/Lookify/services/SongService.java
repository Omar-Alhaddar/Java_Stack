package com.example.Lookify.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.Lookify.models.Song;
import com.example.Lookify.repositories.SongRepository;

@Service
public class SongService {
	private final SongRepository songRepo;

	public SongService(SongRepository songRepo) {
		this.songRepo = songRepo;
	}
	
	// create a song
	public void createSong(Song song) {
		songRepo.save(song);
	}
	
	// Find all songs
	public List<Song> allSongs(){
		return songRepo.findAll();
	}
	
	public Song findSong(Long id) {
		
		Optional<Song> findSong = songRepo.findById(id);
		
		if (findSong.isPresent()) {
			return findSong.get();
		} else {
			return null;
		}
	}
	
	public void deleteSong(Long id) {
		songRepo.deleteById(id);
	}
	
	public List<Song> topTen(){
		
		return songRepo.findTop10ByOrderByRatingDesc();
	}
	
	public List<Song> findByArtist(String name) {
		return songRepo.findByArtist(name);
	}
	

}
