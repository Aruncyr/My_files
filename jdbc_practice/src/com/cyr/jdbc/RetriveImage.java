package com.cyr.jdbc;

import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.mysql.cj.jdbc.Blob;

public class RetriveImage {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/timepass", "root", "admin123");
			PreparedStatement ps = con.prepareStatement("select * from imgtable1");
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				Blob b = (Blob) rs.getBlob(2);
				byte barr[] = b.getBytes(1, (int) b.length());
				FileOutputStream fout = new FileOutputStream("D:\\Sonoo.jpg");
				fout.write(barr);
				fout.close();
			}
			System.out.println("ok");
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
