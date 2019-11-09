package com.lti.test;

import java.time.LocalDate;

import org.junit.Test;

import com.lti.dao.GenericDao;
import com.lti.model.Passport;
import com.lti.model.Person;

public class personPassportTest {

//	@Test
//	public void test() {
//		Person per = new Person();
//		per.setName("Mallesh");
//		per.setAge(22);
//		GenericDao dao = new GenericDao();
//		dao.insertPerson(per);
//	}
//	@Test
//	public void addPassportTest(){
//		Passport passport = new Passport();
//		passport.setPassportNo("ABC123");
//		passport.setIssueDate(LocalDate.of(1997,4,30));
//		passport.setExpiryDate(LocalDate.of(1937,4,30));
//		GenericDao dao = new GenericDao();
//		dao.insertPerson(passport);
//	}
//	
//	@Test
//	public void addpassportToPerson(){
//		GenericDao dao = new GenericDao();
//		Person p = (Person)dao.fetchById(Person.class, 181);
//		Passport pp = new Passport();
//		pp.setPassportNo("Abc1");
//		pp.setExpiryDate(LocalDate.of(2007,4,30));
//		pp.setIssueDate(LocalDate.of(1987,4,30));
//		pp.setPerson(p);
//		dao.insertPerson(pp);
//	}
//	
//	@Test 
//	public void addPassWithPerson()
//	{
//		Person p = new Person();
//
//		GenericDao dao= new GenericDao();
//		p.setAge(22);
//		p.setName("Pranit");
//		Passport pp = new Passport();
//		pp.setPassportNo("XYZ123");
//		pp.setIssueDate(LocalDate.of(2012, 5, 05));
//		pp.setExpiryDate(LocalDate.of(2032, 5, 05));
//		pp.setPerson(p);
//		p.setPassport(pp);
//		dao.insertPerson(p);
//	}
	@Test
	public void UpdateAge(){
		GenericDao dao=new GenericDao();
		Person p=(Person)dao.fetchById(Person.class,242);
		p.setAge(40);
		dao.insert(p);
	}
	@Test
	public void updatePassportDetailsofPerson(){
		GenericDao dao=new GenericDao();
		Person p=(Person)dao.fetchById(Person.class,242);
		
		Passport pp=p.getPassport();
		pp.setPassportNo("87hhbv");
		dao.insert(pp);
		
	}
	

}
