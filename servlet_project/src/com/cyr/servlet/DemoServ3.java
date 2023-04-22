package com.cyr.servlet;

//this is an example for servletcontext interface
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class DemoServ3 extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html");
		PrintWriter pw = res.getWriter();

		// creating ServletContext object
		ServletContext context = getServletContext();

		// Getting the value of the initialization parameter and printing it
		String driverName = context.getInitParameter("dName");
		pw.println("driver name is=" + driverName);

		pw.close();
	}

}
