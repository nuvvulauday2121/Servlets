package com.creatiq.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class StuSaveServlet
 */
@WebServlet("/StuSaveServlet")
public class StuSaveServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("student save servlet called");
		System.out.println("student id :"+request.getParameter("id"));
		System.out.println("student name :"+request.getParameter("name"));
		System.out.println("student class :"+request.getParameter("class"));
	}

}
