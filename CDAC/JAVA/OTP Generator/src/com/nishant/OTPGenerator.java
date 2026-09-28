package com.nishant;

import java.util.Random;
import java.util.function.Supplier;

public class OTPGenerator {

	public static void main(String[] args) {
		Random random1 = new Random();
		Supplier<Integer> r = () -> {

			return random1.nextInt(9000) + 1000;

		};
		String arr[] = {"A" , "E" , "I" , "O" , "U"};
		double i = Math.random() * 10;
		int j = (int) i % 5;
		
		System.out.println(arr[j] + r.get());
		
	}

}
