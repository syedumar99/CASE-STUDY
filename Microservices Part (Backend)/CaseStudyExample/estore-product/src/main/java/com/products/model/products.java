package com.products.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class products {
	
	@Id
	private long id;
	private String title;
	private double price;
	private String descprition;
	private String category;
	private String image;
	
	
	public products(){}


	public products(long id, String title, double price, String descprition, String category, String image) {
		super();
		this.id = id;
		this.title = title;
		this.price = price;
		this.descprition = descprition;
		this.category = category;
		this.image = image;
	}


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public String getDescprition() {
		return descprition;
	}


	public void setDescprition(String descprition) {
		this.descprition = descprition;
	}


	public String getCategory() {
		return category;
	}


	public void setCategory(String category) {
		this.category = category;
	}


	public String getImage() {
		return image;
	}


	public void setImage(String image) {
		this.image = image;
	}
}


	