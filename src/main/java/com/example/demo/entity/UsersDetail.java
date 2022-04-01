package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class UsersDetail {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private Integer usersDetailId;
	private String firstName;
	private String lastName;
	private String emailId;
	private String address;
	private String mobNumber;
	private String rollNumber;
	private String bloodGroup;
	
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name="roleid",nullable = false)
	private Role role;
	
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name="uid",nullable = false)
	private Users uid;



	public UsersDetail(String firstName, String lastName, String emailId, String address, String mobNumber,
			String rollNumber, String bloodGroup, Role role, Users uid) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailId = emailId;
		this.address = address;
		this.mobNumber = mobNumber;
		this.rollNumber = rollNumber;
		this.bloodGroup = bloodGroup;
		this.role = role;
		this.uid = uid;
	}

	public Integer getUsersDetailId() {
		return usersDetailId;
	}

	public void setUsersDetailId(Integer usersDetailId) {
		this.usersDetailId = usersDetailId;
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

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getMobNumber() {
		return mobNumber;
	}

	public void setMobNumber(String mobNumber) {
		this.mobNumber = mobNumber;
	}

	public String getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(String rollNumber) {
		this.rollNumber = rollNumber;
	}

	public String getBloodGroup() {
		return bloodGroup;
	}

	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public Users getUid() {
		return uid;
	}

	public void setUid(Users uid) {
		this.uid = uid;
	}
	
}
