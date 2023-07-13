package com.testservlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class AddNum extends HttpServlet {
	
// -------------------------1ST METHOD------------------------------
//	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException {
//		int i=Integer.parseInt(req.getParameter("num1"));
//		int j=Integer.parseInt(req.getParameter("num2"));
//		int k=i+j;
////		System.out.println("result is: "+k);
//		PrintWriter out=res.getWriter();
//		out.print("result is: "+k);
//	}
	

	
//	-------------2ND METHOD---------------------
	//Inside service method we have doGet and doPost method
	
//	public void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException {
//		int i=Integer.parseInt(req.getParameter("num1"));
//		int j=Integer.parseInt(req.getParameter("num2"));
//		int k=i+j;
////		System.out.println("result is: "+k);
//		PrintWriter out=res.getWriter();
//		out.print("result is: "+k);
//	}
//	
//	
//	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException {
//		int i=Integer.parseInt(req.getParameter("num1"));
//		int j=Integer.parseInt(req.getParameter("num2"));
//		int k=i+j;
////		System.out.println("result is: "+k);
//		PrintWriter out=res.getWriter();
//		out.print("result is: "+k);
//	}
	
	
//	------------3RD METHOD-----------------
//	Request Dispatcher :
	
	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException {
		int i=Integer.parseInt(req.getParameter("num1"));
		int j=Integer.parseInt(req.getParameter("num2"));
		int k=i+j;
		
		//this is using session tracking 
//		HttpSession session=req.getSession();
//		session.setAttribute("k",k); //(name,value)
//		res.sendRedirect("sq");
		
		
		//this is using sendRedirect
//		res.sendRedirect("sq?k="+k); //url rewriting 
		
		
		//this is using RequestDispacther 
//		req.setAttribute("k", k);			
//		RequestDispatcher rd=req.getRequestDispatcher("sq");
//		rd.forward(req, res);
		
		
		
		//using Cookie
		Cookie cookie=new Cookie("k",k+"");//(name,value)-->value should be String
		res.addCookie(cookie);
		res.sendRedirect("sq");
	}

}
