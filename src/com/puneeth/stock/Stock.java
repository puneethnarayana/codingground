package com.puneeth.stock;

public class Stock implements Exchange {

	@Override
	public void get() {
		// TODO Auto-generated method stub
		System.out.println("Inside get");
	}

	@Override
	public void view() {
		// TODO Auto-generated method stub
		System.out.println("Inside View");
	}

	@Override
	public void set() {
		// TODO Auto-generated method stub
		System.out.println("Inside Set");
	}
}
