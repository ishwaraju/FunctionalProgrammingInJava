/*
 * use of mapToInt
 */
package com.UsingCollection;
/**
 * @author ishwaraju
 */

import java.util.Arrays;
import java.util.List;

public class FindLengthOfNames {

	private static void findLengths(List<String> names) {
		System.out.println(names.stream().mapToInt(name -> name.length()).sum());
	}

	public static void main(String[] args) {
		List<String> names = Arrays.asList("Ishwar", "Priya", "Amit");
		findLengths(names);
	}
}
