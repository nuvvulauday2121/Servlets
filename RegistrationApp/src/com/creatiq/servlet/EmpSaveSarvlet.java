package com.creatiq.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class EmpSaveSarvlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

   
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Employee save sarvlet is called");
		
		System.out.println("emp id :"+request.getParameter("id"));
		System.out.println("emp name :"+request.getParameter("name"));
		System.out.println("emp salary :"+request.getParameter("salary"));
	}

}
