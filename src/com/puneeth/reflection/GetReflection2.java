package com.puneeth.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class GetReflection2 {
public static void main(String[] args) throws
ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
	String className = "com.puneeth.reflection.Greeting";
	Class cls = Class.forName(className);
	System.out.println(cls);
	
	Constructor gc = cls.getConstructor(String.class);
	System.out.println(gc);
	
	Object obj = gc.newInstance("Bien Venue");
	System.out.println(obj);
	
	
}
}
