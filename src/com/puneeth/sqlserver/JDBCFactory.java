package com.puneeth.sqlserver;

import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public final class JDBCFactory {
	private static Properties prop;
	
	static {
		prop = new Properties();
		try {
			prop.load(new FileReader("src/dbinfo.properties"));
			Class.forName(prop.getProperty("driver.class"));
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	private JDBCFactory() throws ClassNotFoundException {
	
	}

	public static Connection getConnection() throws SQLException{
		Connection conn = null;
		conn = DriverManager.getConnection(prop.getProperty("conn.string")
				,prop.getProperty("user.name")
				,prop.getProperty("pass.word"));
		return conn;
	}
	
}
