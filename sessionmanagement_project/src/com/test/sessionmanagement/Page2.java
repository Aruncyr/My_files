package com.test.sessionmanagement;
//this is an extension file for page1.
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class Page2 extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		try {
			res.setContentType("text/html");
			PrintWriter out = res.getWriter();
			// Getting the value from the hidden field
			String n = req.getParameter("uname");
			out.print("Hello " + n);
			out.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
