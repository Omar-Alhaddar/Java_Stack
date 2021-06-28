package com.example.LoginRegester.models;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "events")
public class Event {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String name;
	
	@DateTimeFormat(pattern="yyyy-mm-dd")
	private Date date;
	
	private String location;
	
	private String state;
	
	
	  @Column(updatable=false)
	    private Date createdAt;
	    private Date updatedAt;
	    
	    @ManyToMany(fetch = FetchType.LAZY)
	    @JoinTable(name = "users_events" , 
	    joinColumns = @JoinColumn(name = "event_id") , 
	    inverseJoinColumns = @JoinColumn(name = "user_id")
	    		)
	    private List<User> joinedUsers;
	    
	    @ManyToOne(fetch = FetchType.LAZY)
	    @JoinColumn(name= "user_id")
	    private User user;
	    
	    @OneToMany(mappedBy = "event", fetch = FetchType.LAZY)
	    private List<Message> messages;
	    
	    
		public Event() {
		}


		
		
		public Event(String name, Date date, String location, String state, List<User> joinedUsers, User user,
				List<Message> messages) {
			super();
			this.name = name;
			this.date = date;
			this.location = location;
			this.state = state;
			this.joinedUsers = joinedUsers;
			this.user = user;
			this.messages = messages;
		}




		public Long getId() {
			return id;
		}




		public void setId(Long id) {
			this.id = id;
		}




		public String getName() {
			return name;
		}




		public void setName(String name) {
			this.name = name;
		}




		public Date getDate() {
			return date;
		}




		public void setDate(Date date) {
			this.date = date;
		}




		public String getLocation() {
			return location;
		}




		public void setLocation(String location) {
			this.location = location;
		}




		public String getState() {
			return state;
		}




		public void setState(String state) {
			this.state = state;
		}




		public List<User> getJoinedUsers() {
			return joinedUsers;
		}




		public void setJoinedUsers(List<User> joinedUsers) {
			this.joinedUsers = joinedUsers;
		}




		public User getUser() {
			return user;
		}




		public void setUser(User user) {
			this.user = user;
		}




		public List<Message> getMessages() {
			return messages;
		}




		public void setMessages(List<Message> messages) {
			this.messages = messages;
		}




		@PrePersist
	    protected void onCreate(){
	        this.createdAt = new Date();
	    }

		@PreUpdate
	    protected void onUpdate(){
	        this.updatedAt = new Date();
	    }
	    
}
