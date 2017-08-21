package com.kate.ChainOfResponsibilityPattern;

public class ErrorLogger extends AbstractLogger {

	public ErrorLogger(int level) {
		this.level = level;
	}
	
	@Override
	protected void writeMessage(String message) {
		System.out.println("Standard Error::Logger: " + message);
	}

}
