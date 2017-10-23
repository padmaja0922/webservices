package com.citi.creditcard.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity  
@Table(name= "FinancialData")
public class FinancialDetails {

	@Id  
	@Column(name = "Financial_ID")
	@GeneratedValue(strategy= GenerationType.AUTO)
	int id;
	
	
	
	private String annualIncome;
	private String houseMortage;
	
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAnnualIncome() {
		return annualIncome;
	}
	public void setAnnualIncome(String annualIncome) {
		this.annualIncome = annualIncome;
	}
	public String getHouseMortage() {
		return houseMortage;
	}
	public void setHouseMortage(String houseMortage) {
		this.houseMortage = houseMortage;
	}
	@Override
	public String toString() {
		return "FinancialDetails [id=" + id + ", annualIncome=" + annualIncome + ", houseMortage=" + houseMortage + "]";
	}
	
	
	
}
