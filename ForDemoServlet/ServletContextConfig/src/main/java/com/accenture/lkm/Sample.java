package com.accenture.lkm;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Sample extends HttpServlet {

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {

		PrintWriter out = res.getWriter();
		out.print("Hi ");

//		ServletContext context = getServletContext();
//		String str = context.getInitParameter("name");
//		out.println(str);

		
		 ServletContext context = getServletContext(); 
		 String str =context.getInitParameter("company"); 
		 out.println(str);
		
		 ServletConfig config = getServletConfig(); 
		 String str2 =config.getInitParameter("name"); 
		 out.println(str2);
		 
	}

}
