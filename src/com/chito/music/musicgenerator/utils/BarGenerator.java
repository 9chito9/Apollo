package com.chito.music.musicgenerator.utils;

import com.chito.music.musicgenerator.common.Constants;
import com.chito.music.musicgenerator.primitives.Bar;

public class BarGenerator {

	public static Bar generateTime(Boolean allLengths){
		Bar bar = new Bar();
		
		bar.setBeats(RandomGenerator.randInt(Constants.BEATS));
		
		bar.setLength(Constants.SONG_LENGHTS.get(RandomGenerator.randInt(0, Constants.SONG_LENGHTS.size() - 1)));
		
		return bar;
	}
	
}
