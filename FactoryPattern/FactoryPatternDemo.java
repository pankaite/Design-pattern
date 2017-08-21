package com.kate.FactoryPattern;

public class FactoryPatternDemo {
	
	public static void main(String[] args) {
		ShapeFactory shapeFactory = new ShapeFactory();
		
		Shape cShape = shapeFactory.getShape("circle");
		cShape.draw();
		
		Shape sShape = shapeFactory.getShape("square");
		sShape.draw();

		Shape rShape = shapeFactory.getShape("rectangle");
		rShape.draw();
	}
}
