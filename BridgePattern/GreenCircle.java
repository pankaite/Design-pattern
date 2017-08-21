package com.kate.BridgePattern;

//创建实现了 DrawAPI 接口的实体桥接实现类。
public class GreenCircle implements DrawAPI {

	@Override
	public void drawCircle(int radius, int x, int y) {
		System.out.println("Drawing Circle[ color: green, radius: " + radius +", x: " +x+", "+ y +"]");
	}

}
