/**
 * Iterate the list old way
 */
package com.UsingCollection;

/**
 * @author ishwaraju
 */
import java.util.Arrays;
import java.util.List;

public class IterateListOldWay {
	private static void printlist() {
		String array[] = { "Brian", "Nate", "Neal", "Raju", "Sara", "Scott" };
		final List<String> friends = Arrays.asList(array);
		for (String s : friends) {
			System.out.println(s);
		}
	}

	public static void main(String[] args) {
		printlist();
	}

}
