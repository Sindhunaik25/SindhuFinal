package com.lambda.assignment;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class ConcatString {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap();
		map.put("Karnataka", "Bangalore");
		map.put("Maharashtra", "Mumbai");
		map.put("Telangana", "Hyderabad");

		map.entrySet()
				.stream()
				.forEach(
						entry -> System.out.println(entry.getKey().concat(
								entry.getValue())));

	}

}
