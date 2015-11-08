package com.chito.music.musicgenerator.main;

import com.chito.music.musicgenerator.primitives.Bar;
import com.chito.music.musicgenerator.utils.BarGenerator;

public class Driver {

	public static void main(String[] args) {
		Bar bar = BarGenerator.generateTime(Boolean.FALSE);
		System.out.println("Bar time: " + bar.getBeats() + "\\" + bar.getLength());
	}

}
