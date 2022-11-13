package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class InputServlet extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
		
			System.out.println("Inside input servlet");
			
			
			String name = req.getParameter("name");
			String Birthyear = req.getParameter("Birthyear");
			String Age = req.getParameter("Age");
			String Gender = req.getParameter("Gender");
			String Emailid = req.getParameter("Email-id");
			
			System.out.println(name);
			System.out.println(Birthyear);
			System.out.println(Age);
			System.out.println(Gender);
			System.out.println(Emailid);

			resp.setContentType("text/html");
			PrintWriter out= resp.getWriter();
			out.print("<html><body>");
			out.print("Name: "+name +"<br>");
			out.print("BirthYear: "+Birthyear +"<br>");
			out.print("Age: "+Age +"<br>");
			out.print("Gender: "+Gender +"<br>");
			out.print("Email-id: "+Emailid +"<br>");
			
			
			out.print("</html></body>");
	
	
	
	}

}
