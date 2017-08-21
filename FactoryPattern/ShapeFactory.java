package com.kate.FactoryPattern;

//创建一个工厂，生成基于给定信息的实体类的对象。
public class ShapeFactory {
	
	public Shape getShape(String shapType) {
		if(shapType == null){
			return null;
		}
		if(shapType.equalsIgnoreCase("CIRCLE")){
			return new Circle();
		}
		else if (shapType.equalsIgnoreCase("SQUARE")) {
			return new Square();
		}
		else if (shapType.equalsIgnoreCase("RECTANGLE")) {
			return new Rectangle();
		}
		return null;
	}
}
