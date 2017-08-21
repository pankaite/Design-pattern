package com.kate.AdapterPattern;

//创建实现了 AdvancedMediaPlayer 接口的实体类。
public class Mp4Player implements AdvancedMediaPlayer {

	@Override
	public void playVlc(String fileName) {
		
	}

	@Override
	public void playMP4(String fileName) {
		System.out.println("Playing mp4 file. Name: "+ fileName);	
	}

}
