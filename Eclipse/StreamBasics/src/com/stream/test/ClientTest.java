package com.stream.test;

import java.util.List;
import java.util.ArrayList;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.stream.Stream;

public class ClientTest {

	public static void main(String[] args) throws Exception {
		List<Student> list = new ArrayList<>();
		list.add(new Student("sindhu", 34));
		
		list.add(new Student("bindhu", 64));
		list.add(new Student("indhu", 84));
		Stream<Student> stream = list.parallelStream();
		stream.forEach(s -> process(s));
	}

	private static void process(Student s) {
		System.out.println(s);
	}

}
