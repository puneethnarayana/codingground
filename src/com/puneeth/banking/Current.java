package com.puneeth.banking;

public class Current extends Account {
	private double overDraft = INIT_OD_AMT;

	@Override
	public void deposit(double amount) {
		if(overDraft<INIT_OD_AMT)
		{	
			if(amount < (INIT_OD_AMT-overDraft))
			{
				overDraft += amount;
				txns.add(new Transaction("CR",amount,balance));
			}
			else {
				balance = amount - (INIT_OD_AMT - overDraft);
				overDraft = INIT_OD_AMT;
				txns.add(new Transaction("CR",amount,balance));
			}
		}
		else
		{
			balance += amount;
			txns.add(new Transaction("CR",amount,balance));
		}
	}

	@Override
	public void withdraw(double amount) throws BalanceException {
		if(balance >= amount)
		{
			balance -= amount;
			txns.add(new Transaction("DR",amount,balance));
		}
		else{ 
			if(amount >= (overDraft + balance)){
				throw new BalanceException("Insufficient Funds cannot withdraw");
				}
			if(balance == 0 && amount<= overDraft){
				overDraft  -= amount;
				txns.add(new Transaction("DR",amount,balance));
			}
			else if(amount-balance >0 && amount <= (balance + overDraft) ){
				overDraft = overDraft - (amount - balance);
				balance = 0;
				txns.add(new Transaction("DR",amount,balance));
			}
		}
	}

	@Override
	public void summary() {
		super.summary();
		System.out.println("OverDraft :" +overDraft);
	}

	public Current() {
		super();
	}

	public Current(String holder) {
		super(holder, INIT_CURR_BAL);
	}
}
