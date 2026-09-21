package com.nishant;

public interface RegularPolygon {
	int getNumSides();

	double getSideLength();

	static int totalSides(RegularPolygon[] r) {

		int totalSides = 0;

		for (int i = 0; i < r.length; i++) {
			totalSides += r[i].getSideLength();
		}

		return totalSides;
	}

	default double getPerimeter() {

		return (this.getNumSides() * this.getSideLength());

	}

	default double getInteriorAngle() {
		return ((this.getNumSides() - 2) * Math.PI) / this.getNumSides();
	}
}