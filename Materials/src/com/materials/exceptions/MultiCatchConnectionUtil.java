package com.materials.exceptions;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MultiCatchConnectionUtil {
		/**
		 * This method returns the database connection
		 * 
		 * @return
		 */
		public static Connection getConnection() {

			String url = "jdbc:mysql://localhost:3306/training_db";
			String username = "root";
			String password = "root";
			Connection connection = null;

			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				connection = DriverManager.getConnection(url, username, password);
			} catch (SQLException | ClassNotFoundException e) {
				e.printStackTrace();
			} 
			
			return connection;
		}
}
