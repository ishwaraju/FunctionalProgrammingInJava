/**
 * return type or filter  is optional
 * we can use ifPresent
 */
package com.UsingCollection;
/**
 * @author ishwaraju
 */
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class PickAnElemenetNewWay {
	private static void pickName(final List<String> list, final String startingletter) {
		Optional<String> foundName = list.stream().filter(name -> name.startsWith(startingletter)).findFirst();
		System.out.println(
				String.format("A name starting with %s: %s", startingletter, foundName.orElse("No name found")));

		foundName.ifPresent(name -> System.out.println("Hello "+name));
	}

	public static void main(String[] args) {
		List<String> names = Arrays.asList("Ishwar", "Priya", "Amit");
		pickName(names, "I");
	}

}
