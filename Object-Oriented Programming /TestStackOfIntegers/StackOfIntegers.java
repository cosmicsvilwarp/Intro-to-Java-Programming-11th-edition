package TestStackOfIntegers;
/**
 * Listing 10.8
 *
 * This class encapsulates the stack storage and provides the operation
 * for manipulating the stack.
 */
public class StackOfIntegers {
	private int[] elements;
	private int size; // the number of integers in the stack
	public static final int DEFAULT_CAPACITY = 16;

	/**
	 * Construct a stack with the default capacity 16(Default constructor)
	 */
	public StackOfIntegers() {
		this(DEFAULT_CAPACITY);
	}

	/**
	 * Construct a stack with the specified maximum capacity
	 */
	public StackOfIntegers(int capacity) {
		elements = new int[capacity];
	}

	/**
	 * Push a new integer to the top of the stack
	 */
	public void push(int value) {
		// If the stack is full, create a new array of twice the current capacity
		// and assign the reference of the new array to the current array in the stack
		if (size >= elements.length) {
			int[] temp = new int[elements.length * 2];
			System.arraycopy(elements, 0, temp, 0, elements.length);
		}

		elements[size++] = value;
	}

	/**
	 * Return and remove the top element from the stack
	 */
	public int pop() {
		return elements[--size]; // used pre-decrement!
		// After return elements[size], it decrease the size of element by 1
	}

	/**
	 * Return the top element from the stack without removing it from the stack
	 */
	public int peek() {
		return elements[size - 1];
	}

	/**
	 * Test whether the stack from the stack
	 * Returns true if the stack is empty
	 */
	public boolean empty() {
		return size == 0;
	}

	/**
	 * Return the number of elements in the stack
	 */
	public int getSize() {
		return size;
	}
}