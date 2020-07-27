/*Sebas*/
import java.io.*;
import java.net.*;
import java.util.*;



class Untitled {
	public static void main(String[] args) {
		System.out.println(substract(88, 22));
	}
	public static int substract(int x, int y){
		while(y != 0){
			
			int c = (~x) & y;
			x = x ^ y;
			y = c << 1;
			
		}
		return x;
	}
}