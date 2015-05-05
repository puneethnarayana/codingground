package com.puneeth.banking;

public class Transaction {

	private String txnType;
	private double txnAmount, balance;
	
	public Transaction(){
		super();
	}

	public Transaction(String txnType, double txnAmount, double balance) {
		//super();
		this.txnType = txnType;
		this.txnAmount = txnAmount;
		this.balance = balance;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return txnType +"  "+txnAmount+" "+balance;
	}

	public void print(){
		System.out.println(txnType +"  "+txnAmount+" "+balance);
	}
		
}
