package com.test.sessionmanagement;

// this is an example of session tracking for login page(uses index.html)
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class FirstServlet extends HttpServlet {
	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		try {
			res.setContentType("text/html");
			PrintWriter out = res.getWriter();
			String n = req.getParameter("userName");
			out.print("Welcome : " + n);
			Cookie ck = new Cookie("uname", n);
			res.addCookie(ck);
			out.print("<form action='servlet2' method='post'>");
			out.print("<input type='submit' value='go'>");
			out.print("</form>");

			out.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
