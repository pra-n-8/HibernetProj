package com.lti.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.lti.model.Person;
import com.lti.model.User;

public class GenericDao {
	public void insert(Object obj) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("oracleTest");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		et.begin();
		em.merge(obj);
		et.commit();
		em.close();
		emf.close();
	}
	
	public Object fetchById(Class cls,Object pk){
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("oracleTest");
		EntityManager em = emf.createEntityManager();
		// find method generates select query
		// table name pk
		Object obj = em.find(cls, pk);

		em.close();
		emf.close();

		return obj;
	}
	


		// TODO Auto-generated method stub	
}
