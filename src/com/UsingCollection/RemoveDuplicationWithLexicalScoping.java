/**
 * concept of lexical scoping
 */
package com.UsingCollection;
/**
 * @author ishwaraju
 */
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class RemoveDuplicationWithLexicalScoping {
	public static Predicate<String> checkIfStartWith(final String letter) {
		return name -> name.startsWith(letter);
	}

	private static void printList() {

		final List<String> friends = Arrays.asList("Brian", "Nate", "Neal", "Raju", "Sara", "Scott");
		//we can use a diffrent function
		/*Predicate<String> namesWithN = n -> n.startsWith("N");
		Predicate<String> namesWithB = n -> n.startsWith("B");
		friends.stream().filter(namesWithN).forEach(System.out::println);
		friends.stream().filter(namesWithB).forEach(System.out::println);
		*/
		friends.stream().filter(checkIfStartWith("N")).forEach(System.out::println);
		friends.stream().filter(checkIfStartWith("B")).forEach(System.out::println);
		
		
	}

	public static void main(String[] args) {
		printList();
	}
}
