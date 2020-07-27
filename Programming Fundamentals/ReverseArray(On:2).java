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
		reverse(list);
		
		
	}
		
		public static void reverse(int[] list){
			
			
			for(int i = 0; i < list.length/2 ; i++){
				int temp = list[i];
				list[i] = list[list.length - i - 1];
				list[list.length - i - 1] = temp;
			}
			System.out.println();
			System.out.print(Arrays.toString(list) + " ");
			}
}