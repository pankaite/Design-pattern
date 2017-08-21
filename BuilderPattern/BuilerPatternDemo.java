package com.kate.BuilderPattern;

//BuiderPatternDemo 使用 MealBuider 来演示建造者模式（Builder Pattern）。
public class BuilerPatternDemo {
	public static void main(String[] args) {
		MealBuilder mealBuilder = new MealBuilder();
		
		Meal mealOne = mealBuilder.prepareVegMeal();
		System.out.println("Veg Meal");
		mealOne.showItems();
		System.out.println("Total Price : " + mealOne.getCost());

		Meal mealTwo = mealBuilder.prepareVegMeal();
		System.out.println("\n\nNon-Veg Meal");
		mealTwo.showItems();
		System.out.println("Total Price : " + mealTwo.getCost());
		
	}
}
