package com.kate.PrototypePattern;

import java.util.Hashtable;

//创建一个类，从数据库获取实体类，并把它们存储在一个 Hashtable 中。
public class ShapeCache {
	
	private static Hashtable<String, Shape> shapeMap = new Hashtable<String, Shape>();
	
	public static Shape getShape(String shapeId) {
		Shape cacheShape = shapeMap.get(shapeId);		
		return (Shape) cacheShape.clone();
	}
	
	public static void loadShapeCache() {
		Circle circle = new Circle();
		circle.setId("1");
		shapeMap.put(circle.getId(), circle);
		
		Square square = new Square();
		square.setId("2");
		shapeMap.put(square.getId(), square);
		
		 Rectangle rectangle = new Rectangle();
		 rectangle.setId("3");
		 shapeMap.put(rectangle.getId(), rectangle);
	}
}

