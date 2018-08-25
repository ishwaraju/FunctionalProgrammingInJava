/**
 * Program to find Name with a specif letter 
 * use of filter
 * filter output is subset of the input
 */
package com.UsingCollection;
/**
 * @author ishwaraju
 */
import java.util.Arrays;
import java.util.List;

public class FindNameWithNNewWay {
	private static void printlist() {
		String array[] = { "Brian", "Nate", "Neal", "Raju", "Sara", "Scott" };
		final List<String> friends = Arrays.asList(array);
		friends.stream().filter(n -> n.startsWith("N")).forEach(System.out::print);
	}

	public static void main(String[] args) {
		printlist();
	}
}
