package com.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;


public class AgeValidationFilter implements Filter{

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain)
			throws IOException, ServletException {
		
					boolean isError = false;
					System.out.println("AgeValidationFilter::doFilter()");
					
					
					String byear = req.getParameter("byear");
					if (byear == null|| byear.trim().length() == 0) {
						
								isError = true;
								req.setAttribute("error", "Please Enter birth year");
								
			}else {
				
				try {
					
						int birthyear = Integer.parseInt(byear);
						if (birthyear > 2022) {
							
								isError = true;
								req.setAttribute("error", "Please Enter correct birthyear");
						
						}
					
					
					
				} catch (Exception e) {
					isError = true;
					req.setAttribute("error", "Please enter a valid birth year");
					
					
				}
				
			}if (isError = true) {
				
					RequestDispatcher rd = req.getRequestDispatcher("AgeCalc.jsp");
					rd.forward(req, resp);
					
			}else {
				
				chain.doFilter(req, resp);
			}
		
		
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		
	}

	
			 




}
