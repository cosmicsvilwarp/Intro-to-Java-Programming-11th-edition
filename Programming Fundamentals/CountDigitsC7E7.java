/*Sebas*/

//(Count single digits) Write a program that generates 100 random integers between 0 and 9 and displays the count for each number. (Hint: Use an array of ten integers, say counts, to store the counts for the number of 0s, 1s, . . . , 9s.)
import java.util.*;

class Untitled {
	public static void main(String[] args) {
		int[] count = new int[10];
		int num = 0;
		
		// Store the counts of 100 random numbers
		for(int i = 0; i < 100; i++){
			num = (int)(Math.random() * 10);
			count[num]++;
		}
		
		System.out.print(Arrays.toString(count));
		
		// Display the results
		System.out.println("\n");
		for (int i = 0; i < count.length; i++) {
					System.out.println(i + "s: " + count[i]);
		}
	}
}