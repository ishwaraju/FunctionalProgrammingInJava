/**
 * use of filter
 */
package com.UsingCollection;
/**
 * @author ishwaraju
 */
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class NamesStartingWithN {
	public static void main(String[] args) {
		printList();
	}

	private static void printList() {

		final Predicate<String> namesWithN = n -> n.startsWith("N");
		String editors[] = { "Brian", "Nate", "Neal", "Raju", "Sara", "Scott" };
		String singer[] = { "Brian", "Nate", "Neal", "Nitin" };
		String actor[] = { "Brian", "Nate" };
		final List<String> editorList = Arrays.asList(editors);
		final List<String> singerList = Arrays.asList(singer);
		final List<String> actorList = Arrays.asList(actor);

		editorList.stream().filter(namesWithN).forEach(System.out::println);
		singerList.stream().filter(namesWithN).forEach(System.out::println);
		actorList.stream().filter(namesWithN).forEach(System.out::println);

	}

}
