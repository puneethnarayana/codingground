package com.puneeth.threading;

import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Domains implements Runnable{
	private ArrayList<String> domain;

	public Domains() {
		domain = new ArrayList<String>();
		domain.add("Google");
		domain.add("Yahoo");
		domain.add("Bing");
	}

	@Override
	public void run() {
		for (String string : domain) {
			System.out.println(string);
		}		
	}
}

public class ThreadPooling {
	public static void main(String[] args) {
		//Configure the Pool
		ExecutorService es = Executors.newFixedThreadPool(10);

		//Runnable Object
		Domains d = new Domains();

		//Pulls a Thread frmo pool and execute with specified Runnable Object
		es.execute(d);
	}
}
