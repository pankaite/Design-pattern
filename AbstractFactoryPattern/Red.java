package com.kate.AbstractFactoryPattern;

//创建实现接口的实体类。
public class Red implements Color {

	@Override
	public void fill() {
		System.out.println("Inside Red :: fill() Method.");
	}

}
