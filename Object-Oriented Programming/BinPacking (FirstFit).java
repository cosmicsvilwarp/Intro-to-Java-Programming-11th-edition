/*Sebas*/
/*(Bin packing using first fit) The bin packing problem is to pack the objects of vari- ous weights into containers. Assume each container can hold a maximum of 10 pounds. The program uses an algorithm that places an object into the first bin in which it would fit. Your program should prompt the user to enter the total number of objects and the weight of each object. The program displays the total number of containers needed to pack the objects and the contents of each container. Here is a sample run of the program:*/
import java.util.*;

class Untitled {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//Prompts for the amount of items
		System.out.println("Enter the number of items: ");
		int number_OfItems = input.nextInt();
		
		//Prompts the user to enter the weight of each items
		int[] weights = insertWeights(number_OfItems, input);
		
		//The maximum amount that each bag can take before we need a new one
		System.out.println("How many pounds can each slot take ?");
		int capacity = input.nextInt();
		
		int count = nextFit(weights, capacity, number_OfItems);
		
		System.out.println("The amount of bags needed are : " +count);
	}
	
	public static int nextFit(int[] weights, int capacity, int numberItems){
		int bagcount = 0;
		
		int[] slotspace = new int[numberItems];
		
		for(int i = 0 ; i < numberItems; i++){
			
			int j;
			for(j = 0; j < bagcount; j++){
				if(slotspace[j] > weights[i]){
					slotspace[j] = slotspace[j] - weights[i];
					break;
				}
			}
			if(j == bagcount){
				slotspace[j] = capacity - weights[i];
				bagcount++;
			}
		}
		return bagcount;
	}
	
	public static int[]insertWeights(int items, Scanner input){
		int[]temp = new int[items];
		
		System.out.println("Enter the weights for each of the " + items + " items: ");
		for(int i = 0; i < items; i++){
			temp[i] = input.nextInt();
		}
		return temp;
	}
}