package com.cyr.servlet;

//this is an example for attribute servlet
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class DemoServlet1 extends HttpServlet {
	private PrintWriter out;

	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		try {
			res.setContentType("text/html");
			out = res.getWriter();
			ServletContext context = getServletContext();
			context.setAttribute("company", "IBM");
			out.println("Welcome to first servlet");
			out.println("<a href='servlet2'>visit</a>");
			out.close();
		} catch (Exception e) {
			out.println(e);
		}
	}
}
