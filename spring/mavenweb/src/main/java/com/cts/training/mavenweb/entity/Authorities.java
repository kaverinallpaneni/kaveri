package com.cts.training.mavenweb.entity;



import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="newsfeed")
public class Authorities {
	@Id // primary key

	
	@Column(name="username")
	private String username;
	
	
	@Column
	private String authority;
	
	
	public Authorities() {}

	
	public Authorities(String username,String authority) {
		
		this.username=username;
		this.authority=authority;
	}

}
