/**
 * removing static function and creating our own function
 * here we learn , how to pass function, call function within function, create fucntion within function
 */
package com.UsingCollection;
/**
 * @author ishwaraju
 */
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class PickDifferentNames {
	
	/*final Function<String, Predicate<String>> startsWithLetter = (String letter) -> {
		Predicate<String> checkStarts = (String name) -> name.startsWith(letter);
		return checkStarts;
	};*/
	//modifed version
	/*final Function<String, Predicate<String>> startsWithLetter = (
			String letter) -> (String name) -> name.startsWith(letter);*/
			
	final Function<String, Predicate<String>> startsWithLetter = letter -> name -> name.startsWith(letter);

	public static void main(String[] args) {
		PickDifferentNames differentNames = new PickDifferentNames();
		differentNames.printList();
	}

	private void printList() {
		String friends[] = { "Brian", "Nate", "Neal", "Raju", "Sara", "Scott" };
		final List<String> list = Arrays.asList(friends);
		final long countFriendsStartN = list.stream().filter(startsWithLetter.apply("N")).count();
		final long countFriendsStartB = list.stream().filter(startsWithLetter.apply("B")).count();
		System.out.println(countFriendsStartN + " " + countFriendsStartB);
	}
}
