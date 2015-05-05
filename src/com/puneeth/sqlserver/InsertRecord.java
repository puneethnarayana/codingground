package com.puneeth.sqlserver;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class InsertRecord {
	public static void main(String[] args) throws SQLException {
		Connection cn = null;

		try {
			cn = JDBCFactory.getConnection();

			//		String sql = "INSERT INTO [dbo].[test_Product] values ('Nexus 4',25)";
			//		Statement stmt = cn.createStatement();
			//		stmt.executeUpdate(sql);

			String sql2 = "insert into [dbo].[test_Product] values (?,?) ";
			Scanner Scanner = new Scanner(System.in);
			PreparedStatement pstmt = cn.prepareStatement(sql2);

			System.out.println("Enter the Product Name: ");
			pstmt.setString(1, Scanner.nextLine());

			System.out.println("Enter the Quantity: ");
			pstmt.setInt(2, Scanner.nextInt());

			pstmt.execute();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
			try {
				if(cn!=null)
					cn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
