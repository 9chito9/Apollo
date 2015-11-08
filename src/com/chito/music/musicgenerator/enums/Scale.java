package com.chito.music.musicgenerator.enums;

public enum Scale {
	DORIAN("T-S-T-T-T-S-T");
	
	String pattern;
	
	private Scale(String pattern){
		this.pattern = pattern;
	}
	
	public String getPattern(){
		return pattern;
	}
}
