package com.example.DojoAndNinjas.services;


import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.DojoAndNinjas.models.Dojo;
import com.example.DojoAndNinjas.models.Ninja;
import com.example.DojoAndNinjas.repositories.DojoRepository;
import com.example.DojoAndNinjas.repositories.NinjaRepository;

@Service
public class ApiServices {
	
	private final DojoRepository dojoRepo;
	private final NinjaRepository ninjaRepo;


	
	public ApiServices(DojoRepository dojoRepo, NinjaRepository ninjaRepo) {
		this.dojoRepo = dojoRepo;
		this.ninjaRepo = ninjaRepo;
	}



	public Dojo createDojo(Dojo dojo) {
		
		return dojoRepo.save(dojo);
	}
	
	public Ninja createNinja(Ninja ninja) {
		
		return ninjaRepo.save(ninja);
	}
	public List<Dojo> alldojos(){
		return dojoRepo.findAll();
		}
	
	public Optional<Dojo> findbyid(Long  id){
		return dojoRepo.findById(id);
		}

}
