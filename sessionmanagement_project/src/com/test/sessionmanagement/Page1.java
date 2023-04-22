package com.test.sessionmanagement;
//this is an example for hidden form fields (uses index2.html) 
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@SuppressWarnings("serial")
public class Page1 extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		try {
			res.setContentType("text/html");
			PrintWriter out = res.getWriter();
			String n = req.getParameter("userName");
			out.print("Welcome " + n);
			// creating form that have invisible textfield
			out.print("<form action='hi2' method='get'>");
			out.print("<input type='hidden' name='uname' value='" + n + "'>");
			out.print("<input type='submit' value='go'>");
			out.print("</form>");
			out.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
