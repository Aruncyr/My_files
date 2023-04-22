package com.cyr.jdbc;

import java.io.File;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class StoreFile {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/timepass", "root", "admin123");
			PreparedStatement ps = con.prepareStatement("insert into FileTable value(?,?)");
			File f = new File("D:\\JAVA_PRACTICE\\javadoc\\myfile.txt");
			FileReader fr = new FileReader(f);
			ps.setInt(1, 101);
			ps.setCharacterStream(2, fr, (int) f.length());
			int i = ps.executeUpdate();
			System.out.println(i + "records affected");
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
