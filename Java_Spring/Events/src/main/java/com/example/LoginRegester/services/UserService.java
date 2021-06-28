package com.example.LoginRegester.services;

import java.util.List;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.stereotype.Service;

import com.example.LoginRegester.models.Event;
import com.example.LoginRegester.models.Message;
import com.example.LoginRegester.models.User;
import com.example.LoginRegester.repositories.EventRepository;
import com.example.LoginRegester.repositories.MessageRepository;
import com.example.LoginRegester.repositories.UserRepository;

@Service
public class UserService {
    private final UserRepository userRepository;
    private final EventRepository eventRepo;
    private final MessageRepository messageRepo;
    

    
    public UserService(UserRepository userRepository, EventRepository eventRepo, MessageRepository messageRepo) {
		this.userRepository = userRepository;
		this.eventRepo = eventRepo;
		this.messageRepo = messageRepo;
	}

	// register user and hash their password
    public User registerUser(User user) {
        String hashed = BCrypt.hashpw(user.getPassword(), BCrypt.gensalt());
        user.setPassword(hashed);
        return userRepository.save(user);
    }
    
    // find user by email
    public User findByEmail(String email) {
        return userRepository.findByEmail(email);
    }
    
    // find user by id
    public User findUserById(Long id) {
//    	Optional<User> u = userRepository.findById(id);
//    	
//    	if(u.isPresent()) {
//            return u.get();
//    	} else {
//    	    return null;
//    	}
    	return userRepository.findById(id).orElse(null);
    }
    
    // authenticate user
    public boolean authenticateUser(String email, String password) {
        // first find the user by email
        User user = userRepository.findByEmail(email);
        // if we can't find it by email, return false
        if(user == null) {
            return false;
        } else {
            // if the passwords match, return true, else, return false
            if(BCrypt.checkpw(password, user.getPassword())) {
                return true;
            } else {
                return false;
            }
        }
    }
    
    
    
    public void updateUser(User user) {
    	userRepository.save(user);
    } 
    
    
    
    
    
    // add new event
    public Event addEvent(Event event) {
    	return eventRepo.save(event);
    }
    
    // Get all events
    public List<Event> allEvents(){
    	return (List<Event>) eventRepo.findAll();
    }
    
    //find event by id
    public Event findEventById(Long id) {
    	
    return eventRepo.findById(id).orElse(null);
    	
    }
    
    //update event 
    public void updateEvent(Event event) {
    	eventRepo.save(event);
    }
    
    //delete event
    public void deleteEvent(Long id) {
    	eventRepo.deleteById(id);
    }
    
    
    
    
    
    
    

    // Add a new message
    public Message addMessage(Message message) {
    	return messageRepo.save(message);
    }
    
    
   // Save a message
    public void newMessage(Message message) {
    	messageRepo.save(message);
    }
   // Update message
    public void updateMessage(Message message) {
    	messageRepo.save(message);
    }
}