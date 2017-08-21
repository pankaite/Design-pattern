package com.kate.FacadePattern;

public class ShapeMaker {
	private Shape circle;
	private Shape square;
	private Shape rectangle;
	
	public ShapeMaker() {
		circle = new Circle();
		square = new Square();
		rectangle = new Square();
	}
	
	public void drawCircle() {
		circle.draw();
	}
	
	public void drawSquare() {
		square.draw();
	}
	
	public void drawRectangle() {
		rectangle.draw();
	}
	
}
