/**
 * Chapter 8 Exercise 17:
 *
 *      (Financial tsunami)
 *      Banks lend money to each other. In tough economic times, if a bank goes
 *      bankrupt, it may not be able to pay back the loan. A banks total assets
 *      are its current balance plus its loans to other banks.
 *      The diagram in Figure 8.8 shows five banks. The banks; current balances
 *      are 25, 125, 175, 75, and 181 million dollars, respectively.
 *      The directed edge from node 1 to node 2 indicates that
 *      bank 1 lends 40 million dollars to bank 2.
 *
 *      If a banks total assets are under a certain limit, the bank is unsafe.
 *      The money it borrowed cannot be returned to the lender, and the lender
 *      cannot count the loan in its total assets. Consequently, the lender may
 *      also be unsafe, if its total assets are under the limit. Write a program
 *      to find all the unsafe banks. Your program reads the input as follows. It
 *      first reads two integers n and limit, where n indicates the number of banks
 *      and limit is the minimum total assets for keeping a bank safe. It then reads
 *      n lines that describe the information for n banks with IDs from 0 to n-1.
 *      The first number in the line is the banks balance, the second number indicates
 *      the number of banks that borrowed money from the bank, and the rest are pairs of
 *      two numbers. Each pair describes a borrower. The first number in the pair is the
 *      borrowers ID and the second is the amount borrowed.
 *       For example, the input for the five banks in Figure 8.8 is as follows (note that the limit is 201):
 *
 *      5 - number of banks
 *      201 - minimum asset limit
 *
 *      Bank#0 Balance:  25  NumOfBanksLoaned: 2 BankID: 1 Amount: 100.5 BankID: 4 Amount:  320.5
 *
 *      Bank#1 Balance: 125  NumOfBanksLoaned: 2 BankID: 2 Amount:  40   BankID: 3 Amount:   85
 *
 *      Bank#2 Balance: 175  NumOfBanksLoaned: 2 BankID: 0 Amount: 125   BankID: 3 Amount:   75
 *
 *      Bank#3 Balance:  75  NumOfBanksLoaned: 1 BankID: 0 Amount: 125
 *
 *      Bank#4 Balance: 181  NumOfBanksLoaned: 1 BankID: 2 Amount: 125
 *
 *      The total assets of bank 3 are (75 + 125), which is under 201, so bank 3 is unsafe.
 *      After bank 3 becomes unsafe, the total assets of bank 1 fall below (125 + 40).
 *      Thus, bank 1 is also unsafe. The output of the program should be
 *
 *      Unsafe banks are 3 1
 *
 *      (Hint: Use a two-dimensional array borrowers to represent loans.
 *      borrowers[i][j] indicates the loan that bank i loans to bank j.
 *      Once bank j becomes unsafe, borrowers[i][j] should be set to 0.)
 *
/*Sebas*/
import java.util.*;

class Untitled {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		 
				System.out.print("Enter the number of banks: ");                                //Number Of banks
				int numberOfBanks = input.nextInt();  
		 
				System.out.print("Enter the limit: ");
				double limit = input.nextDouble();
		 
				double[][] bankBorrowed = new double[numberOfBanks][];            //Initializing the matrix to get which bank loaned and how much.
				double[] bankCurrentBalance = new double[numberOfBanks];
		 
				for(int i = 0; i < numberOfBanks; i++) {                                    //getting current value for each bank from 0 to n-1
					System.out.print("Enter current balance for bank " + i + ": ");
					bankCurrentBalance[i] = input.nextDouble();
				}
		 
				int[] borrow = new int[numberOfBanks];
		 
				for(int i = 0; i < numberOfBanks; i++) {                         //Stores the number of borrowers for each bank to use for loop.
					System.out.print("How many banks borrowed from bank " + i + ": ");
					borrow[i] = input.nextInt();
				}
		 
				for(int i = 0; i < 5; i++) {
							int length = borrow[i];
							bankBorrowed[i] = new double[borrow[i]];
							System.out.println(length); //Testing
							for(int j = 0; j < length; j++) {
								System.out.print("Enter the bank: "); //Useless line of code
								int bank = input.nextInt(); //Useless line of code
								System.out.print("Enter the amount: ");
								bankBorrowed[i][j] = input.nextDouble();
							}
						}
		 
				double[] total = getTotal(numberOfBanks, bankCurrentBalance, bankBorrowed, borrow); //Method ;)
				boolean[] isSafe = isTrue(limit, total, numberOfBanks); //Method ;)
		 
				System.out.print("The banks unsafe are: ");
				for(int i = 0; i < numberOfBanks; i++) {
					if(isSafe[i] == false) {
						System.out.print(i + " ");
					}
				}
		 
			}
		 
			public static double[] getTotal(int numberOfBanks, double[] bankCurrentBalance, double[][] bankBorrowed, int[] borrow){    
				//Getting the total
				double[] total = new double[numberOfBanks];
		 
				for(int i = 0; i < numberOfBanks; i++) {
					total[i] += bankCurrentBalance[i];
					for(int j = 0; j < borrow.length; j++) {
						total[i] += bankBorrowed[i][j];
					}
				}
				return total;
			}
		 
			public static boolean[] isTrue(double limit, double[] total, int numberOfBanks) {
				boolean[] isSafe = new boolean[numberOfBanks];
		 
				for(int i = 0; i < numberOfBanks; i++) {
					if(total[i] < limit) {
						isSafe[i] = false;
					} else {
						isSafe[i] = true;
					}
				}
				return isSafe;
			}
		}