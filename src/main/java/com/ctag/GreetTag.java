package com.ctag;


import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.TagSupport;

public class GreetTag extends TagSupport {


	public int doStartTag() throws JspException {
				Date d = new Date();
				int h = d.getHours();
		
				JspWriter out = pageContext.getOut();
				try {
					 if (h >= 0 && h<=11) {
						
						 	out.print("Good Morning");
						 
					}else if (h>=12 && h<=17) {
								out.print("Good Noon");
					} else {
							
							out.print("Good Evening");
					
					}
					 
					 
					 
					 {
						
					}
				} catch (Exception e) {
					// TODO: handle exception
				
				}
				return SKIP_BODY;
				
				
						
				
				
				
				
				
				
				
				
				return super.doStartTag();
	}
	
	@Override
	public int doEndTag() throws JspException {
		// TODO Auto-generated method stub
		return super.doEndTag();
	}
	
	
}
