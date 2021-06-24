package com.example.DojoAndNinjas.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.DojoAndNinjas.models.Ninja;

@Repository
public interface NinjaRepository extends CrudRepository <Ninja,Long>{
	
	List<Ninja> findAll();
	

}
