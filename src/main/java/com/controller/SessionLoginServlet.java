package com.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/SessionLoginServlet")
public class SessionLoginServlet extends HttpServlet {

	
			@Override
			protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
				// TODO Auto-generated method stub
			
						String Email = req.getParameter("Email");
						String Password = req.getParameter("Password");
						
						HttpSession session = req.getSession();
						
						session.setAttribute("Email", Email);
						session.setAttribute("Password",Password);
						
						session.setMaxInactiveInterval(120);
						
						RequestDispatcher rd = req.getRequestDispatcher("SessionHome.jsp");
						rd.forward(req, resp);
						
			
			
			
			
			}







}
