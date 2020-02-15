package com.cts.training.mavenweb.entity;


import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "actions")
public class Actions {
	@Id // primary key
	
	private Integer id;
	@Column
	private Integer mediaid;
	
	@Column
	private Integer userid;
	
	@Column
	private Boolean status;
	
	
	@Column
	private LocalDateTime createdon ;
	
	
	public Actions() {}

	
	public Actions(Integer id,Integer mediaid,Integer userid,LocalDateTime createdon,Boolean status) {
		
		this.id = id;
		this.mediaid=mediaid;
		this.userid=userid;
		this.status=status;
		this.createdon = createdon;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public Integer getMediaid() {
		return mediaid;
	}


	public void setMediaid(Integer mediaid) {
		this.mediaid = mediaid;
	}


	public Integer getUserid() {
		return userid;
	}


	public void setUserid(Integer userid) {
		this.userid = userid;
	}


	public Boolean getStatus() {
		return status;
	}


	public void setStatus(Boolean status) {
		this.status = status;
	}


	public LocalDateTime getCreatedon() {
		return createdon;
	}


	public void setCreatedon(LocalDateTime createdon) {
		this.createdon = createdon;
	}
	@Override
	public String toString() {
		return "Actions[id=" + id + ", mediaid=" + mediaid+ ", userid=" + userid+ ",status=" +status+ ",createdon=" + createdon+ "]";
	}
	
}
