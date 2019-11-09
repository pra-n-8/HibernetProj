package com.lti.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.lti.model.Address;
import com.lti.model.Customer;
import com.lti.model.User;

public class UserAddressDao {
	public void addUser(User u) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("oracleTest");
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		em.persist(u);
		tx.commit();
		em.close();
		emf.close();
	}

	public void save(Address address) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("oracleTest");
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		em.persist(address);
		tx.commit();
		em.close();
		emf.close();

	}

	public User fetchUser(int uid) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("oracleTest");
		EntityManager em = emf.createEntityManager();
		// find method generates select query
		// table name pk
		User cust = em.find(User.class, uid);

		em.close();
		emf.close();

		return cust;
	}
	
	
}