package com.puneeth.sqlserver;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdatableResult {
public static void main(String[] args) throws SQLException {
	Connection conn = null;
	String sql = "SELECT [Product_ID],[Product_Name],[Product_Quantity] FROM [Adventure].[dbo].[test_Product]";
	
	try {
		conn = JDBCFactory.getConnection();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
											ResultSet.CONCUR_UPDATABLE);
	ResultSet rs = stmt.executeQuery(sql);
	
	rs.absolute(3);
	rs.updateString(2, "nexus 5");
	
	try {
		rs.moveToInsertRow();
		rs.updateString(2,"Lens");
		rs.updateInt(3, 500);
		rs.insertRow();
		rs.moveToCurrentRow();
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
