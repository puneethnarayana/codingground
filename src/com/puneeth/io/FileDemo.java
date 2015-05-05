package com.puneeth.io;

import java.io.File;
import java.util.Date;

public class FileDemo {

	public static void main(String[] args) {
		File f = new File("C:\\Users\\puneeth.narayana\\Desktop\\MSViz\\Training");
		
		if(f.exists()){
		System.out.println(f.getName());
		System.out.println(f.getParent());
		
		if(f.isFile()){
			System.out.println(f.canRead());
			System.out.println(f.canWrite());
			System.out.println(new Date(f.lastModified()));
		}else{
			String[] list = f.list();
			File[] files = f.listFiles();
			
			for (String file : list) {
				
				System.out.println(file);
			}
		}
		}
		else{
			System.out.println("File No Exist Ma!");
		}
	}

}
