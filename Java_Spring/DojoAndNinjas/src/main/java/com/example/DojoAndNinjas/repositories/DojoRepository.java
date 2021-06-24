package com.example.DojoAndNinjas.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.DojoAndNinjas.models.Dojo;

@Repository
public interface DojoRepository extends CrudRepository <Dojo,Long>{
	
	List<Dojo> findAll();
	Optional<Dojo> findById(Long id);

}
