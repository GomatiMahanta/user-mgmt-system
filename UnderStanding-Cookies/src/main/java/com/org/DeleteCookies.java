 package com.org;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/delete")
public class DeleteCookies  extends HttpServlet
{
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
	Cookie[] cookie=req.getCookies();
	for(Cookie c:cookie) {
		c.setMaxAge(0);
		res.addCookie(c);
	}
	//to delete only the first cookies
	cookie[0].setMaxAge(0);
	res.addCookie(cookie [0]);
}
}

