package com.thoro;

public class Manager extends Employee {

	private double commission;

	public Manager() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Manager(String empName, double salary, double commission) {
		//Calling the constructor of super class with matching signature
		super(empName, salary);
		// TODO Auto-generated constructor stub
		this.commission = commission;
	}

	@Override
	public void PaySlip() {
		// TODO Auto-generated method stub
		super.PaySlip();
		System.out.println("Commission: "+commission);
	}

	@Override
	public double getSalary() {
		// TODO Auto-generated method stub
		return super.getSalary() + commission;
	}
	
	
}
