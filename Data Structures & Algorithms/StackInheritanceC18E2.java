import java.util.*;
/**********************************************************************************
* (Implement GenericStack using inheritance) In Listing 19.1, GenericStack is     *
* implemented using composition. Define a new stack class that extends ArrayList. *
*                                                                                 *
* Draw the UML diagram for the classes and then implement GenericStack.           *
* Write a test program that prompts the user to enter five strings and displays   *
* them in reverse order.                                                          *
**********************************************************************************/

class GenericStack1<E> extends ArrayList<E>{	
	
	/** Returns the size of the stack*/
	public int getSize(){
		return size();
	}

	/** Return the element at the top of the stack */
	public E peek() {
		return get(size() - 1);
	}

		/** Push and element on to the stack */
	public void push(E o) {
		add(o);
	}

	/* Return and remove the element 
	 * on the top of the stack */
	public E pop() {
		E o = get(size() - 1);
		remove(size() - 1);
		return o;
	}
	/** Returns true if stack is empty otherwise false*/
	public boolean isEmpty(){
		return super.isEmpty();
	}
	
	@Override // Override the string method in the ArrayList class
	public String toString(){
		return "Stack: " + toString();
	}
}

class Exercise_19_02 {
	/** Main method */
	public static void main(String[] args) {
		// Create a stack to hold strings 
		// and add three strings to the stack

		GenericStack1<String> stack = new GenericStack1<>();
		Scanner input = new Scanner(System.in);
		System.out.print("Enter 5 strings: ");
		for (int i = 0; i < 5; i++)
			stack.push(input.next());

		System.out.println("Displaying strings in reverse order: ");
		while(!stack.isEmpty()) {
			System.out.println(stack.pop());
		}
	}
}