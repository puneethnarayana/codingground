package com.puneeth.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputDemo {
	public static void main(String[] args) throws IOException {
		FileInputStream istream = null;
		
		File f = new File("C:\\Users\\puneeth.narayana\\Desktop\\MSViz\\Training\\Te.txt");
		
		if(f.exists() && f.canRead())
		{
			istream  = new FileInputStream(f);
			byte[] bar = new byte[istream.available()];
			istream.read(bar);
			System.out.println(new String(bar));
			
			int b=0;
			while (true) {
				b=istream.read();
				if (b==-1){
					break;
				}
				System.out.print((char)b);
			}
		}
		else{
			try {
				if(istream == null)
				{
					istream.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}
