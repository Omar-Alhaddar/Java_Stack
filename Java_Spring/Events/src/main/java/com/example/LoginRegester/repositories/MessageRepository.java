package com.example.LoginRegester.repositories;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.LoginRegester.models.Message;

@Repository
public interface MessageRepository extends CrudRepository<Message , Long>{

}
