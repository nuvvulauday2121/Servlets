package com.uday.SpringAutowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CalTest {
	
	public static void main(String[] args) {
		
	ApplicationContext context = new ClassPathXmlApplicationContext("autowire.xml");
	CalService cs = (CalService) context.getBean("calService");
	cs.doSum(30,50);
	}

}
