package com.puneeth.threading;

public class MyThread extends Thread {
	private int counter;

	@Override
	public void run() {
		String tname = Thread.currentThread().getName();
		for(int i=0;i<101;i++)
		{
			System.out.println("Counter  Name: "+tname +" Value: "+ ++counter);
		}
	}
	
	public static void main(String[] args) {
		MyThread mt1 = new MyThread();
		MyThread mt2 = new MyThread();
		
		mt1.setName("Ondu");
		mt2.setName("Yeradu");
		
		mt2.setPriority(MAX_PRIORITY);
		
		mt1.start();
		mt2.start();
	}
	
}
