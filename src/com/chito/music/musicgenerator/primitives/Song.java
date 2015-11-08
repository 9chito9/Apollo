package com.chito.music.musicgenerator.primitives;

import java.util.List;

import com.chito.music.musicgenerator.enums.Scale;

public class Song {

	private List<Bar> bars;
	private String key;
	private List<Scale> scales;
	
	public List<Bar> getBars() {
		return bars;
	}
	
	public void setBars(List<Bar> bars) {
		this.bars = bars;
	}
	
	public String getKey() {
		return key;
	}
	
	public void setKey(String key) {
		this.key = key;
	}
	
	public List<Scale> getScales() {
		return scales;
	}
	
	public void setScales(List<Scale> scales) {
		this.scales = scales;
	}
	
}
