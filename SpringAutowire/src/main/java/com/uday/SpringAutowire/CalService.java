package com.uday.SpringAutowire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service("calService*/-+")
public class CalService {
	
	@Autowired
	private DoCalBean doCalBean;
	
	
	
	
//public CalService(DoCalBean doCalBean) {
//		super();
//		this.doCalBean = doCalBean;
//	}




//	public void setDoCalBean(DoCalBean doCalBean) {
//		this.doCalBean = doCalBean;
//	}



	public void doSum(int a,int b) {
		System.out.println("sum : "+doCalBean.sum(a, b));
		
	}

}
