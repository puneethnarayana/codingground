package com.puneeth.threading;

import java.awt.DisplayMode;

public class Synchronization implements Runnable {

	private Object obj;
	
	@Override
	public void run() {
			String tname = Thread.currentThread().getName();
			display(tname);
	}

	public synchronized void display(String name){
		try {
			synchronized (obj) {
				System.out.println("[");
				Thread.sleep(100);
				System.out.println(name);
				Thread.sleep(100);
				System.out.println("]");
				}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}
	
	public static void main(String[] args) {
		Synchronization sync = new Synchronization();
		
		Thread t1 = new Thread(sync,"t1");
		Thread t2 = new Thread(sync,"t2");
		Thread t3 = new Thread(sync,"t3");
		
		t1.start();
		t2.start();
		t3.start();

 	}

}
