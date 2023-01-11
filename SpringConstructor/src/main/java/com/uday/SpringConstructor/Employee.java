package com.uday.SpringConstructor;

public class Employee {
	
	private int id;
	private String name;
	private Adress adress;
	
	
	public Employee(int id, String name,Adress adress) {
	
		this.id = id;
		this.name = name;
		this.adress=adress;
	}
	
	
	
	

	void show() {
		System.out.println(id+" "+name);
		System.out.println(adress.toString());
	}

}
