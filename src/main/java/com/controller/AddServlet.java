package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/AddServlet")
public class AddServlet extends HttpServlet {

		@Override
		protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			// TODO Auto-generated method stub

			
			String x = req.getParameter("n1");
			String y = req.getParameter("n2");
			String z = req.getParameter("Operation");
			
			
			boolean isError = false; // no error
			// validation
			if (x == null || x.trim().length() == 0 || y == null || y.trim().length() == 0 || z == null) {
				// error
				isError = true;
			}

			if (isError == true) {

				PrintWriter out = resp.getWriter();
				resp.setContentType("text/html");// text/html --> MIME

				out.print("<html>");
				out.print("<body>");
				out.print("Please Enter proper input/values");
				out.print("</body>");
				out.print("</html>");

			} else {

				int n1 = Integer.parseInt(req.getParameter("n1"));// Wrapper --> Integer
				int n2 = Integer.parseInt(req.getParameter("n2"));

				String operation = req.getParameter("operation");// add sub mul div
				int ans = 0;

				switch (operation) {
				case "+":
					ans = n1 + n2;
					break;
				case "-":
					ans = n1 - n2;
					break;
				case "*":
					ans = n1 * n2;
					break;
				case "/":
					ans = n1 / n2;
					break;
				default:
					ans = -1;
					break;
				}

				PrintWriter out = resp.getWriter();
				resp.setContentType("text/html");// text/html --> MIME

				out.print("<html>");
				out.print("<body>");
				out.print(n1 + " " + operation + " " + n2 + " = " + ans); // 20 + 30 = 50
				out.print("</body>");
				out.print("</html>");

			}

		}
	}
			
			
		


