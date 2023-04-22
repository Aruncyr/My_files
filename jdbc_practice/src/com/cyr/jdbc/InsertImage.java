package com.cyr.jdbc;

import java.sql.*;
import java.io.*;

public class InsertImage {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/timepass", "root", "admin123");
			PreparedStatement ps = con.prepareStatement("insert into imgtable1 values(?,?)");
			ps.setString(1, "Sonoo");
			FileInputStream fin = new FileInputStream("D:\\JAVA_PRACTICE\\img\\java.jpg");
			ps.setBinaryStream(2, fin, fin.available());
			int i = ps.executeUpdate();
			System.out.println(i + "records affected");
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
