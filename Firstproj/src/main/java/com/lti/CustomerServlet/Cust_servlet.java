package com.lti.CustomerServlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lti.App.FormCall;




public class Cust_servlet extends HttpServlet {
	private static final long serialVersionUID = 12L;

    public Cust_servlet() {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		FormCall newCust=new FormCall();
//		newCust.Insert(request.getParameter("name_textbox"),request.getParameter("city_textbox"));
//		newCust.Delete(request.getParameter("name_tetxbox"),request.getParameter("city_textbox"));
		newCust.Show();
	}

}
