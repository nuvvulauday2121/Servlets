package com.creatiq.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class LifeCycleServletDemo extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	
	public LifeCycleServletDemo() {
		System.out.println("object created for lifecycleservletdemo ");
		
		
	}
	@Override
	public void init() throws ServletException {
		System.out.println("this is inti method");
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("service called for demo calss");
		
		
	}
@Override
public void destroy() {
	System.out.println("this is destroy method");
}
}
