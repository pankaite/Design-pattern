package com.kate.ObserverPattern;

public abstract class Observer {
	protected Subject subject;
	public abstract void update();
}
