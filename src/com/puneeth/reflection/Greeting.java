package com.puneeth.reflection;

import java.security.BasicPermission;

public class Greeting {
	@Override
	public String toString() {
		return "Message be like: "+message;
	}

	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Greeting(){
	}
	
	public Greeting(String message) {
		//super();
		this.message = message;
	}

	private void print(){
		SecurityManager scm = new SecurityManager();
		scm.checkPermission(new BasicPermission("private Method") {
			
		});
		System.out.println("Le Message: "+message);
	}
}
