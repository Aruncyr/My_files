package com.cyr.jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;

public class CallableStatement1 {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/timepass", "root", "admin123");
			CallableStatement stmt = con.prepareCall("{call insertR(?,?,?)}");
			stmt.setInt(1, 1013);
			stmt.setString(2, "Pradeep");
			stmt.setInt(3, 30);
			stmt.execute();
			System.out.println("success");
			con.close();

		} catch (Exception e) {System.out.println(e);
		}

	}
}