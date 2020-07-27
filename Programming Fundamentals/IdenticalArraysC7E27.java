/*Sebas*/
import java.util.*;

class Untitled {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//Prompts user for input
		System.out.println("Enter List1: ");
		int[] number1 = new int[input.nextInt()];
		fillArray(number1);
		System.out.println("Enter List2: ");
		int[] number2 = new int[input.nextInt()];
		fillArray(number2);
		
		//Verifies whether they are identical arrays
		System.out.print(((isIdentical(number1, number2) == true)? "Two lists are identical" : "Two lists are not identical"));
		
	}
	//Method to fill sarrays 
	public static int[] fillArray(int[]array){
		Scanner input = new Scanner(System.in);
		for(int i = 0 ; i < array.length; i++){
			array[i] = input.nextInt();
		}
		return array;
	}
	//Method determines whther an Array is identical or not 
	public static boolean isIdentical(int[]list1, int[]list2){
		if(list1.length != list2.length) return false;
		int sumlist1 = 0; 
		int sumlist2 = 0;
		for(int i =0; i < list1.length; i++){
			sumlist1 += list1[i];
			sumlist2+= list2[i];
		}
		return((sumlist1 != sumlist2)? false: true);
	}
}