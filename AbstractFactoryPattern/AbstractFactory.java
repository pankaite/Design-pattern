package com.kate.AbstractFactoryPattern;

//为 Color 和 Shape 对象创建抽象类来获取工厂。
public abstract class AbstractFactory {
	abstract Shape getShape(String shapeType);
	abstract Color getColor(String colorType);
}
