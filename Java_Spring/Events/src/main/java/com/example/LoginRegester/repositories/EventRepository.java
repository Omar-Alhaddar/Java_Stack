package com.example.LoginRegester.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.LoginRegester.models.Event;

@Repository
public interface EventRepository extends CrudRepository<Event, Long>{

}
