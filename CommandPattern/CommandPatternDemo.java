package com.kate.CommandPattern;

public class CommandPatternDemo {

	public static void main(String[] args) {
		Stock abcStock = new Stock();
		BuyStock buyAbcStock = new BuyStock(abcStock);
		SellStock sellAbcStock = new SellStock(abcStock);
		Broker broker = new Broker();
		broker.takeOrder(sellAbcStock);
		broker.takeOrder(buyAbcStock);
		broker.placeOrders();
		
	}

}
