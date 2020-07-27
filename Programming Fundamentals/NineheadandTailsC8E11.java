/*Sebas*/
import java.util.*;

class Untitled {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

			System.out.print("Enter a number between 0 and 511: ");
			int input = sc.nextInt();

			// Turn input to binary string
			String binary = Integer.toBinaryString(input);

			// Add enough zeros in front so that the string has 9 characters
			binary = binary.format("%09d", Integer.parseInt(binary));

			// Iterate through binary string one char at a time
			for (int i = 1; i < 10; i++) {
				if ('0' == binary.charAt(i - 1)) {
					System.out.print("H ");
				} else {
					System.out.print("T ");
				}

				// New line after 3 letters
				if (i % 3 == 0) {
					System.out.println();
				}
			}
		}}