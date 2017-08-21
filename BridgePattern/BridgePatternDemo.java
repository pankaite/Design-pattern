package com.kate.BridgePattern;

public class BridgePatternDemo {

	public static void main(String[] args) {
		
		Shape redCircle = new Circle(5, 2, 3, new RedCircle());
		Shape greenCircle = new Circle(10, 4, 6, new GreenCircle());
		
		redCircle.draw();
		greenCircle.draw();
	}

}
