package com.puneeth.banking;

import java.util.ArrayList;

public abstract class Account implements Banking {
	private int acntNo;
	private String holder;
	protected double balance; 
	
	//Auto generation of account code
	private static int autogen;
	
	static {
		autogen = INIT_AC_NO;
	}
	
	//Transaction of statements code
	protected ArrayList<Transaction> txns;
	protected int idx;

	public Account() {
		//super();
//		acntNo = -1;
//		holder = "Unknown";
//		balance = 0.0;
		this("Unknown",0.0);
	}
	
	public Account(String holder, double balance){
		this.acntNo = autogen++;
		this.holder = holder;
		this.balance = balance;
		//Transaction Code
		txns = new ArrayList<Transaction>();
		txns.add(new Transaction("OB",balance,balance));
	}
	
	public void deposit(double amount){
		balance += amount;
		txns.add(new Transaction("CR",amount,balance));
	}
	
//	public void withdraw(double amount){
//		if(balance > amount )
//		{
//			balance -= amount;
//		}
//		else
//		{
//			System.out.println("Insufficient Balance");
//		}
//	}
	
	//public abstract void withdraw(double amount);

	public void summary(){
		System.out.println("AC no: "+acntNo);
		System.out.println("Holder: "+holder);
		System.out.println("Balance: "+balance);
	}
	
	public void statement(){
		System.out.println("Statement of A/C No: "+acntNo );
		for (int i = 0; i < txns.size(); i++) {
			System.out.println(txns.get(i));
		}
		
	}
}
