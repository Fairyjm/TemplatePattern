package com.Template;

public class ConcreteClassA extends abstractClass {
	@Override
	public void primitiveOperation1() {
		System.out.println("具体类A方法1实现");
 
	}
 
	@Override
	public void primitiveOperation2() {
		System.out.println("具体类A方法2实现");
 
	}
}
class ConcreteClassB extends abstractClass {
	 
	@Override
	public void primitiveOperation1() {
		System.out.println("具体类B方法1实现");
 
	}
 
	@Override
	public void primitiveOperation2() {
		System.out.println("具体类B方法2实现");
 
	}
 
}
