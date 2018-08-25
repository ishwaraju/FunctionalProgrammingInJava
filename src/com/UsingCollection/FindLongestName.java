/**
 * use of reduce method
 */
package com.UsingCollection;

/**
 * @author ishwaraju
 */
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindLongestName {

	private static void findLongest(List<String> names) {
		Optional<String> longest = names.stream()
				.reduce((name1, name2) -> name1.length() >= name2.length() ? name1 : name2);
		longest.ifPresent(System.out::println);

		final String elephantOrLonger = names.stream().reduce("Elephant",
				(name1, name2) -> name1.length() >= name2.length() ? name1 : name2);
		System.out.println(elephantOrLonger);

	}

	public static void main(String[] args) {
		List<String> names = Arrays.asList("Ishwar", "Priya", "Amit");
		findLongest(names);
	}
}
