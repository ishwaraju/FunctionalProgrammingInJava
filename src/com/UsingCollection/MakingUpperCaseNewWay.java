/**
 * use of map
 * input and output is same length , type may differ
 */
package com.UsingCollection;
/**
 * @author ishwaraju
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MakingUpperCaseNewWay {
	private static void printlist() {
		String array[] = { "Brian", "Nate", "Neal", "Raju", "Sara", "Scott" };
		final List<String> friends = Arrays.asList(array);
		/*List<String> uppercaseNames = new ArrayList<String>();
		friends.forEach(name->uppercaseNames.add(name.toUpperCase()));
		System.out.println(uppercaseNames);*/
		
		//friends.forEach(name->System.out.println(name.toUpperCase()));
		//friends.stream().map(name->name.toUpperCase()).forEach(System.out::println);
		friends.stream().map(String::toUpperCase).forEach(System.out::println);
		
		friends.stream().map(String::length).forEach(System.out::print);
	}

	public static void main(String[] args) {
		printlist();
	}
}
