package com.lti.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.lti.model.Customer;

//DAO Class also called as  design pattern
public class CustomerDao 
{
	  public void insert(Customer customer)
	  {
		  //Step 1. Load /Create EntityManagerFactory Object
		  //During this step, MEAT-INF/Persistence.xml
		  //file will read auto 
		  EntityManagerFactory emf=Persistence.createEntityManagerFactory("oracleTest"); //persistence.xml file  copy this line persistence-unit name="oracleTest"
		  
		  //Step 2.Load/Create EntityManager Object
		  EntityManager em=emf.createEntityManager();
		  
		  //Step  3.participate/start the transcation
		  EntityTransaction tx=em.getTransaction();
		  tx.begin();
		  
		  //Now we can insert/update/delete 
		  //persist method generates insert query for us
		  em.persist(customer); 
		  tx.commit();
		  em.close();
		  emf.close();
	  }
	  

	  public void delete(Customer customer)
	  {
		  //Step 1. Load /Create EntityManagerFactory Object
		  //During this step, MEAT-INF/Persistence.xml
		  //file will read auto 
		  EntityManagerFactory emf=Persistence.createEntityManagerFactory("oracleTest"); //persistence.xml file  copy this line persistence-unit name="oracleTest"
		  
		  //Step 2.Load/Create EntityManager Object
		  EntityManager em=emf.createEntityManager();
		  
		  //Step  3.participate/start the transcation
		  EntityTransaction tx=em.getTransaction();
		  tx.begin();
		  
		  //Now we can insert/update/delete 
		  //persist method generates insert query for us
		  em.remove(customer); 
		  tx.commit();
		  em.close();
		  emf.close();
	  }


	public Customer fetch(int custId) 
	{
	
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("oracleTest");
		 EntityManager em=emf.createEntityManager();
		  //find method generates select query
		 					  //table name		pk	
		 Customer cust=em.find(Customer.class,custId);

		 em.close();
		  emf.close();
		  
		  
		  return cust;
	}
	
	public List<Customer> fetchbyCity(String City)
	{
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("oracleTest");
		 EntityManager em=emf.createEntityManager();
		  //find method to search by city
		 
		 Query q = em.createQuery("select c from Customer as c where c.custCity=:ct");
		 q.setParameter("ct",City);
		 List<Customer> customers=q.getResultList();
		 em.close();
		  emf.close();
		  
		  return customers;

	}
	
	
	

}