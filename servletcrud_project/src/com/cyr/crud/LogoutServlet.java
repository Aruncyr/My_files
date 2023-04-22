package com.cyr.crud;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@SuppressWarnings("serial")
@WebServlet("/LogoutServlet")

public class LogoutServlet extends HttpServlet {


	private Object name;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		HttpSession session=req.getSession();
		session.setAttribute("name", name);
		req.getRequestDispatcher("Link.html").include(req, res);
		
		out.print("you are successfully loggedout!");
	}
}
