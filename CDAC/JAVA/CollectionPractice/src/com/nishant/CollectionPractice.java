package com.nishant;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class CollectionPractice {

	public static void main(String[] args) {

		// 1.Problem 1
		Scanner sc = new Scanner(System.in);
		List<String> colour = new ArrayList<String>();
		System.out.print("Enter the size of List: ");
		int num = sc.nextInt();
		sc.nextLine();
		for (int i = 0; i < num; i++) {
			colour.add(sc.nextLine());
		}

		// 2.Problem 2

		colour.add(0, "Black");

		System.out.println("---------------");
		for (String s : colour) {
			System.out.println(s);
		}

		// Problem 3
//		System.out.println(colour.get(1));
		
		//Problem 4
		String str = "Red";
//		Iterator<String> itr = colour.iterator();
		int index = colour.indexOf("Black");
		
		if(index != -1) {
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
	}
}
