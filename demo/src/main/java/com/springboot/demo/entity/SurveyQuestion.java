package com.springboot.demo.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;


@Entity

public class SurveyQuestion {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String name;
	
	private String address;
	
	private String Country;
	
	private String gender;
	
	private String religion;

	public SurveyQuestion(int id, String name, String address, String country, String gender, String religion) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		Country = country;
		this.gender = gender;
		this.religion = religion;
	}
	
	public SurveyQuestion() {
		
	}
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCountry() {
		return Country;
	}

	public void setCountry(String country) {
		Country = country;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getReligion() {
		return religion;
	}

	public void setReligion(String religion) {
		this.religion = religion;
	}

	@Override
	public String toString() {
		return "SurveyQuestion [id=" + id + ", name=" + name + ", address=" + address + ", Country=" + Country
				+ ", gender=" + gender + ", religion=" + religion + "]";
	}
	
	
	
	
}
