package com.thoro;

public abstract class Employee {
	private int empNo;
	private String empName;
	private double salary;
	
	private static int autoEmployeeID;

	static {
		autoEmployeeID = 201501;
	}
	
	public void PaySlip(){
		System.out.println("empNo: "+empNo);
		System.out.println("empName: "+empName);
		System.out.println("Salary: "+salary);
	}
	
	public Employee(){
		this("John Doe",0);
	}
	
	public Employee(String empName, double salary)
	{
		this.empNo = autoEmployeeID++;
		this.empName = empName;
		this.salary = salary;
	}

	public double getSalary() {
		return salary;
	}	
}