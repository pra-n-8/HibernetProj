package com.lti.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="Table_Cart")
public class Cart {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE,
	generator="Cart_gen")
	@SequenceGenerator(
			name="Cart_gen",
			sequenceName="Cart_gen",
			initialValue=10000,
			allocationSize=1)
	
	private int id;
	
	private double total;
	
	//private User user;
	
	@OneToMany(mappedBy="cart" , cascade=CascadeType.ALL)
	private List<Item> items;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public List<Item> getItems() {
		return items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}
	

}
