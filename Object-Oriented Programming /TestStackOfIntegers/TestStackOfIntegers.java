/*Sebas*/
/**
 * 
 * Listing 10.7(refer to Listing 10.8)
 *
 * This program uses the class "StackOfIntegers" to create a stack, store ten
 * integers 0, 1, 2, ... , and 9, and displays them in reverse order.
 *
 */
public class TestStackOfIntegers {
	public static void main(String[] args) {
		// Instantiate
		StackOfIntegers stack = new StackOfIntegers();

		// Store int values(0, 1, .... ,and 9) into the stack
		for (int i =0; i < 10; i++)
			stack.push(i);

		// Display the stack in reverse order. Stack will be empty finally.
//        while(stack.getSize() != 0)
//        same as below
		while(!stack.empty())
			System.out.print(stack.pop() + " ");
	}
}