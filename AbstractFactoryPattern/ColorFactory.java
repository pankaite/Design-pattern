package com.kate.AbstractFactoryPattern;

//创建扩展了 AbstractFactory 的工厂类，基于给定的信息生成实体类的对象。
public class ColorFactory extends AbstractFactory {

	@Override
	Shape getShape(String shapeType) {
		return null;
	}

	@Override
	Color getColor(String colorType) {
		if(colorType == null){
			return null;
		}
		if(colorType.equalsIgnoreCase("RED")){
			return new Red();
		}
		else if (colorType.equalsIgnoreCase("GREEN")) {
			return new Green();
		}
		else if (colorType.equalsIgnoreCase("BLUE")) {
			return new Blue();
		}
		return null;
	}

}
