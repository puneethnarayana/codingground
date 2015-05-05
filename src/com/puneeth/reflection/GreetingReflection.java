package com.puneeth.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class GreetingReflection {
	public static void main(String[] args) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Greeting greet = new Greeting("Bon Jour");
		System.out.println(greet.getMessage());

		System.out.println(greet.getClass());
		Class<? extends Greeting> gc = greet.getClass();
		System.out.println(gc);

		Constructor[] constructs = gc.getConstructors();
		for (Constructor constructor : constructs) {
				System.out.println(constructor);
		}
		
		System.out.println("-----Printing Les Methods-----------");
		//Method[] methods = gc.getMethods();
		Method[] methods = gc.getDeclaredMethods();
		for (Method method : methods) {
			System.out.println(method.getName());
		}
		
		System.out.println("-------Invoking methods---------------");
		Method method = gc.getDeclaredMethod("toString", null);
	//	method.setAccessible(true);
		System.out.println(method.getName());
		System.out.println(method.invoke(greet, null));
		
		System.out.println("-----Printing Les Fields-----------");
		Field[] fields = gc.getDeclaredFields();
		
		for (Field field : fields) {
			System.out.println(field);
		}
	}
}
