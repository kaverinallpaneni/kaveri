package com.cts.training.mavenweb.entity;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "comments")
public class Comments {
	@Id // primary key
	
	private Integer id;
	@Column
	private Integer mediaid;
	@Column
	private Integer userid;
	
	
	@Column
	private String comment;
	

	
	@Column
	private LocalDateTime createdon ;
	
	
	public Comments() {}

	
	public Comments(Integer id,Integer mediaid,Integer userid,String comment,LocalDateTime createdon) {
		
		this.id = id;
		this.mediaid=mediaid;
		this.userid=userid;
		this.comment=comment;
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


	public String getComment() {
		return comment;
	}


	public void setComment(String comment) {
		this.comment = comment;
	}


	public LocalDateTime getCreatedon() {
		return createdon;
	}


	public void setCreatedon(LocalDateTime createdon) {
		this.createdon = createdon;
	}

	@Override
	public String toString() {
		return "Comments[id=" + id + ", mediaid=" + mediaid+ ", userid=" + userid+ ",comment=" +comment+ ",createdon=" + createdon+ "]";
	}
}
