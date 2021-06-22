package com.example.Languages.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.Languages.models.Language;
import com.example.Languages.services.LanguageService;

@Controller
public class LanguageController {
	
	private final LanguageService languageService;

	public LanguageController(LanguageService languageService) {
		this.languageService = languageService;
	}
	
	 // GET route for all languages
	 @RequestMapping("/languages")
	 public String index(Model model,@ModelAttribute("lang") Language newLanguage) {
	     List<Language> langs = languageService.langs();
	     model.addAttribute("langs", langs);
	     return "index.jsp";
	}
	 
	 // POST route for creating a new language
	 @RequestMapping(value="/languages", method=RequestMethod.POST)
	    public String create(@ModelAttribute("lang") Language language,BindingResult result) {
		 if (result.hasErrors()) {
	            return "edit.jsp";
	        } else {
	            languageService.updateLang(language);
	            return "redirect:/languages";
	        }

	    }	
	 
	 // GET route for show idO
	 @RequestMapping("languages/{id}")
	 public String show(@PathVariable("id") Long id, Model model) {
		 Language lang = languageService.findLang(id);
	     model.addAttribute("lang", lang);
	     return "show.jsp";
	 }
	 
	 // GET route for update
	 @RequestMapping("/languages/{id}/edit")
	 public String edit(@PathVariable("id") Long id, Model model) {
		 Language lang = languageService.findLang(id);
	     model.addAttribute("lang", lang);
	     return "edit.jsp";
	 }
	 
	// PUT route for update
    @RequestMapping(value="/languages/{id}", method=RequestMethod.PUT)
    public String update(@Valid @ModelAttribute("lang") Language language, BindingResult result) {
        if (result.hasErrors()) {
            return "edit.jsp";
        } else {
            languageService.updateLang(language);
            return "redirect:/languages";
        }
    }
    
    
	// DELETE  route for delete
    @RequestMapping(value="/languages/{id}", method=RequestMethod.DELETE)
    public String delete(@PathVariable("id") Long id) {
    	languageService.deleteLanguage(id);
    	return "redirect:/languages";

    }
 
	 
	 
	
	

}
