/*Sebas*/
/**
 * Chapter 11 Exercise 17:
 *
 *       (Algebra: perfect square) Write a program that prompts the user to enter an integer m
 *       and find the smallest integer n such that m * n is a perfect square.
 *       (Hint: Store all smallest factors of m into an array list. n is the product of the factors that
 *       appear an odd number of times in the array list. For example, consider m = 90,
 *       store the factors 2, 3, 3, 5 in an array list. 2 and 5 appear an odd number of times
 *       in the array list. So, n is 10.)
 *
 * Created by Sebastien St Vil 05/08/20
 */
import java.util.*;

class Untitled {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<Integer>list = new ArrayList<>();
		System.out.println("Enter an integer m: ");
		int m = input.nextInt();
		
		//Get smallest factor 
		smallestFactor(m, list);
		
		//Get smallest factor 
		int n = smallestSquare(list);
		
		//results 
		System.out.println("The smallest number n for m * n to be a perfect square is "+ n);
		System.out.println("m * n is " + (m * n));

	}
	public static int smallestSquare(ArrayList<Integer>list){
		//matrix stores all factors
		int[][]matrix = copy(list);
		
		int smallestsquare = 1;
		
		//Count number of times number is in matrix
		for(int i = 0; i < matrix.length; i++){
			countOccurences(matrix, matrix[i][0]);
		}
		
		ArrayList<Integer>finallist = getOdd(matrix);
		
		//get smallest square
		for(int i : finallist){
			smallestsquare *= i;
		}
		return smallestsquare;
	}
	//getOdd sends all the values that had an odd number of occurences to a list
	public static ArrayList<Integer>getOdd(int[][]matrix){
		ArrayList<Integer>temp = new ArrayList<>();
		
		for(int i = 0; i < matrix.length; i++){
			//if count is odd, transfer the element
			//(Added the did not contain clause)To prevent duplicates from being transferred as well
			//Could have created a removedup function but the below makes code shorter
			if(matrix[i][1] % 2 != 0 && !temp.contains(matrix[i][0]))
				temp.add(matrix[i][0]);
		}
		return temp;
	}
	//Count occurences inserts in the second column the number of times a value from first column is inside the matrix
	public static void countOccurences(int[][]matrix, int number){
		for(int i = 0; i < matrix.length; i++){
			if(matrix[i][0] == number){
				matrix[i][1]++;
			}
		}
	}
	//copy essentially transfers the elements from a list to the first row of a matrix 
	public static int[][]copy(ArrayList<Integer>list){
		int[][]matrix = new int[list.size()][2];
		for(int i = 0; i < matrix.length; i++){
			matrix[i][0] = list.get(i);
		}
		return matrix;
	}

	/*smallestFactor returns a list of all the smallest factors of an integer)*/
	public static ArrayList<Integer> smallestFactor(int m, ArrayList<Integer>list){
		//1 is dismissed since always a factor//
		//k is always less or equal to m
		int k = 2;
		
		while(k <= m){
			if(m % k == 0){
				list.add(k);
				m /= k;
			}
			else 
				k++;
		}
		return list;
	}
}