/**
 * use of forEach
 */
package com.UsingCollection;
/**
 * @author ishwaraju
 */
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class IterateListNewWay {
	private static void printlist() {
		String array[] = { "Brian", "Nate", "Neal", "Raju", "Sara", "Scott" };
		final List<String> friends = Arrays.asList(array);
		/*friends.forEach(new Consumer<String>() {
			public void accept(String t) {
				System.out.println(t);

			}

		});*/
		//using lambda expression
		//friends.forEach((final String name)->System.out.println(name));
		friends.forEach(System.out::println);
	}

	public static void main(String[] args) {
		printlist();
	}

}
