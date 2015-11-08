package com.chito.music.musicgenerator.utils;

import com.chito.music.musicgenerator.common.Constants;
import com.chito.music.musicgenerator.primitives.Bar;

public class BarGenerator {

	public static Bar generateTime(Boolean allLengths){
		Bar bar = new Bar();
		
		bar.setBeats(RandomGenerator.randInt(Constants.BEATS));
		
		if(allLengths){
			bar.setAllLengths();
		}else{
			bar.setUsualLengths();
		}
		
		bar.setLength(bar.getLengths().get(RandomGenerator.randInt(0, bar.getLengths().size() - 1)));
		
		return bar;
	}
	
}
