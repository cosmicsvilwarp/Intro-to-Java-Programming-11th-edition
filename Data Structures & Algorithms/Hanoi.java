/*Sebas*/
import java.io.*;
import java.net.*;
import java.util.*;
import java.util.stream.*;


class Demo {
	public static void main(String[] args) {
		System.out.println("Enter the number of disks: ");
		int n = new Scanner(System.in).nextInt();
		TOH(n, 'A', 'B', 'C');
	}
	public static void TOH(int n, char a, char b, char c){
		if(n > 0){
			TOH(n - 1, a, c, b);
			System.out.println("Move disk " + n + " from " + a + " to " + c);
			TOH(n - 1, b, a, c);
		}
	}
}