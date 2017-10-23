package com.bcj.creditcard.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class EmploymentDetails {
	
	
	@Id
	@GeneratedValue
	private int Id;
	private String CompanyName;
	private float annualIncome;
	
	
	
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
	@Override
	public String toString() {
		return "EmploymentDetails [Id=" + Id + ", CompanyName=" + CompanyName + ", annualIncome=" + annualIncome + "]";
	}
	
	
	

	
	
	
	

}
