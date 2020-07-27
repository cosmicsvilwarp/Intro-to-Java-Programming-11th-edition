/*Sebas*/
/*(Prime number iterator) Define an iterator class named PrimeIterator for iterating prime numbers. The constructor takes an argument that specifies the limit of the maximum prime number. For example, new PrimeIterator(23302) creates an iterator that iterates prime numbers less than or equal to 23302. Write a test program that uses this iterator to display all prime numbers less than or equal to 120000.*/

import java.util.*;

class Demo{
	public static void main(String[] args) {
		Iterator<Integer> iterator = new PrimeIterator(120000);
		while(iterator.hasNext())
			System.out.println(iterator.next());
	}
}

class PrimeIterator implements java.util.Iterator<Integer>{
	int current = 1;
	int limit = 0;
	
	public PrimeIterator(int limit){
		this.limit = limit;
	}
	@Override
	public Integer next(){
		return current;
	}
	public boolean isPrime(int n){
		if(n <= 1)
			return false;
			
		for(int k = 2; k*k <= n; k++){
			if(n % k == 0)
				return false;
		}
		return true;
	}
	
	@Override
	public boolean hasNext(){
		current++;
		
		while(true){
			if(isPrime(current))
				break;
			current++;
		}
		if(current >= limit)
			return false;
		else
			return true;
	}
}