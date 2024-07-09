package com.entity;

public class Student {
	
	private int id;
	private String  fullName;
	private String date;
	private String Address;
	private String Qualification;
	private String email;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	












	public Student(int id, String fullName, String date, String address, String qualification, String email) {
		super();
		this.id = id;
		this.fullName = fullName;
		this.date = date;
		Address = address;
		Qualification = qualification;
		this.email = email;
	}













	public Student(String fullName, String date, String address, String qualification, String email) {
		super();
		this.fullName = fullName;
		this.date = date;
		Address = address;
		Qualification = qualification;
		this.email = email;
	}













	public int getId() {
		return id;
	}













	public void setId(int id) {
		this.id = id;
	}













	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getQualification() {
		return Qualification;
	}
	public void setQualification(String qualification) {
		Qualification = qualification;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", fullName=" + fullName + ", date=" + date + ", Address=" + Address
				+ ", Qualification=" + Qualification + ", email=" + email + "]";
	}

	
	
	

}


