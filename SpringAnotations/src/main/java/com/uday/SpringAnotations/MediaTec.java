package com.uday.SpringAnotations;

import org.springframework.stereotype.Component;

@Component
public class MediaTec implements MobileProcessor{

	public void process() {
        System.out.println("2nd best cpu");
		
	}
	

}
