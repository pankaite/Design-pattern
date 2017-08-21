package com.kate.FactoryPattern;

//创建实现接口的实体类。
public class Square implements Shape {

	@Override
	public void draw() {
		System.out.println("Inside Square :: draw() Method.");
	}

}
