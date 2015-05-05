package com.puneeth.InnerClasses;

public class EventDemo {

	public EventDemo(){
		firstEvent();
		secondEvent();
		thirdEvent();
	}

	private class FirstEventImpl implements Event{
		@Override
		public void doSomething() {
			System.out.println("First Event Implementation");
		}
	}

	public void firstEvent(){
		Event e1 = new FirstEventImpl();
		e1.doSomething();
	}

	//Inner class inside a Method
	public void secondEvent(){
		class SecondEventImpl implements Event{
			@Override
			public void doSomething() {
				System.out.println("Second Implementation");
			}
		}
		Event e2 = new SecondEventImpl();
		e2.doSomething();		
	}

	//Anonymous Class
	public void thirdEvent(){
		Event e3 = new Event(){
			@Override
			public void doSomething() {
				System.out.println("Troisieme Implementation");
			}
		};
		e3.doSomething();
	}
}
