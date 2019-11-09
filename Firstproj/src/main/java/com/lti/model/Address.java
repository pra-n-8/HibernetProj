package com.lti.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="TableAddress")
public class Address {
	
	@Id
	@GeneratedValue
	private int id;
	
	private int pincode;
	private String city;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="USER_ID") //fk
	private User u ;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public User getU() {
		return u;
	}

	public void setU(User u) {
		this.u = u;
	}
	
}
