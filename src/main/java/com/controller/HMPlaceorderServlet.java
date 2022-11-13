package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.util.MenuItem;

@WebServlet("/HMPlaceorderServlet")
public class HMPlaceorderServlet extends HttpServlet {

		@Override
		protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			// TODO Auto-generated method stub
		
		int total = 0;
		String choice[] = req.getParameterValues("choice");
		resp.setContentType("text/html");
		
		PrintWriter out = resp.getWriter();
		
		Cookie cookies[] = req.getCookies();
		String Email = "";
		for(Cookie x: cookies) {
					if (x.getName().equals("Email")) {
						
							Email = x.getValue();
					}
				
		}
		out.print("<html><body>");
		out.print("Hey ,"+Email+"<br><bR>");
		for (String c : choice) {
			out.print(c + " : ");
			out.print(MenuItem.menu.get(c));
			total = total + MenuItem.menu.get(c);
			out.print("<br>");
		}
		
		out.print("<br> total => "+total);
		out.print("<br> GST => " + (total * 0.18));
		out.print("<br> Total Pay =>"+(total + (total * 0.18)));
		out.print("</body></html>");
		}


}
