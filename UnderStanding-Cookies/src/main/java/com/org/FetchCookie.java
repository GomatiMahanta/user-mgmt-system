package com.org;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/fetch")
public class FetchCookie extends HttpServlet
{
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
	Cookie [] cookie=req.getCookies();
	res.setContentType("text/html");
	 PrintWriter out=res.getWriter();
	 for(Cookie c:cookie) {
		out.println("<h1>"
				           +c.getName()
				           +":"
				           +c.getValue()
				           +"</h1>");
	 }
}
}
