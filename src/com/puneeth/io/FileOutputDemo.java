package com.puneeth.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputDemo {
	public static void main(String[] args) {
		FileOutputStream ostream = null;
		try {
			ostream = new FileOutputStream("C:\\Users\\puneeth.narayana\\Desktop\\MSViz\\Training\\Te.txt",true);
			ostream.write(args[0].getBytes());
			ostream.close();
			System.out.println("Content written");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally{
			try {
				if(ostream != null)
				{
					ostream.close();
					System.out.println("Stream be close sire!");
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
