package com.ray10pm;

public class Song {
	
	private String title;
	private Double duration;
	
	public Song(String title, Double duration) {
		super();
		this.title = title;
		this.duration = duration;
	}

	public String getTitle() {
		return title;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.title + ": " + this.duration;
	}

	
	
	

}
