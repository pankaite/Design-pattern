package com.kate.AbstractFactoryPattern;

//创建实现接口的实体类。
public class Green implements Color {

	@Override
	public void fill() {
		System.out.println("Inside Green :: fill() Method.");
	}

}
