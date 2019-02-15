package com.java.collections;

public class MovieDetails implements Comparable<MovieDetails> {
	String mov_Name;
	String lead_actor;
	String lead_actories;
	String genre;

	public MovieDetails(String mov_Name, String lead_actor,
			String lead_actories, String genre) {
		this.mov_Name = mov_Name;
		this.lead_actor = lead_actor;
		this.lead_actories = lead_actories;
		this.genre = genre;
	}

	public String getMov_Name() {
		return mov_Name;
	}

	public void setMov_Name(String mov_Name) {
		this.mov_Name = mov_Name;
	}

	public String getLead_actor() {
		return lead_actor;
	}

	public void setLead_actor(String lead_actor) {
		this.lead_actor = lead_actor;
	}

	public String getLead_actories() {
		return lead_actories;
	}

	public void setLead_actories(String lead_actories) {
		this.lead_actories = lead_actories;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	@Override
	public int compareTo(MovieDetails m) {
		int compareInt = this.lead_actories.compareTo(m.lead_actories);
		if (compareInt < 0)
			return -1;
		if (compareInt > 0)
			return 1;
		return 0;
	}

	@Override
	public String toString() {
		return "MovieDetails [mov_Name=" + mov_Name + ", lead_actor="
				+ lead_actor + ", lead_actories=" + lead_actories + ", genre="
				+ genre + "]";
	}

}
