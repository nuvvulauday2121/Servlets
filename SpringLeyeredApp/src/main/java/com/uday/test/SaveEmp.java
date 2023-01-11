package com.uday.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.uday.confg.Springconfig;

public class SaveEmp {
	ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Springconfig.class);
	

}
