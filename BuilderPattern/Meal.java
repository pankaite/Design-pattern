package com.kate.BuilderPattern;

import java.util.ArrayList;
import java.util.List;

//创建一个 Meal 类，带有定义的 Item 对象。
public class Meal {
	
	private List<Item> list = new ArrayList<>();
	
	public void addItem(Item item) {
		list.add(item);
	}
	
	public float getCost() {
		float cost = 0.0f;
		for (Item item : list) {
			cost += item.price();
		}
		return cost;
	}
	
	public void showItems() {
		for (Item item : list) {
			System.out.print("Item : " + item.name());
			System.out.print(", Packing : " + item.packing().pack());
			System.out.println(", Price : " + item.price());
		}
	}
}
