/*Sebas*/
import java.util.Scanner;
import java.util.*;

class Untitled {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the size of array");
		int n = input.nextInt(); 
		int[] list = new int[n];
		
		
		
		for(int i = 0; i < n; i++){
			System.out.println("Please enter input for element " + i);
			list[i] = input.nextInt();
		}
		System.out.println("The contents of Array list is: ");
		for(int i = 0; i < n; i++){
			System.out.print(list[i] + " ");
		}	
		int[] list2 = reverse(list);
		System.out.println("\nThe contents of the reverse is: ");
		System.out.print(Arrays.toString(list2) + " ");
		
	}
		
		public static int[] reverse(int[] list){
			int[] result = new int[list.length];
			
			for(int i = 0, j = result.length - 1; i < list.length; i++, j--){
				result[j] = list[i];
			}
			return result;
		}
}
