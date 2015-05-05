package com.puneeth.io;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class FileWriterDemo {
	public static void main(String[] args) throws Exception{
		FileWriter writer = new FileWriter("C:\\Users\\puneeth.narayana\\Desktop\\MSViz\\Training\\FileWriterDemo.txt",true);
		BufferedWriter bwriter = new BufferedWriter(writer);
		bwriter.write("Please!");
	
		bwriter.newLine();
		bwriter.write("Dorm Room Tycoon");
		
		bwriter.close();
	}
}
