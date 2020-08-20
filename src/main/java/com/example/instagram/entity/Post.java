package com.example.instagram.entity;

import java.util.Arrays;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="post")
public class Post {
     
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "postId")
	private long id;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public byte[] getPost() {
		return post;
	}
	public void setPost(byte[] post) {
		this.post = post;
	}
	private byte[] post;
	
	 @ManyToOne
	private User user;
	@Override
	public String toString() {
		return "Post [id=" + id + ", post=" + Arrays.toString(post) + "]";
	}
	
	
	
}
