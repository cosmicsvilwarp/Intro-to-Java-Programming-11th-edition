/*Sebas*/
import java.io.*;
import java.net.*;
import java.util.*;
import java.util.stream.*;


class Demo {
	public static void main(String[] args) {
		int[]citations = {1, 4, 1, 4, 2, 1, 3, 5, 6};
		System.out.println(hIndex(citations));
	}
	//H-Index is greater or equal to the number of remianing papers 
	public static int hIndex(int[]citations){
		Arrays.sort(citations);
		final int n = citations.length;
		for(int i = 0; i < n; ++i){
			int remaining = n - i;
			if(citations[i] >= remaining){
				return remaining;
			}
		}
		return 0;
	}
}