package com.capstone.batch.model;

import org.springframework.data.annotation.Id;


public class Student {
  
	@Id
	private String studentId;
    private String studentEmail;
    private String studentName;
    private String purchasedPackage;
  
    public Student() {}

	public String getStudentEmail() {
		return studentEmail;
	}

	public void setStudentEmail(String studentEmail) {
		this.studentEmail = studentEmail;
	}

	public String getStudentId() {
		return studentId;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getPurchasedPackage() {
		return purchasedPackage;
	}

	public void setPurchasedPackage(String purchasedPackage) {
		this.purchasedPackage = purchasedPackage;
	}

	public Student(String studentId, String studentEmail, String studentName, String purchasedPackage) {
		super();
		this.studentId = studentId;
		this.studentEmail = studentEmail;
		this.studentName = studentName;
		this.purchasedPackage = purchasedPackage;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentEmail=" + studentEmail + ", studentName=" + studentName
				+ ", purchasedPackage=" + purchasedPackage + "]";
	}

	

	
}