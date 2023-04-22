package com.cyr.jdbc;

import java.sql.*;

public class DatabaseMetadata {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/timepass", "root", "admin123");
			DatabaseMetaData dbmb = con.getMetaData();
			System.out.println("Driver Name:" + dbmb.getDriverName());
			System.out.println("Driver Version:" + dbmb.getDriverVersion());
			System.out.println("User Name:" + dbmb.getUserName());
			System.out.println("Database Product Name:" + dbmb.getDatabaseProductName());
			System.out.println("Database Product Version:" + dbmb.getDatabaseProductVersion());
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
