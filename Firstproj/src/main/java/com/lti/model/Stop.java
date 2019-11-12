package com.lti.model;

import java.time.LocalTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Table_Stop")
public class Stop {
	@Id
	@GeneratedValue
	private int stopno;
	
	private String name;
	
	@Column(columnDefinition="timestamp")
	private LocalTime departureTime;
	
	@Column(columnDefinition="timestamp")
	private LocalTime arrivalTime;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="stop_no")
	private Bus bus;

	public int getStopno() {
		return stopno;
	}

	public void setStopno(int stopno) {
		this.stopno = stopno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalTime getDepartureTime() {
		return departureTime;
	}

	public void setDepartureTime(LocalTime departureTime) {
		this.departureTime = departureTime;
	}

	public LocalTime getArrivalTime() {
		return arrivalTime;
	}

	public void setArrivalTime(LocalTime arrivalTime) {
		this.arrivalTime = arrivalTime;
	}

	public Bus getBus() {
		return bus;
	}

	public void setBus(Bus bus) {
		this.bus = bus;
	}
	
	
}
