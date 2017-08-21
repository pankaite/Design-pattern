package com.kate.PrototypePattern;

//创建扩展了抽象类的实体类。
public class Circle extends Shape {

	public Circle() {
		type = "Circle";
	}

	@Override
	void draw() {
		System.out.println("Inside Circle::draw() method.");
	}

}
