package com.puneeth.io;
import java.io.Serializable;


public class Product implements Serializable{

	private String name;
	private double price;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Product() {
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Product(String name, double price) {
		//super();
		this.name = name;
		this.price = price;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Name: "+name+ " Price: "+price;
	}
	
	
}
