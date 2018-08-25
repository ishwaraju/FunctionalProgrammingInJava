/**
 * use of join
 */
package com.UsingCollection;

/**
 * @author ishwaraju
 */
import java.util.Arrays;
import java.util.List;

public class JoinNames {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("Ishwar", "Priya", "Amit");
		joinAllNames(names);
	}

	private static void joinAllNames(List<String> names) {
		System.out.println(String.join(",", names));
	}
}
