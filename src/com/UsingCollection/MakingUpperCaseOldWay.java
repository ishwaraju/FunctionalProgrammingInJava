/**
 * Tradational program to make the name upper case
 */
package com.UsingCollection;
/**
 * @author ishwaraju
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MakingUpperCaseOldWay {
	private static void printlist() {
		String array[] = { "Brian", "Nate", "Neal", "Raju", "Sara", "Scott" };
		final List<String> friends = Arrays.asList(array);
		List<String> newList = new ArrayList<String>();
		for(String l : friends)
			newList.add(l.toUpperCase());
		
		for(String s : newList)
			System.out.println(s);
	}

	public static void main(String[] args) {
		printlist();
	}
}
