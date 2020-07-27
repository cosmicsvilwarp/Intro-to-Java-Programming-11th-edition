/*Sebas*/
/*********************************************************************************
* (Enable Circle comparable) Rewrite the Circle class in Listing 13.2 to extend  *
* GeometricObject and implement the Comparable interface. Override the equals    *
* method in the Object class. Two Circle objects are equal if their radii are    *
* the same. Draw the UML diagram that involves Circle, GeometricObject, and      *
* Comparable.                                                                    *
*********************************************************************************/
import java.io.*;
import java.net.*;
import java.util.*;

class Exercise_13_09 {
	/** Main method */
	public static void main(String[] args) {
		// Create three Circle objects
		Circle circle1 = new Circle("red", true, 5);
		Circle circle2 = new Circle("green", false, 5);
		Circle circle3 = new Circle("green", false, 4);

		// Display results
		System.out.println("Circle1 radius: " + circle1.getRadius());
		System.out.println("Circle2 radius: " + circle2.getRadius());
		System.out.println("Circle3 radius: " + circle3.getRadius());

		System.out.println("Circle1 is " + (circle1.equals(circle2) ? "" : "not ") + 
			"equal to Circle2");

		System.out.println("Circle1 is " + (circle1.equals(circle3) ? "" : "not ") +
			"equal to circle3");
	}
}