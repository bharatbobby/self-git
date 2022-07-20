package com.training.jdbc;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Connection;

public class JdbcDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:orcl";
			String username = "scott";
			String pwd = "tiger";
			Connection conn = DriverManager.getConnection(url, username, pwd);
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("Select * from EMP");
			
			while(rs.next()) {
				System.out.println("Prod id: "+ rs.getString(1)+" Prod Name: "+rs.getString(2));
			}
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		

	}

}
