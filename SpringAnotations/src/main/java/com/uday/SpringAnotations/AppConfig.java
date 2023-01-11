package com.uday.SpringAnotations;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.uday.SpringAnotations")
public class AppConfig {
	
//	@Bean
//	public Samsung getPhone() {
//		return new Samsung();
//		
//	}
//	@Bean
//	public MobileProcessor getProcessor() {
//		return new Snapdragon();
//	}

}
