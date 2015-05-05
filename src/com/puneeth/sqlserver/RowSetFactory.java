package com.puneeth.sqlserver;

import java.sql.SQLException;

import javax.sql.rowset.*;
import javax.sql.rowset.RowSetProvider;

public class RowSetFactory {
public static void main(String[] args) throws SQLException {
	javax.sql.rowset.RowSetFactory rsfact = RowSetProvider.newFactory();
	JdbcRowSet jrs = rsfact.createJdbcRowSet();
	
	
	jrs.setUrl("jdbc:sqlserver://localhost:1433;databaseName=Adventure");
	jrs.setUsername("sa");
	jrs.setPassword("password1!");
	jrs.setCommand("Select * from [dbo].[test_Product]");
	jrs.execute();
	
	while(jrs.next())
	{
		System.out.println(jrs.getString(2));
	}
}
}
