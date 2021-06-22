package com.example.Languages.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.Languages.models.Language;
import com.example.Languages.reposetories.LanguageRepository;


@Service
public class LanguageService {

	private final LanguageRepository langRepo;

	public LanguageService(LanguageRepository langRepo) {
		super();
		this.langRepo = langRepo;
	}
	
	// returns all languages
	public List<Language> langs() {
    	return langRepo.findAll();
    }
	
    // retrieves a language
    public Language findLang(Long id) {
        Optional<Language> optionalLang = langRepo.findById(id);
        if(optionalLang.isPresent()) {
            return optionalLang.get();
        } else {
            return null;
        }
    }
	
	 // creates a language
    public Language createLanguage(Language l) {
        return langRepo.save(l);
    }
    
    // delete a language
    public void deleteLanguage(Long id) {
    	langRepo.deleteById(id);
    }
    
	 // update a language
    public Language updateLang(Language l) {
    	return langRepo.save(l);
    }
    
	
	
}
