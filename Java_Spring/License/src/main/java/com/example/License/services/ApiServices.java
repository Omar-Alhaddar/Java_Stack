package com.example.License.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.License.models.License;
import com.example.License.models.Person;
import com.example.License.repositories.LicenseRepository;
import com.example.License.repositories.PersonRepository;


@Service
public class ApiServices {

	private final PersonRepository personRepo;
	private final LicenseRepository licenseRepo;
	
	private static String newNumber = "000000";
	
	
	public ApiServices(PersonRepository personRepo, LicenseRepository licenseRepo) {
		this.personRepo = personRepo;
		this.licenseRepo = licenseRepo;
	}
	
	// Create a new Person
	public Person createPerson(Person person) {
		
		return personRepo.save(person);
	}
	
	// Create a new license
	public License createLicense(License license) {
		newNumber = String.format("%06d", Integer.parseInt(newNumber) + 1);
		license.setNumber(newNumber);
		return licenseRepo.save(license);
	}
	
	// Find all persons
	public List<Person> allPersons(){
		
		return personRepo.findAll();
	}
	
	// Find all licenses
	public List<License> allLicenses(){
		
		return licenseRepo.findAll();
	}
	
	// Find Person by id 
	public Person findPerson(Long id) {
		Optional<Person> findPerson = personRepo.findById(id);
		if(findPerson.isPresent()) {
			System.out.println(findPerson.get());
			return findPerson.get();
		} else {
			return null;
		}
	}
	
	// Find License by id 
	public License findLicense(Long id) {
		Optional<License> findL = licenseRepo.findById(id);
		if (findL.isPresent()) {
			return findL.get();
		} else {
			return null;
		}
	}
	
	public List<Person> allNullPersons() {
		return personRepo.findByLicenseIdIsNull();
	}
	
}
