package com.nishant;

import java.util.Scanner;

public class ShapeDemo {

	public static void main(String[] args) {

		RegularPolygon[] arr = new RegularPolygon[3];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 3; i++) {
			System.out.println("Enter your choice \n 1.Equilateral Triangle \n 2. Square");
			int choice = sc.nextInt();
			double side;
			System.out.println("Enter the length :");
			switch (choice) {
			case 1:
				side = sc.nextDouble();
				arr[i] = new EquilateralTriangle(side);
				break;
			case 2:
				side = sc.nextDouble();
				arr[i] = new Square(side);
				break;
			}
		}
		System.out.println("--- Printing Total sides of all the Polygons you entered----");
		System.out.println(RegularPolygon.totalSides(arr));

		System.out.println("---Printing Perimiter of all the Polygon's---");
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] instanceof Square) {
				System.out.println("Its a square and perimeter is : " + arr[i].getPerimeter());
			} else {
				System.out.println("Its a Triangle and perimeter is : " + arr[i].getPerimeter());
			}
		}

		System.out.println("---Printing Interior Angle of all the Polygon's---");
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] instanceof Square) {
				System.out.println("Its a square and its angle is : " + arr[i].getInteriorAngle());
			} else {
				System.out.println("Its a Triangle and angle is : " + arr[i].getInteriorAngle());
			}
		}
	}

}
