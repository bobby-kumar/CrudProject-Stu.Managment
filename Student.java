package com.Details;

public class Student {
	private int rollNumber;
	private String stuName;
	private String contactNumber;
	private String course;
	//getter setter used
	public int getRollNumber() {
		return rollNumber;
	}
	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}
	public String getStuName() {
		return stuName;
	}
	public void setStuName(String stuName) {
		this.stuName = stuName;
	}
	public String getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	//constructor with parameter
	public Student(int rollNumber, String stuName, String contactNumber, String course) {
		super();
		this.rollNumber = rollNumber;
		this.stuName = stuName;
		this.contactNumber = contactNumber;
		this.course = course;
	}
	
	@Override
	public String toString() {
		return "Student [rollNumber=" + rollNumber + ", stuName=" + stuName + ", contactNumber=" + contactNumber
				+ ", course=" + course + "]";
	}
	
	

}
