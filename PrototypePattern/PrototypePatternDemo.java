package com.kate.PrototypePattern;

public class PrototypePatternDemo {
	public static void main(String[] args) {
		
		ShapeCache.loadShapeCache();
		
		Shape cloneShapeOne = ShapeCache.getShape("1");
		System.out.println("Shape : " + cloneShapeOne.getType());
		
		Shape cloneShapeTwo = ShapeCache.getShape("2");
		System.out.println("Shape : " + cloneShapeTwo.getType());
		
		Shape cloneShapeThree = ShapeCache.getShape("3");
		System.out.println("Shape : " + cloneShapeThree.getType());		
	}
}
