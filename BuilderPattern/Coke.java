package com.kate.BuilderPattern;

//创建扩展了ColdDrink 的实体类。
public class Coke extends ColdDrink {

	@Override
	public String name() {
		return "Coke";
	}

	@Override
	public float price() {
		return 15.0f;
	}

}
