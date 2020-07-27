/*Sebas*/
import java.util.Scanner;

class Untitled {
	public static void main(String[] args) {
		// Roll two dice
		int point = rollTwoDice();
		final int TIMES = 10000;
	// Check the sum of the two dice for craps or natural
		int result = getresult(point);

				// If result is craps or natural print result
		while(int i < TIMES){		
		if (isNaturalOrCraps(result))
					printResult(result);
		else {
			// Continue to roll dice till you win or lose
				rollTillWinOrLose(result);
			}
		}}

			/** Method rollDice */
	public static int rollDice() {
	// Generate a random number between 1 to 6
		return (int)(1 + Math.random() * 6);
		}

			/** Method printRoll prints the sum of the two dice */
			public static int rollTwoDice() {
				int dice1 = rollDice();
				int dice2 = rollDice();
				int sum = dice1 + dice2;
				System.out.println("You rolled " + dice1 + " + " + dice2 + " = " + sum);
				return sum;
			}

			/** Method getresult returns the result */
			public static int getresult(int point) {
				// If point is 2, 3, or 12 retrun 0, If point is 7 or 11 return 1
				switch (point) {
					case 2  : 
					case 3  :
					case 12 : point = 0; break;
					case 7  : 
					case 11 : point = 1; break;
				}
				return point;
			}

			/** Method printResult displays if the player wins or lose */
			public static void printResult(int result) {
				if (result == 0)
					System.out.println("You lose");
				else if (result == 1)
					System.out.println("You win");
			}

			/** Method naturalOrCraps returns true if you won lost. False otherwise */
			public static boolean isNaturalOrCraps(int result) {
				return result == 0 || result == 1;
			}

			/** Method rollTillWinOrLose repeats rolling two dice until either
				 a 7 or the same point value is rolled. then prints the result  */
			public static void rollTillWinOrLose(int point) {
				int result;

				do {
				 	result = rollTwoDice();
				} while (result != point && result != 7);

				// If 7 is rolled, you lose. Otherwise, you win.
				if (result == 7)
					printResult(0);
				else
					printResult(1);
			}	
		}