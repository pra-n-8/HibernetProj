package com.lti.dao;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Calendar;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TemporalType;

import com.lti.model.Account;
import com.lti.model.Transaction;


public class ExtendedDAO extends GenericDao{
	public List<Account> fetchFromType(String type){

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("oracleTest");
		EntityManager em = emf.createEntityManager();
		Query q = em.createQuery("select a from Account as a where a.type=:ty");
		q.setParameter("ty",type);
		List<Account> li = q.getResultList();
		em.close();
		emf.close();
		return li;
	}
	
	public List<Transaction> returnValues(int id){
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("oracleTest");
		EntityManager em = emf.createEntityManager();
		Query q = em.createQuery("select a from Transaction as a where a.account.acno=:ty order by a.dateAndTime desc");
		q.setParameter("ty",id);
		q.setMaxResults(5);
		List<Transaction> li = q.getResultList();
		em.close();
		emf.close();
		return li;
	}
	public List<Transaction> returnDateAndTime(int id,LocalDate date){
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("oracleTest");
		EntityManager em = emf.createEntityManager();
		System.out.println( LocalDateTime.of(date, LocalTime.of(0,0,0)));
		System.out.println(LocalDateTime.of(date, LocalTime.of(23,59,59)));
		Query q = em.createQuery("select t from Transaction as t where t.account.acno=:ac and t.dateAndTime between :dt1 and :dt2 ");
		q.setParameter("ac",id);
		q.setParameter("dt1", LocalDateTime.of(date, LocalTime.of(0,0,0)));
		q.setParameter("dt2", LocalDateTime.of(date, LocalTime.of(23,59,59)));
		q.setMaxResults(5);
		List<Transaction> li = q.getResultList();
		em.close();
		emf.close();
		return li;
	}
}
