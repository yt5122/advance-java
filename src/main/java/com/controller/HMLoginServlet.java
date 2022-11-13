package com.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/HMLoginServlet")
public class HMLoginServlet extends HttpServlet {

		@Override
		protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			// TODO Auto-generated method stub
		
				String Email = req.getParameter("Email");
				String Password = req.getParameter("Password");
				
					RequestDispatcher rd = null ;
					
					
				if (Password.equals("admin")) {
					
				Cookie cookie = new Cookie("Email",Email);
				resp.addCookie(cookie);
				rd = req.getRequestDispatcher("HMMenu.jsp");
				
				
				}else {
					
					req.setAttribute("msg", "Invalid Credential");
					
					rd = req.getRequestDispatcher("HMLogin.jsp");
					
				}	
			
				rd.forward(req, resp);
		}



}
