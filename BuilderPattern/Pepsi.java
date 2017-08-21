package com.kate.BuilderPattern;

//创建扩展了ColdDrink 的实体类。
public class Pepsi extends ColdDrink {

	@Override
	public String name() {
		return "Pepsi";
	}

	@Override
	public float price() {
		return 20.0f;
	}

}
