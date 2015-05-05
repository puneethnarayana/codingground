package com.puneeth.threading;

public class DaemonThread extends Thread {
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
		MyThread mt3 = new MyThread();
		MyThread mt4 = new MyThread();
		
		mt1.setName("Ondu");
		mt2.setName("Yeradu");
		//mt3.setName("Mooru");
		mt4.setName("Daemon");
		
		//mt2.setPriority(MAX_PRIORITY);
		mt4.setDaemon(true);
		
		mt1.start();
		mt2.start();
		//mt3.start();
		mt4.start();
	}

	public DaemonThread(String name, int counter) {
		super(name);
		this.counter = counter;
	}
}
