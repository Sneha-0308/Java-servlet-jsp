package com.testservlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class SquareOfNum extends HttpServlet{
	
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException {
		
//		HttpSession session=req.getSession();//HtppSession
//		int k =(int)session.getAttribute("k");
//		we can remove the session data 
//		session.removeAttribute("k"); this will delete data from session
		
//		int k=(int)req.getAttribute("k"); //RequestDispatcher
		
//		int k=Integer.parseInt(req.getParameter("k")); //sendRedirect()
		
		//Cookies
		int k=0;
		Cookie cookies[]=req.getCookies();
		for(Cookie c:cookies) {
			if(c.getName().equals("k"))
				k=Integer.parseInt(c.getValue());
		}
		k=k*k;
		PrintWriter out=res.getWriter();
		out.print("Result is "+k);
	}

}
