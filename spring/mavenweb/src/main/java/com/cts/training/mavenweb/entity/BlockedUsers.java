package com.cts.training.mavenweb.entity;

import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="followers")
public class BlockedUsers {
	@Id // primary key
	
	private Integer userid;
	@Column
	private Integer blockeduserid;
	
	
	public BlockedUsers() {}

	
	public BlockedUsers(Integer userid,Integer blockeduserid) {
		
		this.userid =userid;
		this.blockeduserid=blockeduserid;
		
	}


	public Integer getUserid() {
		return userid;
	}


	public void setUserid(Integer userid) {
		this.userid = userid;
	}


	public Integer getBlockeduserid() {
		return blockeduserid;
	}


	public void setBlockeduserid(Integer blockeduserid) {
		this.blockeduserid = blockeduserid;
	}
	@Override
	public String toString() {
		return "BlockedUsers[userid=" + userid + ", blockeduserid=" +blockeduserid+  "]";
	}

}
