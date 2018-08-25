/**
 * Tradational progam to find the names starting with Ns
 */
package com.UsingCollection;
/**
 * @author ishwaraju
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindNameWithNOldWay {
	private static void printlist() {
		String array[] = { "Brian", "Nate", "Neal", "Raju", "Sara", "Scott" };
		final List<String> friends = Arrays.asList(array);
		final List<String> namesWithN = new ArrayList<String>();
		for (String s : friends)
			if (s.startsWith("N"))
				namesWithN.add(s);

		System.out.println(namesWithN);
	}

	public static void main(String[] args) {
		printlist();
	}
}
