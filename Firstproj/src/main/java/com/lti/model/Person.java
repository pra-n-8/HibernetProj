package com.lti.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="TABLE_PERSON1")
public class Person {
	
	@Id
	@GeneratedValue
	@Column(name="person_id")
	private int id;
	@Column(name="person_name",nullable = false,columnDefinition="varchar2(20)")
	private String name;
	@Column(name="person_age",nullable = false)
	private int age;
//	@JoinColumn(name="passport_num")
	@OneToOne(mappedBy="person",cascade=CascadeType.ALL)
	private Passport passport;
	//Getters And Setters
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Passport getPassport() {
		return passport;
	}
	public void setPassport(Passport passport) {
		this.passport = passport;
	}
	
	//To Print the Person
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", age=" + age + ", passport=" + passport + "]";
	}
}
