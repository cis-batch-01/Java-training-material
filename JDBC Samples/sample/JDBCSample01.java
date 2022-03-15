package com.jdbcsample.sample;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCSample01 {
	public static void main(String[] args) {
		
		String url="jdbc:mysql://localhost:3306/sample";    //jdbc:oracle:thin@localhost:1521:xe
		String userName="root";
		String pass="root";
		String query="insert into sample (name) values('yasin')";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");//rigister driver
			
			Connection con=DriverManager.getConnection(url, userName,pass); //get Connection
			
			Statement stmt=con.createStatement();//run the query
			
			int res=stmt.executeUpdate(query);
			System.out.println(res>0?"Value inserted":"not inserted");
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
