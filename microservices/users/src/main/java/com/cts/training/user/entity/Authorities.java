package com.cts.training.user.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Entity
@Getter
@Setter
@Table(name="Authorities")
@NoArgsConstructor
@AllArgsConstructor
public class Authorities {
	@Id
	@Column(name="username", length = 100)
	private String userName;
	
	@Column(name="authority", length = 100)
	private String role;

}
