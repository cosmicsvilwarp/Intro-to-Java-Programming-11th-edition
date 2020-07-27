/*(NumberFormatException) Listing 7.9, Calculator.java, is a simple com- mand-line calculator. Note the program terminates if any operand is nonnumeric. Write a program with an exception handler that deals with nonnumeric operands; then write another program without using an exception handler to achieve the same objective. Your program should display a message that informs the user of the wrong operand type before exiting (see Figure 12.12).*/

class CalculatorWithException {
	/** Main method */
	public static void main(String[] args) throws NumberFormatException {
		// Check number of strings passed
		if (args.length != 3) {
			System.out.println(
				"Usage: java Calculator operand1 operator operand2");
			System.exit(0);
		}

		// The result of the operation
		int result = 0;

		// Exeception handler to deal with nonnumeric operands
		try {
			// Determine the operator
			switch (args[1]){
				case "+" : result = Integer.parseInt(args[0]) +
										  Integer.parseInt(args[2]);
							  break;
				case "-" : result = Integer.parseInt(args[0]) -
										  Integer.parseInt(args[2]);
							  break;
				case "*" : result = Integer.parseInt(args[0]) *
										  Integer.parseInt(args[2]);
							  break;
				case "/" : result = Integer.parseInt(args[0]) /
										  Integer.parseInt(args[2]);
							  break;
			}	

			// Display result
			System.out.println(args[0] + ' ' + args[1] + ' ' + args[2]
				+ " = " + result);
		} 
		catch (NumberFormatException ex) {
			System.out.println("Wrong Input: " + 
				ex.getMessage().substring(ex.getMessage().indexOf("\"") + 1, 
					ex.getMessage().lastIndexOf("\"")));
		}
	}
}