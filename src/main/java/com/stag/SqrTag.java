package com.stag;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class SqrTag extends SimpleTagSupport {

	 	int num;
	 	
      public int getNum() {
			return num;
		}

		public void setNum(int num) {
			this.num = num;
		}

	@Override
    public void doTag() throws JspException, IOException {
    
			int s = num*num;
			JspWriter out = getJspContext().getOut();
			out.print(s);
    	  
    }

}
