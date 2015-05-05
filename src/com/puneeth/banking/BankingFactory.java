package com.puneeth.banking;

public final class BankingFactory {
	private BankingFactory(){
		
	}
	
	public static Banking openAccount(String holder, String acType){
		Banking ac = null;
		if (acType.equalsIgnoreCase("Savings"))	{
			ac = new Savings(holder);
		}
		else {
			ac = new Current(holder);
		}
		
		return ac;
	}
}
