package com.java.collections;

import java.util.Collections;
import java.util.LinkedList;

public class MovieDetailsList {

	public static void main(String[] args) {
		LinkedList<MovieDetails> list = new LinkedList();
		MovieDetails movie1 = new MovieDetails("Arasu", "Puneeth", "Ramya",
				"Action");
		MovieDetails movie2 = new MovieDetails("Googly", "Yash", "Kriti",
				"LoveStory");
		MovieDetails movie3 = new MovieDetails("Om", "Shivu", "Prema",
				"Commercial");
		MovieDetails movie4 = new MovieDetails("Ajay", "Puneeth", "Arundhati",
				"Action");
		list.add(movie1);
		list.add(movie2);
		list.add(movie3);
		list.add(movie4);
		Collections.sort(list);
		for (MovieDetails mm : list) {
			System.out.println(mm);
		}

	}
}