package com.nishant;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionPractice {

	public static void main(String[] args) {

		// 1.Problem 1
		List<String> colour = new ArrayList<String>();
		colour.add("Yellow");
		colour.add("Green");
		colour.add("Purple");
		colour.add("Red");
		colour.add("Blue");

		// 2.Problem 2

		colour.add(0, "Black");

		System.out.println("---------------");
		for (String s : colour) {
			System.out.println(s);
		}

		// Problem 3
//		System.out.println(colour.get(1));

		// Problem 4
		String str = "Red";
//		Iterator<String> itr = colour.iterator();
		int index = colour.indexOf("Black");

		if (index != -1) {
			colour.set(index, str);
		}
		System.out.println("---------------");
		for (String s : colour) {
			System.out.println(s);
		}
		// Problem 5
		colour.remove(3);
		System.out.println("---------------");
		for (String s : colour) {
			System.out.println(s);
		}
		// Problem 6
		System.out.println("---------------");
		System.out.println(colour.contains("Red"));
		// Problem 7
		System.out.println("---------------");
		Collections.sort(colour);
		for (String s : colour) {
			System.out.println(s);
		}
		// Problem 8
		List<String> list = new ArrayList<String>(Collections.nCopies(colour.size(), null));
		System.out.println("---------------New List After Copying -------------");
		Collections.copy(list, colour);
		for (String s : list) {
			System.out.println(s);
		}

		// Problem 9
		System.out.println("---------------After shuffling----------------");
		Collections.shuffle(colour);
		for (String s : colour) {
			System.out.println(s);
		}

		// Problem 10
		System.out.println("---------------After shuffling----------------");
		Collections.reverse(colour);
		for (String s : colour) {
			System.out.println(s);
		}
	}
}
