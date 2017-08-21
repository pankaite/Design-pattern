package com.kate.ChainOfResponsibilityPattern;

public class ChainPatternDemo {

	public static void main(String[] args) {
		AbstractLogger loggerChain = getChainOfLogger();

		loggerChain.logMessage(AbstractLogger.INFO, "This is an information.");
		System.out.println();
		loggerChain.logMessage(AbstractLogger.DEBUG, "This is an debug level information.");
		System.out.println();
		loggerChain.logMessage(AbstractLogger.ERROR, "This is an error information.");
	}

	private static AbstractLogger getChainOfLogger() {
		AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO);
		AbstractLogger fileLogger = new FileLogger(AbstractLogger.DEBUG);
		AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);

		errorLogger.setNextLogger(fileLogger);
		fileLogger.setNextLogger(consoleLogger);

		return errorLogger;
	}
}
