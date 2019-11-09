package com.lti.test;



import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import com.lti.dao.CustomerDao;
import com.lti.model.Customer;

public class CustomerTest {

	@Test
	public void testSave() {
		Customer cust = new Customer();
		cust.setCustName("cName");
		cust.setCustCity("cCity");
		
		CustomerDao dao = new CustomerDao();
		dao.insert(cust);
		//fail("Not yet implemented");
	}
	@Test(expected=NullPointerException.class)
	public void CustomerFetch(){
		CustomerDao dao=new CustomerDao();
		Customer cust=dao.fetch(121);
		//assertNotNull(cust);
		//no printlns,we shuld use assert instead
		System.out.println(cust.getCustName());
		System.out.println(cust.getCustCity());
		
	}

}
