package com.lti.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Table_Passport")
public class Passport {
	@Id
	@Column(name="passport_num")
	private String passportNo;
	@Column(name="issue_Date")
	private LocalDate issueDate;
	@Column(name="Expiry_Date")
	private LocalDate expiryDate;
	
	@OneToOne()
	@JoinColumn(name="person_id",nullable=false)
	private Person person;
	
	//Getters and Setters
	public String getPassportNo() {
		return passportNo;
	}
	public void setPassportNo(String passportNo) {
		this.passportNo = passportNo;
	}
	public LocalDate getIssueDate() {
		return issueDate;
	}
	public void setIssueDate(LocalDate issueDate) {
		this.issueDate = issueDate;
	}
	public LocalDate getExpiryDate() {
		return expiryDate;
	}
	public void setExpiryDate(LocalDate expiryDate) {
		this.expiryDate = expiryDate;
	}
	public Person getPerson() {
		return person;
	}
	public void setPerson(Person person) {
		this.person = person;
	}
	
	//Tp printpassport number
	@Override
	public String toString() {
		return "Passport [passportNo=" + passportNo + ", issueDate=" + issueDate + ", expiryDate=" + expiryDate
				+ ", person=" + person + "]";
	}
	
	
}
