package com.nishant;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		NavigableSet<String> set = new TreeSet<String>();
		set.add("Blue");
		set.add("Black");
		set.add("Red");
		set.add("Yellow");

		for (String s : set) {
			System.out.println(s);
		}

		NavigableSet<String> treeSet = new TreeSet<String>();
		treeSet.add("Maroon");
		treeSet.add("White");
		treeSet.add("Pink");
		set.addAll(treeSet);
		Iterator<String> itr = set.iterator();
		while (itr.hasNext()) {
			System.out.print(itr.next() + " ");
		}

		System.out.println();
		set = set.descendingSet();
		Iterator<String> itr1 = set.iterator();
		while (itr1.hasNext()) {
			System.out.print(itr1.next() + " ");
		}

		System.out.println();
		System.out.println(set.first());

		System.out.println(set.last());
//		System.out.println(set.getLast());

		System.out.println(set.higher("Red"));
//		System.out.println(set.ceiling("Ded"));
	}

}
