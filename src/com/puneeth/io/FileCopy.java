package com.puneeth.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class FileCopy {
	public static void main(String[] args) throws IOException {
		long start = System.currentTimeMillis();
		FileInputStream fistream = new FileInputStream("C:\\Users\\puneeth.narayana\\Desktop\\Futurum\\UFO-SURFBL3N31.20150305001645.932.000248n3.S1P_12468.txt");
		FileOutputStream ostream = new FileOutputStream("C:\\Users\\puneeth.narayana\\Desktop\\MSViz\\Training\\UFO.txt");
		
		int ch=0;
		
//		BufferedInputStream bistream = new BufferedInputStream(fistream);
//		BufferedOutputStream bostream = new BufferedOutputStream(ostream);
////		
		
		FileChannel inChannel = null;
		FileChannel outChannel = null;
		
//		byte[] bar = new byte[fistream.available()];
//		fistream.read(bar);
//		//fistream.read();
//		ostream.write(bar);
//		
//		
//		while(true){
//			ch = bistream.read();
//			if(ch == -1)break;
//			bostream.write(ch);
//		}
		
//		bistream.close();
//		bostream.close();
		
		inChannel = fistream.getChannel();
		outChannel = ostream.getChannel();
		//ByteBuffer bb = ByteBuffer.allocate(1024*24);

		ByteBuffer bb = ByteBuffer.allocateDirect(1024*24);
		
		while(true){
			ch = inChannel.read(bb);
			if(ch == -1)break;
			
			bb.flip();
			outChannel.write(bb);
			bb.clear();
		}
		
		fistream.close();
		ostream.close();
		
		long end = System.currentTimeMillis();
		System.out.println("Time Taken : "+(end-start));
	}
}
