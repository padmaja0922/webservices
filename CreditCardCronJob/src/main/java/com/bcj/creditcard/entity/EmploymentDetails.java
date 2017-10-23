package com.bcj.creditcard.entity;

public class EmploymentDetails {
	
	
	private int Id;
	private String CompanyName;
	private float annualIncome;
	
	
	
	
	
	
	@Override
	public String toString() {
		return "EmploymentDetails [Id=" + Id + ", CompanyName=" + CompanyName + ", annualIncome=" + annualIncome + "]";
	}
	
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getCompanyName() {
		return CompanyName;
	}
	public void setCompanyName(String companyName) {
		CompanyName = companyName;
	}
	public float getAnnualIncome() {
		return annualIncome;
	}
	public void setAnnualIncome(float annualIncome) {
		this.annualIncome = annualIncome;
	}
	
	
	
	

}
