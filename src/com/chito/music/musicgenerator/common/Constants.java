package com.chito.music.musicgenerator.common;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.chito.music.musicgenerator.enums.Length;

public interface Constants {
	static final int BEATS = 18;
	static final int LENGTH = 18;
	static final List<Length> USUAL_LENGHTS = new ArrayList<Length>(Arrays.asList(Length.WHOLE, 
			Length.HALF, Length.QUARTER, Length.EIGHTH, Length.SIXTEENTH, Length.THIRTY_SECOND));
	static final List<Length> ALL_LENGTHS = Arrays.asList(Length.values()); 
	
	static final List<Length> SONG_LENGHTS = USUAL_LENGHTS;
}
