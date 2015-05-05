package com.puneeth.threading;

public class SleepingThread extends Thread{
	
	private String msg;
	
	public SleepingThread(String msg) {
		this.msg = msg;
	}
	
	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println(msg);
			//yield();
			try {
				sleep(1);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
	
	public static void main(String[] args) {
		SleepingThread st = new SleepingThread("Hello");
		SleepingThread st1 = new SleepingThread("World");
		
		st.start();
		st1.start();
	}


}
