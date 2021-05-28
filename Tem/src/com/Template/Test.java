package com.Template;

public class Test {
	public static void main(String[] args) {
		abstractClass c;
		c=new ConcreteClassA();
		c.tempLate();
		
		c=new ConcreteClassB();
		c.tempLate();
	}
}
