package com.cts.training.user.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;



import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "users")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor

public class User {
	@Id
	private Integer id;
	
	@Column(name = "username")
	private String name;
	
	@Column
	private String password;
	
	@Column
	private String email;
	
	@Column
	private String profile;
	
	@CreationTimestamp
	@Column
	private LocalDateTime createdon ;
	
	@UpdateTimestamp
	@Column
	private LocalDateTime updatedon ;
	
	@Column
	private Boolean enabled ;
	
	
}
