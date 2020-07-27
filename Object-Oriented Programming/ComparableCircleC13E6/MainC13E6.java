/*Sebas*/
/*********************************************************************************
* (The ComparableCircle class) Define a class named ComparableCircle that        *
* extends Circle and implements Comparable. Draw the UML diagram and implement   *
* the compareTo method to compare the circles on the basis of area. Write a test *
* class to find the larger of two instances of ComparableCircle objects as well  *
* as the larger between a circle and a rectangle.         						 *
*********************************************************************************/
import java.io.*;
import java.net.*;
import java.util.*;



class MainC13E6 {
	public static void main(String[] args) {
		GeometricObject circle1 = new ComparableCircle("red", true, 7);
		GeometricObject circle2 = new ComparableCircle("red", true, 12);
		GeometricObject rectangle2 = new Rectangle("black", false, 250, 3);

		
		System.out.println((circle1.compareTo(circle2) == 1 ? "Circle1" : "Circle2") + " is the largest of the two rectangles");
		System.out.println((rectangle2.compareTo(circle2) == 1 ? "Rectangle2" : "Circle2") + " is the largest of the two objects");

	}
}