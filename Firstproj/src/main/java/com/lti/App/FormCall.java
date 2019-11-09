package com.lti.App;

import java.util.List;

import com.lti.dao.CustomerDao;
import com.lti.model.Customer;

public class FormCall {

	public void Insert(String cName, String cCity) {
		Customer cust = new Customer();
		cust.setCustName(cName);
		cust.setCustCity(cCity);
		CustomerDao dao = new CustomerDao();
		dao.insert(cust);
	
	}
	public void Delete(String cName, String cCity, int id){
		Customer cust1 = new Customer();
		cust1.setCustId(id);
		cust1.setCustName(cName);
		cust1.setCustCity(cCity);
		CustomerDao dao = new CustomerDao();
		dao.delete(cust1);
	
	}
	public void Show(){
		CustomerDao dao = new CustomerDao();
		List<Customer> cust=dao.fetchbyCity("mumbai");
		for(Customer c : cust){
			System.out.println(c);
		}
		System.out.println(cust);
	}
	
}

