package com.cyr.crud;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/LoginServlet")

@SuppressWarnings("serial")
public class LoginServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		
		String name = req.getParameter("name");
		String password = req.getParameter("password");
		HttpSession session=req.getSession();
		session.setAttribute("name", name);
		if (password.equals("admin123")) {
			out.print("<br>You are successfully logged in!");
			out.print("<br>Welcome, " + name);

			req.getRequestDispatcher("index.html").include(req, res);
		} else {
			out.print("sorry, username or password error!");
			req.getRequestDispatcher("Login.html").include(req, res);
		}

		out.close();}

}
