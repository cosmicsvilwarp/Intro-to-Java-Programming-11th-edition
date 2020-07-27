/*Sebas*/
/*********************************************************************************
* (Enable GeometricObject comparable) Modify the GeometricObject class to        *
* implement the Comparable interface, and define a static max method in the      *
* GeometricObject class for finding the larger of two GeometricObject objects.   *
* Draw the UML diagram and implement the new GeometricObject class. Write a test *
* program that uses the max method to find the larger of two circles and the     *
* larger of two rectangles.                                                      *
*********************************************************************************/
import java.io.*;
import java.net.*;
import java.util.*;

class Untitled {
	public static void main(String[] args) {
		GeometricObject circle1 = new Circle2("black", true, 6);
		GeometricObject circle2 = new Circle2("yellow", false, 9);
		
		GeometricObject rec1 = new Rectangle("red", true, 5, 8);
		GeometricObject rec2 = new Rectangle("blue", true, 10, 2);
		
		System.out.println("The largest of the two circles is " + Circle.max(circle1, circle2));
		System.out.println();
		System.out.println("The largest of the rectangles is " + Rectangle.max(rec1, rec2));
	}
}