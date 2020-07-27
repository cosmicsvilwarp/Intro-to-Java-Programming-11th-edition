//**********************(Math: combinations) Write a program that prompts the user to enter 10 integers and displays all combinations of picking two numbers from the 10.*********************************************
/*Sebas*/
import java.util.*;
import java.awt.*;

class Untitled {
	public static void main(String[] args) {
		//Create integer array
		int[] list = new int[10];
		
		//Fill array with random integers between 0 and 20
		for(int i = 0; i < list.length; i++){
			list[i] = (int)(Math.random()*20);
		}
			//Visualize array
			System.out.print(Arrays.toString(list));
			
			//Display results of possible combinations
			System.out.println("\n\nPlease see the combinations below: ");
			consec(list);
		}
	public static void consec(int[]list){
		for(int i = 0; i < list.length; i++){
			for(int j =i + 1; j < list.length; j++){
				
				//To also captures numbers and the back of the array. When J loop terminates(meaning when index j = n-1), I used Variable W to go to the beginning of the array and capture all numbers which are behind i which we couldn't capture at that point
				if(list[j] == list[list.length-1]){
					for(int w = 0; w < i; w++){
						System.out.print(list[i] + " and " + list[w]);
						System.out.println();
						}
					}
					System.out.print(list[i] + " and " + list[j]);
					System.out.println();
			}
		}
	}
}

/***********************************2ND VERSION**************************************************
int[] numbers = new int[10];
		Scanner input = new Scanner(System.in);

		System.out.print("Enter 10 numbers: ");
		for (int i = 0; i < 10; i++) numbers[i] = (int)(Math.random()*20);

		for (int i = 0; i < numbers.length; i++) {

			for (int k = 0; k < numbers.length; k++) {
				if (k != i) {
					System.out.println(numbers[i] + "-" + numbers[k] + " ");
				}
			}
			System.out.println("");
		}
	}


}