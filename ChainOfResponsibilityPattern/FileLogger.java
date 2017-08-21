package com.kate.ChainOfResponsibilityPattern;

public class FileLogger extends AbstractLogger {

	public FileLogger(int level) {
		this.level = level;
	}
	
	@Override
	protected void writeMessage(String message) {
		System.out.println("Standard File::Logger: " + message);
	}

}
