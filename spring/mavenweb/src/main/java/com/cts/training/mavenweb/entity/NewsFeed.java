package com.cts.training.mavenweb.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="newsfeed")
public class NewsFeed {
	@Id // primary key
	
	private Integer id;
	@Column
	private Integer userid;
	
	@Column
	private Integer mediaid;
	
	@Column
	private String feed;
	
	@Column
	private LocalDateTime createdon ;
	
	public NewsFeed() {}

	
	public NewsFeed(Integer id,Integer userid,Integer mediaid,String feed,LocalDateTime createdon) {
		
		this.id =id;
		this.userid=userid;
		this.mediaid=mediaid;
		this.feed=feed;
		this.createdon=createdon;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public Integer getUserid() {
		return userid;
	}


	public void setUserid(Integer userid) {
		this.userid = userid;
	}


	public Integer getMediaid() {
		return mediaid;
	}


	public void setMediaid(Integer mediaid) {
		this.mediaid = mediaid;
	}


	public String getFeed() {
		return feed;
	}


	public void setFeed(String feed) {
		this.feed = feed;
	}


	public LocalDateTime getCreatedon() {
		return createdon;
	}


	public void setCreatedon(LocalDateTime createdon) {
		this.createdon = createdon;
	}
	@Override
	public String toString() {
		return "NewsFeed[id=" + id + ", userid=" +userid+  ",mediaid=" +mediaid+  ",feed=" +feed+  ",createdon=" + createdon+ "]";
	}
}
