package com.bcj.corejava.oops.inheritance.lab6;

public class DayScholar extends Student {
	private Address residentialAddress;
	private float distance; 
	
	
	
	
	DayScholar(Address residentialAddress,float distance,String studentName, float qualifyingExamMarks, char residentialStatus, String branchName,
			Address permanentAddress, int yearOfEngg )
	{
		this.residentialAddress= residentialAddress;
		this.distance=distance;
		super.studentName=studentName;
		super. qualifyingExamMarks=qualifyingExamMarks;
		super.residentialStatus=residentialStatus;
		super. branchName=branchName;
		super.permanentAddress=permanentAddress;
		super.yearOfEngg=yearOfEngg;
	}




	public Address getResidentialAddress() {
		return residentialAddress;
	}




	public void setResidentialAddress(Address residentialAddress) {
		this.residentialAddress = residentialAddress;
	}




	public float getDistance() {
		return distance;
	}




	public void setDistance(float distance) {
		this.distance = distance;
	}
}
