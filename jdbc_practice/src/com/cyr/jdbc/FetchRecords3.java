package com.cyr.jdbc;
//batch adding

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class FetchRecords3 {

	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/timepass", "root", "admin123");
		con.setAutoCommit(false);
		Statement stmt = con.createStatement();
		stmt.addBatch("insert into emp765 values(190,'abhi',40000)");
		stmt.addBatch("insert into emp765 values (191,'umesh',50000)");
		stmt.executeBatch();
		con.commit();
		con.close();

	}

}
