package com.kate.BuilderPattern;

//创建扩展了 Burger的实体类。
public class ChickenBurger extends Burger {

	@Override
	public String name() {
		return "Chicken Burger";
	}

	@Override
	public float price() {
		return 30.0f;
	}

}
