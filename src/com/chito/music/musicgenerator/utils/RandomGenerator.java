package com.chito.music.musicgenerator.utils;

import java.util.concurrent.ThreadLocalRandom;

public class RandomGenerator {
	public static int randInt(int min, int max) {
		return ThreadLocalRandom.current().nextInt(min, max + 1);
	}
	
	public static int randInt(int max) {
		return ThreadLocalRandom.current().nextInt(1, max + 1);
	}
}
