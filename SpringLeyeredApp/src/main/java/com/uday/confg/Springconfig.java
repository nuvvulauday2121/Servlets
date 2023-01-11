package com.uday.confg;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.uday.util.ConnectionUtil;

@Configuration
@ComponentScan(basePackages = "com.uday")
public class Springconfig {
    @Bean
	public ConnectionUtil connectionUtil() {
    	
    	ConnectionUtil connectionUtil = new ConnectionUtil();
    	connectionUtil.setDriver("Uday Driver");
    	connectionUtil.setUrl("Uday Url");
    	connectionUtil.setUname("root");
    	connectionUtil.setPassword("2121");
		return connectionUtil;
		
	}
	
}
