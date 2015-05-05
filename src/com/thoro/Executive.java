package com.thoro;

public class Executive extends Employee {
	
	private double benefits;

	public Executive() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Executive(String empName, double salary, double benefits) {
		super(empName, salary);
		// TODO Auto-generated constructor stub
		this.benefits = benefits;
	}

	@Override
	public void PaySlip() {
		// TODO Auto-generated method stub
		super.PaySlip();
		System.out.println("Benefits:"+benefits);
	}

	@Override
	public double getSalary() {
		// TODO Auto-generated method stub
		return super.getSalary()+benefits;
	}

}
