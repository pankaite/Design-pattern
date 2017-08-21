package com.kate.PrototypePattern;

//创建扩展了抽象类的实体类。
public class Square extends Shape {

	public Square() {
		type = "Square";
	}

	@Override
	void draw() {
		System.out.println("Inside Square::draw() method.");
	}

}
