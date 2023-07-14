package com.testservlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class MyServletContextConfig extends HttpServlet {
	protected void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException, IOException {
		PrintWriter out=response.getWriter();
//		ServletContext : we can create only one for whole application
		ServletContext ctx=getServletContext();
		String name=ctx.getInitParameter("name");
		String message=ctx.getInitParameter("greeting");
		out.println("Hey this is ServletContext parameter "+name+" "+message);
		
//		ServletConfig : we can create ServletConfig as many servlet we have
		ServletConfig cg=getServletConfig();
		String name1=cg.getInitParameter("name");
		out.println("this is config parameter "+name1);
	}

}
