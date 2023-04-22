package com.test.sessionmanagement;

//this is an extension file for firstservlet used for login 
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class SecondServlet extends HttpServlet {
	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		try {
			res.setContentType("text/html");
			PrintWriter out = res.getWriter();
			Cookie ck[] = req.getCookies();
			out.print("Hello " + ck[0].getValue());
			out.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
