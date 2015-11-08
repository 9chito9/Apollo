package com.chito.music.musicgenerator.enums;

public enum Length {
	
	LARGE(8), LONG(4), DOUBLE_WHOLE(2),
	WHOLE(1), HALF(0.5), QUARTER(0.25), EIGHTH(0.125), SIXTEENTH(0.0625),
	THIRTY_SECOND(0.03125), SIXTY_FOURTH(0.015625), HUNDRED_TWENTY_EIGHT(0.0078125), TWO_HUNDRED_FIFTY_SIXTH(0.00390625);
	
	double value;
	
	private Length(double value){
		this.value = value;
	}
	
	public double getValue(){
		return value;
	}
}
