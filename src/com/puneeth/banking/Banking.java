package com.puneeth.banking;

/**
 * 
 * The Root interface for the banking application
 * @author Puneeth.Narayana
 * @version 1.0
 */
public interface Banking {
	/**
	 * This Method writes out a summary for the account
	 */
	void summary();
	void deposit(double amount);
	void withdraw(double amount) throws BalanceException;
	
	/**
	 * Statement Method. This prints the statement of transactions for the method.
	 */
	void statement();
	
	/**
	 * Initializes the auto generate Account no
	 */
	int INIT_AC_NO = 1001;
	double INIT_SAV_BAL =1000;
	double INIT_CURR_BAL = 5000;
	double INIT_OD_AMT = 10000;
}
