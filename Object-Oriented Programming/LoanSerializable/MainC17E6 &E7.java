/*Sebas*/
/*********************************************************************************
*    (Store Loan objects) The Loan class in Listing 10.2 does not implement      *
*    Serializable. Rewrite the Loan class to implement Serializable. Write a     *
*    program that creates five Loan objects and stores them in a file named      *
*    Exercise17_06.dat.                                                          *
*********************************************************************************/

import java.io.*;
import java.net.*;
import java.util.*;

class Untitled {
	public static void main(String[] args) throws ClassNotFoundException, IOException {
		ArrayList<Object> list = new ArrayList<>();
		
		try ( // Create an output stream for the file Exercise17_06.dat
			ObjectOutputStream output = new ObjectOutputStream(new BufferedOutputStream(
										new FileOutputStream("/Users/sebastienstvil/Movies/Test/Exercise17_06.dat")));
		){
			// Create five Loan objects
			for(int i = 0; i < 5; i++){
				output.writeObject(new Loan(5.6, 10, 50 + (int)(Math.random() * 101)));
			}
		}
		
		try (//Create input stream
			ObjectInputStream input = new ObjectInputStream(new BufferedInputStream(new FileInputStream("/Users/sebastienstvil/Movies/Test/Exercise17_06.dat")));
		){
			while(true)
				list.add((Loan)(input.readObject()));
		}
		catch(EOFException ex){
			System.out.println("All data has been read");
			System.out.println("\nNow printing files........\n\n");
			}
		finally {
			for(Object e : list){
				System.out.println(e.toString() + "\n");
			}
		}
	}
}