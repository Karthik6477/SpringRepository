package com.spring.onlineexam.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "Users")
public class Users {
	
	//initializing of table
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name = "first_name")
	private String firstName;
	
	@Column(name = "last_name")
	private String lastName;
	
	private String email;
	
	private String password;
	
	@Column(name = "confirm_password")
	private String confirmPassword;
	
	@Column(name = "phone_number")
	private long phoneNumber;
	
	private String role;
	
	@Column(name = "profile_picture")
	private String profilePicture;
	
	private String reason;
	
	@Column(name = "last_active_date")
	private LocalDateTime lastActiveDate;

	//getter and setter methods
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getConfirmPassword() {
		return confirmPassword;
	}

	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getProfilePicture() {
		return profilePicture;
	}

	public void setProfilePicture(String profilePicture) {
		this.profilePicture = profilePicture;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public LocalDateTime getLastActiveDate() {
		return lastActiveDate;
	}

	public void setLastActiveDate(LocalDateTime lastActiveDate) {
		this.lastActiveDate = lastActiveDate;
	}

	//toString method
	
	@Override
	public String toString() {
		return "Users [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", password=" + password + ", confirmPassword=" + confirmPassword + ", phoneNumber=" + phoneNumber
				+ ", role=" + role + ", profilePicture=" + profilePicture + ", reason=" + reason + ", lastActiveDate="
				+ lastActiveDate + "]";
	}

	//Constructor using fields
	
	public Users(Integer id, String firstName, String lastName, String email, String password, String confirmPassword,
			long phoneNumber, String role, String profilePicture, String reason, LocalDateTime lastActiveDate) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		this.confirmPassword = confirmPassword;
		this.phoneNumber = phoneNumber;
		this.role = role;
		this.profilePicture = profilePicture;
		this.reason = reason;
		this.lastActiveDate = lastActiveDate;
	}

	//Constructor using super class
	
	public Users() {
		super();
	}
}
