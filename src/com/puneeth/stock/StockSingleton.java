package com.puneeth.stock;

import com.puneeth.banking.Current;
import com.puneeth.banking.Savings;

public final class StockSingleton {
	private StockSingleton(){
		
	}
	
	private static Stock stock;
	
	public final static Stock getStock()
	{
	if(stock == null)
		stock = new Stock();
	
	return stock;
	}
}
