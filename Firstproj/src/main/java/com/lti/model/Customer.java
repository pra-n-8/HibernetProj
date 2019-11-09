package com.lti.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TBL_CUST")
public class Customer 
{
	
	@Id
	@GeneratedValue
	@Column(name="CUST_ID")
	private int custId;
	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", custName=" + custName + ", custCity=" + custCity + "]";
	}
	@Column(name="CUST_NAME")
	private String custName;
	
	@Column(name="CUST_CITY")
	private String custCity;
	
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String getCustCity() {
		return custCity;
	}
	public void setCustCity(String custCity) {
		this.custCity = custCity;
	}
	

	
	}

