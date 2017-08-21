package com.kate.AbstractFactoryPattern;

//使用 FactoryProducer 来获取 AbstractFactory，通过传递类型信息来获取实体类的对象。
public class AbstractFactoryPatternDemo {

	public static void main(String[] args) {
		
		AbstractFactory sAbstractFactory = ProduceFactory.getFactory("shape");
		
		Shape cShape = sAbstractFactory.getShape("circle");
		cShape.draw();

		Shape sShape = sAbstractFactory.getShape("square");
		sShape.draw();
		
		Shape rShape = sAbstractFactory.getShape("rectangle");
		rShape.draw();
		
		AbstractFactory cAbstractFactory = ProduceFactory.getFactory("color");
		
		Color rColor = cAbstractFactory.getColor("red");
		rColor.fill();

		Color gColor = cAbstractFactory.getColor("green");
		gColor.fill();
		
		Color bColor = cAbstractFactory.getColor("blue");
		bColor.fill();
	}

}
