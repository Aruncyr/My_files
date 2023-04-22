package com.cyr.jdbc;

import java.io.FileWriter;
import java.io.Reader;
import java.sql.Clob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class RetriveFile {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/timepass", "root", "admin123");
			PreparedStatement ps = con.prepareStatement("select * from FileTable");
			ResultSet rs = ps.executeQuery();
			rs.next();
			Clob b = rs.getClob(2);
			Reader r = b.getCharacterStream();
			FileWriter fw = new FileWriter("d:\\retrivefile.txt");
			int i;
			while ((i = r.read()) != -1)
				fw.write((char) i);
			fw.close();
			con.close();
			System.out.println("success");

		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
