package com.cyr.jdbc;
//example for "statement"
import java.sql.*;

public class FetchRecord1 {

	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/timepass", "root", "admin123");
		Statement stmt = con.createStatement();
	//int result = stmt.executeUpdate("insert into employee values(8,'james',50000,'ap')");
	 //int result = stmt.executeUpdate("update employee set ename='irfan',esalary=10000 where emp_id=8");
		int result = stmt.executeUpdate("delete from employee where emp_id=8");
		System.out.println(result + " records affected");
		con.close();
	}

}
