package com.cyr.jdbc;

//example of result set
//gets the value from the database:table which is called in absolute
import java.sql.*;

public class FetchRecord2 {

	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/timepass", "root", "admin123");
		Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
		ResultSet rs = stmt.executeQuery("select *from emp765");
		// getting record of 3rd row
		rs.absolute(3);
		System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getInt(3));
		con.close();
	}

}
