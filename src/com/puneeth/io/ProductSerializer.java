package com.puneeth.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ProductSerializer {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		FileOutputStream fo = new FileOutputStream("C:\\Users\\puneeth.narayana\\Desktop\\MSViz\\Training\\product.dat");
		ObjectOutputStream oostream = new ObjectOutputStream(fo);

		Product p = new Product("Ecosport", 1100000);
		oostream.writeObject(p);
		oostream.close();

		FileInputStream fistream = new FileInputStream("C:\\Users\\puneeth.narayana\\Desktop\\MSViz\\Training\\product.dat");
		ObjectInputStream oistream = new ObjectInputStream(fistream);
		Object obj = oistream.readObject();
		System.out.println(obj);
		oistream.close();

	}
}