package com.kate.SingletonPattern;

public class SingletonPatternDemo {

	public static void main(String[] args) {
		
		//构造函数 Single() 是不可见的
		//Singleton singleton = new Singleton();
		
		Singleton singleton = Singleton.getInstance();
		singleton.showMessage();

	}

}
