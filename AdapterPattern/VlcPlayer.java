package com.kate.AdapterPattern;

//创建实现了 AdvancedMediaPlayer 接口的实体类。
public class VlcPlayer implements AdvancedMediaPlayer {

	@Override
	public void playVlc(String fileName) {
		System.out.println("Playing vlc file. Name: "+ fileName);
	}

	@Override
	public void playMP4(String fileName) {
		
	}

}
