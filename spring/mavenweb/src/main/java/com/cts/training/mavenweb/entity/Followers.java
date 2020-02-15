package com.cts.training.mavenweb.entity;



import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="followers")
public class Followers {
	
	@Id // primary key
	
	private Integer userid;
	@Column
	private Integer followerid;
	
	
	public Followers() {}

	
	public Followers(Integer userid,Integer followerid) {
		
		this.userid =userid;
		this.followerid=followerid;
		
	}


	public Integer getUserid() {
		return userid;
	}


	public void setUserid(Integer userid) {
		this.userid = userid;
	}


	public Integer getFollowerid() {
		return followerid;
	}


	public void setFollowerid(Integer followerid) {
		this.followerid = followerid;
	}

	@Override
	public String toString() {
		return "Followers[userid=" + userid + ", followerid=" + followerid+  "]";
	}
}
