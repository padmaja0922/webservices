package com.bcj.restfulservices.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
public class Country {
	
	
	@Id
	@GeneratedValue
	private int id;
	private String nationalBird;
	private String nationalGame;
	private String nationalLanguage;
	
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getNationalBird() {
		return nationalBird;
	}
	
	public void setNationalBird(String nationalBird) {
		this.nationalBird = nationalBird;
	}
	
	public String getNationalGame() {
		return nationalGame;
	}
	
	public void setNationalGame(String nationalGame) {
		this.nationalGame = nationalGame;
	}
	
	
	public String getNationalLanguage() {
		return nationalLanguage;
	}
	
	
	public void setNationalLanguage(String nationalLanguage) {
		this.nationalLanguage = nationalLanguage;
	}
	
	
	public Country(int id, String nationalBird, String nationalGame, String nationalLanguage) {
		super();
		this.id = id;
		this.nationalBird = nationalBird;
		this.nationalGame = nationalGame;
		this.nationalLanguage = nationalLanguage;
	}
	
	
	public Country() {
		super();
	}
	
	
	@Override
	public String toString() {
		return "Country [id=" + id + ", nationalBird=" + nationalBird + ", nationalGame=" + nationalGame
				+ ", nationalLanguage=" + nationalLanguage + "]";
	}
	
	

}
