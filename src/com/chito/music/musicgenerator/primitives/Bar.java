package com.chito.music.musicgenerator.primitives;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.chito.music.musicgenerator.enums.Length;

public class Bar {

	private int beats;
	private Length length;
	private List<Note> notes;
	private List<Length> lengths;
	
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
	
	public List<Length> getLengths() {
		return lengths;
	}
	
	public void setLengths(List<Length> lengths) {
		this.lengths = lengths;
	}
	
	public void setAllLengths(){
		lengths = Arrays.asList(Length.values());
	}
	
	public void setUsualLengths(){
		lengths = new ArrayList<Length>();
		lengths.add(Length.WHOLE);
		lengths.add(Length.HALF);
		lengths.add(Length.QUARTER);
		lengths.add(Length.EIGHTH);
		lengths.add(Length.SIXTEENTH);
		lengths.add(Length.THIRTY_SECOND);
		lengths.add(Length.SIXTY_FOURTH);
	}
}
