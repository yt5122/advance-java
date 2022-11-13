package com.controller;

import java.io.IOException;
import java.util.Calendar;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/FindAgeServlet")
public class FindAgeServlet  extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
							int byear = Integer.parseInt(req.getParameter("byear"));
							Calendar c = Calendar.getInstance();
							int currentyear = c.get(Calendar.YEAR);
									
							int age = currentyear - byear;
							
							req.setAttribute("age",age);
	
							RequestDispatcher rd = req.getRequestDispatcher("AgeResult.jsp");
							rd.forward(req, resp);
	}
	
}
