package com.puneeth.threading;

import java.util.ArrayList;
import java.util.Iterator;

class Data{
	private String fruit;
	private boolean flag;

	public synchronized void setFruit(String fruit) throws InterruptedException{
		if (flag) {
			wait();
		}
		this.fruit = fruit;
		System.out.println("fruit : "+fruit+" be available");
		notify();
		flag = !flag;
	}

	public synchronized String getFruit() {
		if(!flag){
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Fruit be consumed: "+fruit);
		notify();
		flag = !flag;
		return fruit;
	}	
}

class Producer extends Thread{
	private ArrayList<String> fruits;
	private Data data;

	public Producer(Data data){
		fruits = new ArrayList<String>();
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Orange");
		fruits.add("Banana");
		this.data = data;		
	}

	@Override
	public void run() {
		Iterator<String> itr = fruits.iterator();
		while (itr.hasNext()) {
			try {
				data.setFruit(itr.next());
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class Consumer extends Thread{
	private Data data;
	public Consumer(Data data) {
		super();
		this.data = data;
	}

	@Override
	public void run() {
		while(true){
			data.getFruit();
		}
	}
}

public class InterThreadCommunication {
	public static void main(String[] args) {
		Data data = new Data();
		Producer p = new Producer(data);
		Consumer c = new Consumer(data);
		c.setDaemon(true);
		p.start();
		c.start();
	}
}
