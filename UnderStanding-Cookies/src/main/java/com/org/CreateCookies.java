package com.org;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/create")
public class CreateCookies extends HttpServlet
{
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
	Cookie c1=new Cookie("Name","Manoj");
	c1.setMaxAge(60);
	res.addCookie(c1);
	res.addCookie(new Cookie("age","secret"));
	res.addCookie(new Cookie("email","Manoj@gmail.com"));
	res.setContentType("text/html");
	PrintWriter out=res.getWriter();
	out.println("<h1> Cokies Added Successfully</h1>");
	
}
}
