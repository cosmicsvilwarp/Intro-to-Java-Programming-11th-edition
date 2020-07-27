/*Sebas*/
import java.io.*;
import java.net.*;
import java.util.*;



class Untitled {
	public static void main(String[] args) {
		Rectangle rec1 = new Rectangle(10, 20);
		Rectangle rec2 = new Rectangle(20, 10);
		
		System.out.println("Rectangle1 is " + (rec1.equals(rec2) ? "" : " not ") + "equal to Rectangle 2");
	}
}