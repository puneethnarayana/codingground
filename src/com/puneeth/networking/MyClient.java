package com.puneeth.networking;

import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class MyClient {
public static void main(String[] args) throws UnknownHostException, IOException {
	
	//Connecting to server at given server and port
	Socket socket = new Socket("10.40.7.254",9876);
	
	//Getting Input stream from the Socket
	InputStream istream = socket.getInputStream();
	byte[] msg = new byte[100];
	istream.read(msg);
	
	System.out.println("server message be like: "+ new String(msg));

	
}
}
