package com.kate.AbstractFactoryPattern;

//创建一个工厂创造器/生成器类，通过传递形状或颜色信息来获取工厂。
public class ProduceFactory {
	public static AbstractFactory getFactory(String factoryType) {
		if(factoryType.equalsIgnoreCase("SHAPE")){
			return new ShapeFactory();
		}
		else if (factoryType.equalsIgnoreCase("COLOR")) {
			return new ColorFactory();
		}
		return null;
	}
}
