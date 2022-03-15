package com.jdbcsample.sample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JdbcSamplePreparedStatement {
	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sample","root","root");
			
			String query="update sample set name=? where id=?";
			
			PreparedStatement pstmt=con.prepareStatement(query);
			pstmt.setString(1, "arun");
			pstmt.setInt(2, 1);
			
			int res=pstmt.executeUpdate();
			System.out.println(res>0?"value updated":"not updated");
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
