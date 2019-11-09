package com.lti.test;


import org.junit.Test;

import com.lti.dao.UserAddressDao;
import com.lti.model.Address;
import com.lti.model.User;

public class updateTest {
////
//	@Test
//	public void test() {
//		User u = new User();
//		
//		u.setName("mallesh");
//		u.setPassword("pass");
//		u.setEmail("abc");
//		UserAddressDao ad = new UserAddressDao();
//		ad.addUser(u);
//	}
//	@Test
//	public void address(){
//		UserAddressDao dao = new UserAddressDao();
//		User u = dao.fetchUser(22);
//		Address add = new Address();
//		add.setCity("mumbai");
//		add.setPincode(400035);
//		add.setU(u);
//		dao.save(add);
//		
//		
//	}
	@Test
	public void addUserandAddress(){
User u = new User();
//User u1 = new User();
UserAddressDao dao = new UserAddressDao();
		u.setName("Pranit");
		u.setPassword("pass");
		u.setEmail("abc1123");
		Address add = new Address();
		add.setCity("mumbai");
		add.setPincode(400035);
		add.setU(u);
		dao.save(add);
	}

}
