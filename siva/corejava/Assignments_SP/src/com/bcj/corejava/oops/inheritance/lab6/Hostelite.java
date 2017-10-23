package com.bcj.corejava.oops.inheritance.lab6;

public class Hostelite extends Student {
	
	private String hostelName;
	private int roomNumber;
	private String roomType;
	public String getHostelName() {
		return hostelName;
	}
	public void setHostelName(String hostelName) {
		this.hostelName = hostelName;
	}
	public int getRoomNumber() {
		return roomNumber;
	}
	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}
	public String getRoomType() {
		return roomType;
	}
	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}
	
	Hostelite(String hostelName,int roomNumber, String roomType,String studentName,
			float qualifyingExamMarks, char residentialStatus ,String branchName, 
			Address permanentAddress,int yearOfEngg ){
		this.hostelName=hostelName;
		this.roomNumber=roomNumber;
		this.roomType=roomType;
		super.studentName=studentName;
		super. qualifyingExamMarks=qualifyingExamMarks;
		super.residentialStatus=residentialStatus;
		super. branchName=branchName;
		super.permanentAddress=permanentAddress;
		super.yearOfEngg=yearOfEngg;}	

}
