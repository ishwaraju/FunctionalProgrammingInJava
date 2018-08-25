/**
 * Program to find the list contains an element or not
 */
package com.HelloLambdaExpression;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * @author ishwaraju
 */
public class DeclarativeApproach {
	public static boolean check(List<String> cities, String city) {
		return cities.contains(city);
	}

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		String[] cities = { "Delhi", "Chennai", "Mumbai", "Kolkata" };
		list = Arrays.asList(cities);
		Scanner sc = new Scanner(System.in);
		String city = sc.next();
		if (check(list, city))
			System.out.println("List contains the city : " + city);
		else
			System.out.println("List does not contains the city : " + city);
		sc.close();
	}

}
