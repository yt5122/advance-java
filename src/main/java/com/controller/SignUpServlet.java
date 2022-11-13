package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SignUpServlet extends HttpServlet {
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
		System.out.println("Inside SignUp Servlet.....");
		String firstname = req.getParameter("firstname");
		String Emailid = req.getParameter("Emailid");
		String Password = req.getParameter("Password");
	
		
		System.out.println(firstname);
		System.out.println(Emailid);
		System.out.println(Password);
		
		
		resp.setContentType("text/html");
			PrintWriter out= resp.getWriter();
		out.print("<html><body>");
		out.print("firstame: "+firstname +"<br>");
		out.print("Email-id: "+Emailid +"<br>");
		out.print("Password: "+Password +"<br>");
		
		out.print("</html></body>");
	
	}
	












}
