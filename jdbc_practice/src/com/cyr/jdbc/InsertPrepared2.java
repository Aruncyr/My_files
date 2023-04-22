package com.cyr.jdbc;
//this is used to update record
import java.sql.*;

public class InsertPrepared2 {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/timepass", "root", "admin123");
			PreparedStatement stmt = con.prepareStatement("update emp set name=? where id=?");
			stmt.setString(1, "Sonoo");
			// 1 specifies the first parameter in the query i.e. name
			stmt.setInt(2, 101);
			int i = stmt.executeUpdate();
			System.out.println(i + " record updated");
		} catch (Exception e) {
			System.out.println(e);
		}

	}
}