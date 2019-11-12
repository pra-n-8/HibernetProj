package com.lti.model;

import java.time.LocalTime;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Table_Bus")
public class Bus {
	@Id
	@GeneratedValue
private int busno;
	
private String operator;
private String source;
private String destination;

@Column(columnDefinition="timestamp")
private LocalTime departureTime;

@Column(columnDefinition="timestamp")
private LocalTime arrivalTime;

@OneToMany(mappedBy="bus", cascade=CascadeType.ALL, fetch=FetchType.EAGER)
private List<Stop> stops;



public String getSource() {
	return source;
}

public void setSource(String source) {
	this.source = source;
}

public String getDestination() {
	return destination;
}

public void setDestination(String destination) {
	this.destination = destination;
}

public int getBusno() {
	return busno;
}

public void setBusno(int busno) {
	this.busno = busno;
}

public String getOperator() {
	return operator;
}

public void setOperator(String operator) {
	this.operator = operator;
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

public List<Stop> getStops() {
	return stops;
}

public void setStops(List<Stop> stops) {
	this.stops = stops;
}


}
