/*Sebas*/
import java.util.*;

class Untitled {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		final int SIZE = 10;
		int[] numbers = new int[SIZE];
		System.out.println("Please enter "+SIZE+ " numbers: ");
		
		for(int i =0; i < numbers.length; i++){
			numbers[i] = input.nextInt();
		}
		System.out.print(Arrays.toString(numbers));
		System.out.println();
		reverse(numbers);
	}
	public static void reverse(int[] array){
		int[] result = new int[array.length];
		
		for(int i = 0, j = result.length -1; i < array.length; i++, j--){
			result[j] = array[i];
		}
		System.out.print(Arrays.toString(result));
	}
}