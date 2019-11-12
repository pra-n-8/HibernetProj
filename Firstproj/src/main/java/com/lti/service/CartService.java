package com.lti.service;

import java.util.ArrayList;
import java.util.List;

import com.lti.dao.GenericDao;
import com.lti.model.Cart;
import com.lti.model.Item;

public class CartService {
 public void inputCart() {
	 GenericDao gd=new GenericDao();
	 Item i = new Item();
		i.setQuantity(92);
		Item i1 = new Item();
		i1.setQuantity(815);
		Item i2 = new Item();
		i2.setQuantity(5394);
		Item i3 = new Item();
		i3.setQuantity(235);
		Cart c = new Cart();
		c.setTotal(8235);
		List<Item> liCart = new ArrayList<Item>();
		liCart.add(i);
		liCart.add(i1);
		liCart.add(i2);
		liCart.add(i3);
		c.setItems(liCart);
		i.setCart(c);
		i1.setCart(c);
		i2.setCart(c);
		i3.setCart(c);
	 gd.insert(c);
 }
}
