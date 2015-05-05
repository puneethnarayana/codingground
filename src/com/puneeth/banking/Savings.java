package com.puneeth.banking;

public class Savings extends Account {

	public Savings() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Savings(String holder) {
		super(holder, INIT_SAV_BAL);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void withdraw(double amount) throws BalanceException {
		// TODO Auto-generated method stub
		if(balance >= amount + INIT_SAV_BAL)
		{
			balance -= amount;
			txns.add(new Transaction("DR",amount,balance));
		}
		else
		{
			throw new BalanceException("Insufficient Balance");
		}
	}

}
