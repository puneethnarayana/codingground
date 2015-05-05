package com.puneeth.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ConsoleInput {
public static void main(String[] args) throws IOException {
	Scanner s = new Scanner(System.in);
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	System.out.print("Enter your player : ");
	//String name = s.nextLine();
	String name = br.readLine();
	System.out.println("And the MVP is : " + name);
	
	System.out.print("Coach of the season : ");
	//String coach = s.nextLine();
	String coach = br.readLine();
	System.out.println("And the MV-Coach is : " + coach);
	
	s.close();
}
}
