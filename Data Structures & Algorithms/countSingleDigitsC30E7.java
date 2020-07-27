/*Sebas*/
/*30.5 (Count single digits) Rewrite Programming Exercise 7.7 using streams.*/

import java.io.*;
import java.net.*;
import java.util.*;
import java.util.stream.*;


class Demo {
	public static void main(String[] args) {
		//Generate 200 random integrers between 0 -9
		int[]values = new Random().ints(200, 0, 10).toArray(); 
		
		IntStream.of(values).mapToObj(e -> e) //map to Object stream
			.collect(Collectors.groupingBy(e -> e, TreeMap::new, Collectors.counting())) //Terminal operation
			.forEach((key, value) -> System.out.println(key + " " + value)); //Print results
	}
}