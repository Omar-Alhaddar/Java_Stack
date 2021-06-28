package com.example.LoginRegester.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.LoginRegester.models.UserEvent;

@Repository
public interface UserEventRepository extends CrudRepository<UserEvent, Long>{

}
