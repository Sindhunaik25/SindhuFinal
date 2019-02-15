package com.lambda.assignment;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctionalInterfaces {

	public static void main(String[] args) {

		// Predicate interface
		Predicate<Integer> less = i -> i < 18;
		System.out.println(less.test(17));

		// Consumer interface
		Consumer<Integer> consumer = a -> System.out.println(a);
		consumer.accept(10);

		// Supplier interface
		Supplier<String> s = () -> {
			String[] s1 = { "Sindhu", "Sachin", "Nitin" };
			int x = (int) (Math.random() * 3 + 1);
			return s1[x];
		};
		System.out.println(s.get());
		System.out.println(s.get());
		System.out.println(s.get());

		// Function interface
		Function<Integer, String> convert = (number) -> Integer
				.toString(number);
		System.out.println(convert.apply(12).length());
		System.out.println(convert.apply(300).length());
	}
}
