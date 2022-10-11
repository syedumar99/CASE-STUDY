package com.order.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Orders {
	
	@Id
	private long order_id;
	private String user_address;
	private double payment;
	
	
	public Orders(){}


	public Orders(long order_id, String user_address, double payment) {
		super();
		this.order_id = order_id;
		this.user_address = user_address;
		this.payment = payment;
	}


	public long getOrder_id() {
		return order_id;
	}


	public void setOrder_id(long order_id) {
		this.order_id = order_id;
	}


	public String getUser_address() {
		return user_address;
	}


	public void setUser_address(String user_address) {
		this.user_address = user_address;
	}


	public double getPayment() {
		return payment;
	}


	public void setPayment(double payment) {
		this.payment = payment;
	}
	

	}