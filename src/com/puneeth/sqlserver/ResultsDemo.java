package com.puneeth.sqlserver;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class ResultsDemo {
	public static void main(String[] args) {
		Connection conn = null;
		Scanner s = new Scanner(System.in);
		String sql = s.nextLine();
		//String sql = "Select * from [dbo].[test_Product]";

		try {
			conn = JDBCFactory.getConnection();
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			ResultSetMetaData rsmd = rs.getMetaData();
			
			int cols = rsmd.getColumnCount();
			
			for (int i = 0; i < cols; i++) {
				System.out.print(rsmd.getColumnName(i+1)+"\t");
			}
			System.out.println();
			//System.out.print(rsmd.getColumnName(1)+"\t"+rsmd.getColumnName(2)+"\t"+rsmd.getColumnName(3));
			
//			while(rs.next()){
//				System.out.println(rs.getInt(1)+"\t\t"+rs.getString(2)+"\t\t"+rs.getInt(3));
//			}
			
			while(rs.next()){
			for (int i = 0; i < cols; i++) {
				System.out.print(rs.getString(i+1)+"\t\t");
			}
			System.out.println();
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally{
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
