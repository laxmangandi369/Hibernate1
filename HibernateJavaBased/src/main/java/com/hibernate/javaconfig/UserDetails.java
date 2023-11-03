package com.hibernate.javaconfig;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
public class UserDetails {
				@Id
@Getter @Setter	private int userId;
@Getter @Setter	private String Name;
@Getter @Setter	private String phoneNumber;
public UserDetails(int userId, String name, String phoneNumber) {
	super();
	this.userId = userId;
	Name = name;
	this.phoneNumber = phoneNumber;
}

	public UserDetails(int userId, String name, String phoneNumber) {
	super();
	this.userId = userId;
	Name = name;
	this.phoneNumber = phoneNumber;
}

	public UserDetails(int userId, String name, String phoneNumber) {
	super();
	this.userId = userId;
	Name = name;
	this.phoneNumber = phoneNumber;
}
	
	
	
}
