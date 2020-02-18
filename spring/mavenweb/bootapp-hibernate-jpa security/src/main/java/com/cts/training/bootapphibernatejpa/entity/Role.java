package com.cts.training.bootapphibernatejpa.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;


@Entity
@Table(name = "authorities", uniqueConstraints = @UniqueConstraint(columnNames = {"username", "authority"}))
public class Role implements Serializable{

	// private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "username",length=100)
	private String userName;
	
	@Id
	@Column(name = "authority",length=100)
	private String role;
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	
	
	
}
