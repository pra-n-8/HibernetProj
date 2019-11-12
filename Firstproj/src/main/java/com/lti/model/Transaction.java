package com.lti.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Table_Transaction")
public class Transaction {
	
	@Id
	@GeneratedValue
	@Column(name="tx_Num",nullable=false)
	private int txno;
	
	@Column(name="tx_Type",nullable=false)
	private String type;
	
	@Column(name="tx_dateAndTime",nullable=false)
	private LocalDateTime dateAndTime;
	
	@ManyToOne
	@JoinColumn(name="AccNo")
	private Account account;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public LocalDateTime getDateAndTime() {
		return dateAndTime;
	}

	public void setDateAndTime(LocalDateTime dateAndTime) {
		this.dateAndTime = dateAndTime;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public int getTxno() {
		return txno;
	}

	@Override
	public String toString() {
		return "Transaction [txno=" + txno + ", type=" + type + ", dateAndTime=" + dateAndTime + ", account=" + account
				+ "]";
	}
	

}
