package com.cyr.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@SuppressWarnings("serial")
public class DemoServlet2 extends HttpServlet {

	private PrintWriter out;

	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		try {
			res.setContentType("text/html");
			out = res.getWriter();
			ServletContext context = getServletContext();
			String n = (String) context.getAttribute("company");
			out.println("Welcome to " + n);
			out.close();
		} catch (Exception e) {
			out.println(e);
		}
	}

}
