package com.cyr.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet("/Servlet1")

public class Login extends HttpServlet {
	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		@SuppressWarnings("unused")
		String n = request.getParameter("userName");
		String p = request.getParameter("userPass");
		out.println("password:" + p);
		if (p.equals("servlet")) {
			RequestDispatcher rd = request.getRequestDispatcher("Servlet2");
			rd.forward(request, response);
		} else {
			out.print("sorry UserName or Password Error!");
			RequestDispatcher rd = request.getRequestDispatcher("/index.html");
			rd.include(request, response);
		}
	}

}
