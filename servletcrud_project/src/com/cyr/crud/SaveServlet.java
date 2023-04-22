package com.cyr.crud;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/SaveServlet")

@SuppressWarnings("serial")
public class SaveServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		String name = req.getParameter("name");
		String password = req.getParameter("password");
		String email = req.getParameter("email");
		String country = req.getParameter("country");
		Emp e = new Emp();
		e.setName(name);
		e.setPassword(password);
		e.setEmail(email);
		e.setCountry(country);

		int status = EmpDao.save(e);
		if (status > 0) {
			out.print("<p>Record saved successfully!</p>");
			req.getRequestDispatcher("index.html").include(req, res);
			out.println("<br><br><a href='LogoutServlet'>Logout</a>");
		} else {
			out.println("Sorry! unable to save record");
		}
		out.close();
	}
}