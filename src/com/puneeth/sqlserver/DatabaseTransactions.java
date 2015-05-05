package com.puneeth.sqlserver;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Savepoint;
import java.sql.Statement;

public class DatabaseTransactions {
	public static void main(String[] args) throws SQLException {
		Connection conn = null;

		String sql1 = "insert into [dbo].[test_Product] values ('Manila',2015)";
		String sql2 = "update [dbo].[test_Product] set [Product_Quantity] = 201085 where [Product_Name] = 'Manila'";
		String sql3 = "delete from [dbo].[test_Product] where Product_Nam = 'Axe'";

		try {
			conn = JDBCFactory.getConnection();
			conn.setAutoCommit(false);
			Statement stmt = conn.createStatement();

			stmt.addBatch(sql1);
			stmt.addBatch(sql2);

			//Savepoint sp = conn.setSavepoint();

			stmt.addBatch(sql3);

			stmt.executeBatch();

			conn.commit();
		} catch (SQLException e) {
			e.printStackTrace();
			conn.rollback();
		}
		finally{
			if(conn != null)
				conn.close();
		}
	}
}
