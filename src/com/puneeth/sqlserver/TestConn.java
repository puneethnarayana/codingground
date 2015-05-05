package com.puneeth.sqlserver;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.microsoft.sqlserver.jdbc.SQLServerDriver;

public class TestConn {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		
		//String url = "jdbc:sqlserver://localhost:1433;integratedSecurity=true;";
	//	Connection conn = null;
        try {
        	Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        	String connectionUrl = "jdbc:sqlserver://localhost:1433;databaseName=Adventure";
        	System.out.println("aa");
        	Connection con = DriverManager.getConnection(connectionUrl,"sa","password1!");
        	System.out.println("bb");
       
        	DatabaseMetaData dbData = con.getMetaData();
        	System.out.println("DB Name: "+dbData.getDatabaseProductName());
        	System.out.println("DB Version: "+dbData.getDatabaseProductVersion());
        	System.out.println("Driver Name: "+dbData.getDriverName());
        	System.out.println("Driver Version: "+dbData.getDriverVersion());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//        finally{
//        	if(con!=null)
//        		con.close();
//        }
        }

	}

