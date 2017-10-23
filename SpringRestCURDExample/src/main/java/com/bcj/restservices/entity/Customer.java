package com.bcj.restservices.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
public class Customer {

   @Id
   @GeneratedValue
	private int id;
    private  String firstName;
    private String lastNmae;
    private int age;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastNmae() {
		return lastNmae;
	}
	public void setLastNmae(String lastNmae) {
		this.lastNmae = lastNmae;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Customer(int id, String firstName, String lastNmae, int age) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastNmae = lastNmae;
		this.age = age;
	}
	public Customer() {
		super();
	}
	
	@Override
	public String toString() {
		return "Customer [id=" + id + ", firstName=" + firstName + ", lastNmae=" + lastNmae + ", age=" + age + "]";
	}
    
    
	
}
