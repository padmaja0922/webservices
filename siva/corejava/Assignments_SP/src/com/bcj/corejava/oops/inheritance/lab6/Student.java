package com.bcj.corejava.oops.inheritance.lab6;

public class Student {
	
	 public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public float getQualifyingExamMarks() {
		return qualifyingExamMarks;
	}
	public void setQualifyingExamMarks(float qualifyingExamMarks) {
		this.qualifyingExamMarks = qualifyingExamMarks;
	}
	public char getResidentialStatus() {
		return residentialStatus;
	}
	public void setResidentialStatus(char residentialStatus) {
		this.residentialStatus = residentialStatus;
	}
	public String getBranchName() {
		return branchName;
	}
	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}
	public Address getPermanentAddress() {
		return permanentAddress;
	}
	public void setPermanentAddress(Address permanentAddress) {
		this.permanentAddress = permanentAddress;
	}
	public int getYearOfEngg() {
		return yearOfEngg;
	}
	public void setYearOfEngg(int yearOfEngg) {
		this.yearOfEngg = yearOfEngg;
	}
	int studentId;
	 String studentName;
	 float qualifyingExamMarks;
	 char residentialStatus;
	 String branchName;
	Address permanentAddress;
	 int yearOfEngg;
	 static int counter;

	Student() {}
	Student( String studentName,float qualifyingExamMarks,char residentialStatus,String branchName,
			Address permanentAddress,int yearOfEngg )
	{
		this.studentName = studentName;
		this.qualifyingExamMarks = qualifyingExamMarks;
		this.residentialStatus = residentialStatus;
		this.branchName = branchName;
		this.permanentAddress = permanentAddress;
		this.yearOfEngg = yearOfEngg;

		
	}

	public boolean validateStudentName()
	{
		if (studentName.length() >= 5 && studentName.length() <= 25)
			return true;
		else 
			System.out.println("The length of the name should be minimum 5 characters and a maximum of 25 characters");
		
		return false;
	}
	public boolean validateBranchName()
	{
		if ("cse".equalsIgnoreCase(branchName) || "ece".equals(branchName) || "eee".equals(branchName))
			return true;
		else
			System.out.println("Invalid Branch");
		return false;
	}
	public boolean validateExamMarks()
	{
		if (getQualifyingExamMarks() < 70) {
			System.out.println("Invalid marks, the range of marks is between 70 and 100 ");
			return false;
		}
		else 
			return true;
		
	}

	
}
