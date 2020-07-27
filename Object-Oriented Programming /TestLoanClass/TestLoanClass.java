/*Sebas*/
import java.util.Scanner;
/************************************************************************************
 * Created by woo03 on 2017-03-05.													*
 * Listing 10.1 This is an implement class of Listing 10.2(encapsulated loan class)	*
 * Remember that class user can use the class without knowing how the class is 		*
 * implemented.																		*		
 ************************************************************************************/
/*********************************************************************************
* (IllegalArgumentException) Modify the Loan class in Listing 10.2 to throw      *
* IllegalArgumentException if the loan amount, interest rate, or number of years *
* is less than or equal to zero.                                                 *
*********************************************************************************/

public class TestLoanClass {
	private static Scanner input;

	/** Main method */
	public static void main(String[] args) {
		input = new Scanner(System.in);
		boolean continueinput = true;
		
		do {
			// Enter annual interest rate
			System.out.print("Enter annual interest rate, for example, 8.25: ");
			double annualInterestRate = input.nextDouble();

			// Enter number of years
			System.out.print("Enter number of years as an integer: ");
			int numberOfYears = input.nextInt();

			// Enter loan amount
			System.out.print("Enter loan amount, for example, 120000.95: ");
			double loanAmount = input.nextDouble();
			
			try{
				// Create a loan amount
				Loan myLoan = new Loan(annualInterestRate, numberOfYears, loanAmount);
				
				continueinput = false;

				// Display loan date, monthly payment, and total payment
				System.out.printf("The loan was created on %s\n" +
						"The monthly payment is %.2f\nThe total payment is %.2f\n",
						myLoan.getLoanDate().toString(), myLoan.getMonthlyPayment(),
						myLoan.getTotalPayment());
						
			}
			catch(IllegalArgumentException ex){
				System.out.println(ex.getMessage());
			}
		}
		while(continueinput);
	}
}