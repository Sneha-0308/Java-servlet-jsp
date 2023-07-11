package com.loginproject;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class WelcomeServlet extends HttpServlet{
	public void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException {
//		res.setContentType("test/html");
		PrintWriter out= res.getWriter();
		String n=req.getParameter("username");
		out.print("Welcome "+n);
	}

}
