package com.lti.test;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.lti.dao.GenericDao;
import com.lti.model.Cart;
import com.lti.model.Item;
import com.lti.service.CartService;

public class CartTest {

	@Test
	public void test() {
		CartService cs = new CartService();
		cs.inputCart();
	
	}

}
