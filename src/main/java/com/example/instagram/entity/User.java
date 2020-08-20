package com.example.instagram.entity;

import java.util.Arrays;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.CollectionType;


@Entity
@Table(name="Users")
public class User {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "UserId")
	private int id;
	@Column(name="emial")
	private String email;
	@Column(name="UserName")
	private String userName;
	@Column(name = "ProfilePic")
	@Lob
	private byte[] profilePic;
	@Column(name = "Password")
	private String password;
	@Column(name="DateOfBirth")
	private String dateOfBirth;
	 @OneToMany(cascade=CascadeType.ALL)
	 @JoinColumn(name="User_ID")
	private List<Post> posts;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public byte[] getProfilePic() {
		return profilePic;
	}
	public void setProfilePic(byte[] profilePic) {
		this.profilePic = profilePic;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	@Override
	public String toString() {
		return "User [email=" + email + ", userName=" + userName + ", profilePic=" + Arrays.toString(profilePic)
				+ ", password=" + password + ", dateOfBirth=" + dateOfBirth + ", id=" + id + "]";
	}
	
	
	

}
