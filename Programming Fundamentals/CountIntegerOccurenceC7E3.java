5
/*Sebas*/
import java.util.*;
import java.util.Scanner;

class Untitled {
	public static void main(String[] args) {
		
		System.out.println("Enter number between 1 and 100: ");
		int[] counts = new int[100];
		count(counts);
		
		for(int i = 0; i < counts.length; i++){
			if(counts[i] > 0)
				System.out.println((i + i) + " occurs " + counts[i] + " time" + (counts[i] > 1 ? "s" : ""));
		}
		
	}
	public static void count(int[] counts){
		Scanner input = new Scanner(System.in);
		int n;
		do{
			n = input.nextInt();
			if(n >= 1 && n <= 100)
				counts[n-1]++;
		}
		while(n != 0);
	}
}