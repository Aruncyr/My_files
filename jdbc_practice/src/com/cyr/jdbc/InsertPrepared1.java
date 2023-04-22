package com.cyr.jdbc;
//this is used to insert in the record
import java.sql.*;

public class InsertPrepared1 {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/timepass", "root", "admin123");
			PreparedStatement stmt = con.prepareStatement("insert into emp values(?,?)");
			stmt.setInt(1, 101);
			stmt.setString(2, "Ratan");
			int i = stmt.executeUpdate();
			System.out.println(i + "records inserted");
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
