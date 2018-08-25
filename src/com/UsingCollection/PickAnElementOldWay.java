/**
 * Find element 
 */
package com.UsingCollection;
/**
 * @author ishwaraju
 */
import java.util.Arrays;
import java.util.List;

public class PickAnElementOldWay {
	private static void pickName(final List<String> list, final String startingletter) {
		String foundName = null;
		for (String s : list) {
			if (s.startsWith(startingletter))
				foundName = s;
		}
		if (foundName != null)
			System.out.println("Name found");
		else
			System.out.println("Not found");
	}

	public static void main(String[] args) {
		List<String> names = Arrays.asList("Ishwar", "Priya", "Amit");
		pickName(names, "o");
	}
}
