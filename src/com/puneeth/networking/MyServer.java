package com.puneeth.networking;

import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class MyServer {
public static void main(String[] args) throws IOException {
	//Config Server Socket
	ServerSocket server = new ServerSocket(9876);
	System.out.println("Server starts...");
	
	//Ready to accept conn
	Socket socket = server.accept();
	
	//Getting the OutputStream of the socket
	OutputStream ostream = socket.getOutputStream();
	
	//Writing the message bytes to the client
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Message");
	ostream.write(sc.nextLine().getBytes());
	System.out.println("Message a parti pour le client...");
}
}
