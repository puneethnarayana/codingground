package com.puneeth.sqlserver;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ProductDAOImpl implements ProductDAO{

	Connection conn = null;

	String sql = "insert into [dbo].[test_Product] values (?,?)";

	@Override
	public void persist(ProductPOJO p)  {
		try {
			conn = JDBCFactory.getConnection();
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, p.getProductName());
			pstmt.setInt(2, p.getQuantity());
			pstmt.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			if(conn!=null)
				try {
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
	}

	@Override
	public void persist(List<ProductPOJO> ps) {
		try {
			for (ProductPOJO p : ps) {
				conn = JDBCFactory.getConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql);
				pstmt.setString(1, p.getProductName());
				pstmt.setInt(2, p.getQuantity());
				pstmt.execute();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally{
			if(conn!=null)
				try {
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
	}

	@Override
	public List<ProductPOJO> fetch()  {

		List<ProductPOJO> products = new ArrayList<>();

		String sql2 = "SELECT * FROM [dbo].[test_Product]";
		try {
			conn = JDBCFactory.getConnection();
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql2);
			ResultSetMetaData rsmd = rs.getMetaData();



			while(rs.next()){
				ProductPOJO pj = new ProductPOJO();
				pj.setProductID(rs.getInt(1));
				pj.setProductName(rs.getString(2));
				pj.setQuantity(rs.getInt(3));
				products.add(pj);
				//System.out.println();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
			if(conn!=null)
				try {
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}

		return products;
	}

}
