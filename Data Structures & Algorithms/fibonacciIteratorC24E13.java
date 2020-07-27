/*Sebas*/
/*(Fibonacci number iterator) Define an iterator class named Fibonacci Iterator for iterating Fibonacci numbers. The constructor takes an argument that specifies the limit of the maximum Fibonacci number. For example, new FibonacciIterator(23302) creates an iterator that iterates Fibonacci num- bers less than or equal to 23302. Write a test program that uses this iterator to display all Fibonacci numbers less than or equal to 120000.*/

import java.math.*;
import java.util.*;

class Demo{
	public static void main(String[] args) {
		//Prompts user for input
		System.out.print("Enter the limit of the maximum Fibonacci number:  ");
		BigInteger number = new BigInteger(new Scanner(System.in).next());
		
		//Displays results
		Iterator<BigInteger> iterator = new FibonacciIterator(number);
		while(iterator.hasNext())
			System.out.println(iterator.next());
	}
}

class FibonacciIterator implements java.util.Iterator<BigInteger> {
	int current = 0;
	BigInteger limit = BigInteger.ZERO;
	static BigInteger[]f = new BigInteger[10000];
	
	public FibonacciIterator(BigInteger limit){
		this.limit = limit;
		fibCalculator();
	}
	
	@Override
	public BigInteger next(){
		return f[current++];
	}
	
	public void fibCalculator(){
		
		f[0] = BigInteger.ZERO;
		f[1] = BigInteger.ONE;
		for(int i = 2 ; i < f.length; i++){
			f[i] = f[i - 2].add(f[i - 1]) ;
		}
	}
	@Override
	public boolean hasNext(){
		while(f[current].compareTo(limit) < 0)
			return true;
		return false;
	}
}