package com.chito.music.musicgenerator.primitives;

import java.util.List;

import com.chito.music.musicgenerator.enums.Length;

public class Bar {

	private int beats;
	private Length length;
	private List<Note> notes;
	
	public int getBeats() {
		return beats;
	}
	public void setBeats(int beats) {
		this.beats = beats;
	}
	public Length getLength() {
		return length;
	}
	public void setLength(Length length) {
		this.length = length;
	}
	
	public double getBarLength(){
		return beats/length.getValue();
	}
	
	public List<Note> getNotes() {
		return notes;
	}
	
	public void setNotes(List<Note> notes) {
		this.notes = notes;
	}
	
}
