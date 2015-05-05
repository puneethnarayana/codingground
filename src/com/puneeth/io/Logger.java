package com.puneeth.io;

import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Logger {

	String path = "C:\\Users\\puneeth.narayana\\Desktop\\MSViz\\Training\\";
	static Date date = new Date();
	static SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss") ;
	String totalFilePath = path +"Log_"+ dateFormat.format(date)+ ".txt";
	FileWriter fostream = null;
	static BufferedWriter bwriter = null;
	
	public Logger(String message) throws IOException {
		 fostream = new FileWriter(totalFilePath,true);
		
		 bwriter = new BufferedWriter(fostream);
		// log(message,bwriter);
		//close();		
	}
	
	
		
	public static void log(String logmessage) throws IOException{
		bwriter.write(logmessage+" Date: "+ dateFormat.format(date));
		bwriter.newLine();
	}
	
	public static void close() throws IOException{
		 bwriter.close();
		// fostream.close();
		
	}
	
	
}
