package com.puneeth.threading;

public class MyRunnable implements Runnable {
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
		MyRunnable mr = new MyRunnable();
		
		Thread c1 = new Thread(mr,"First");
		Thread c2 = new Thread(mr,"Second");
		
		c1.start();
		c2.start();
	}
	
}
