package com.kosa.headfirst01;

public class Movie {
	private String title;
	private String genre;
	private int rating;
	
	public void setTitle(String title) {
		this.title=title;
	}
	
	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public String getTitle() {
		return title;
	}

	public void playIt() {
		System.out.println(title + "영화 상영");
	}
}
