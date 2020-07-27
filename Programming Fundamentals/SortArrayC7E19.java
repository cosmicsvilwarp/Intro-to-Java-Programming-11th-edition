/*Sebas*/
import java.util.*;
import java.awt.*;

class Untitled {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter list: ");
		int[] list = new int[input.nextInt()];
		for(int i = 0; i < list.length; i++){
			list[i] = input.nextInt();
		}
		System.out.println((isSorted(list) == false)? "The list is already sorted" : "The list is not sorted");
	}
	
	/********Bubble sort is not needed here. we can simply run a loop and compare if element[i] > element[i+ 1]. COde is as following. 
	public static boolean isSorted(int[] list) {
			for (int i = 0; i < list.length - 1; i++) {
				if (list[i] > list[i + 1])
					return false;
			}
			return true;
		}*/
		
	public static boolean isSorted(int[]list){
		boolean swapped = false;
		
		for(int i = 0; i < list.length -1; i++){
			swapped = false;
			int temp;
			for(int j =0 ; j < list.length - i - 1; j++){
				if(list[i] > list[i + 1]){
					temp = list[i];
					list[i] = list[i + 1];
					list[i + 1] = temp;
					swapped = true;
				}
			}
			
		}
		return swapped;
	}
}