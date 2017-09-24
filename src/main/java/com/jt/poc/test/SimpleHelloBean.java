package com.jt.poc.test;

public class SimpleHelloBean {

	public String name;
	
	public String getName() {
		return name;
	}

	public void sayName() {
		System.out.println("Hello Mr: " + name);
	}

	public void setName(String name) {
		this.name = name;
	}

	

	
}
