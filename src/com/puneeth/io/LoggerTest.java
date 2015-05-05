package com.puneeth.io;

import java.io.IOException;

public class LoggerTest {
public static void main(String[] args) throws IOException {
	Logger l = new Logger(null);
	l.log("Moi Aussi");
	l.log("Moi Aussi 1");
	l.log("Moi Aussi 2");
	l.close();
}
}
 