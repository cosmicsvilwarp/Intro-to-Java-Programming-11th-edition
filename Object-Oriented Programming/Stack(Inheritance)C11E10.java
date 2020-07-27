import java.util.*;

/*********************************************************************************
* (Implement MyStack using inheritance) In Listing 11.10, MyStack is implemented *
* using composition. Define a new stack class that extends ArrayList.            *
* Draw the UML diagram for the classes and then implement MyStack. Write a test  *
* program that prompts the user to enter five strings and displays them in       *
* reverse order.                                                                 *
*********************************************************************************/

/*****************************
*           MyStack          *
*----------------------------*
* -list: ArrayList<Object>   *
* +MyStack()                 *
* +peek(): Object            *
* +pop(): Object             *
* +push(o: Object): void     *
*****************************/
// Implement MyStack class
class MyStack 
		extends ArrayList<Object> {
	// Data fields
	private ArrayList<Object> list;

	// Constructor
	/** Construct a default MyStack object */
	public MyStack() {
		list = new ArrayList<Object>();
	}

	/** Add a new element to 
	  * the top of this stack */
	public void push(Object o) {
		list.add(0, o);
	}

	/** Return the top element in this  
	  * stack without removing it */
	public Object peek() {
		return list.get(0);
	}

	/** Return an remove the 
	  * top element in this stack */
	public Object pop() {
		Object o = list.get(0);
		list.remove(0);
		return o;
	}

	/** Return a string of all elements in MyStack */
	@Override
	public String toString() {
		return "stack: " + list.toString();
	}
}


class Exercise_11_10 {
	/** Main method */
	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);

		// Create a MyStack
		MyStack stack = new MyStack();

		// Prompt the user to enter five strings
		System.out.print("Enter five strings: ");
		for (int i = 0; i < 5; i++) {
			stack.push(input.next());	
		}

		// Display in reverse order
		System.out.println("Stack: " + stack.toString());
	}
}