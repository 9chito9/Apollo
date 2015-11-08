package com.chito.music.musicgenerator.primitives;

import com.chito.music.musicgenerator.enums.Length;
import com.chito.music.musicgenerator.enums.Pitch;

public class Note {
	
	private Length lenght;
	private Pitch pitch;
	private Boolean silent;
	
	public Length getLenght() {
		return lenght;
	}
	public void setLenght(Length lenght) {
		this.lenght = lenght;
	}
	public Pitch getPitch() {
		return pitch;
	}
	public void setPitch(Pitch pitch) {
		this.pitch = pitch;
	}
	public Boolean isSilent() {
		return silent;
	}
	public void setSilent(Boolean silent) {
		this.silent = silent;
	}
	
}
