/*Sebas*/
import java.io.*;
import java.net.*;
import java.util.*;



class Untitled {
	public static void main(String[] args)throws IOException, EOFException {
		double sum = 0;
		
		try(
			DataOutputStream output = new DataOutputStream(new FileOutputStream("/Users/sebastienstvil/Movies/Test/Exercise17_03.dat"));
		){
			output.writeDouble(3.10);
			output.writeDouble(8.79);
			output.writeDouble(2.81);
			output.writeDouble(5.20);
		}
		try(// Create an data input stream for file Exercise17_03.dat
			DataInputStream input = new DataInputStream(new FileInputStream("/Users/sebastienstvil/Movies/Test/Exercise17_03.dat"));
		)
		{
			//// Read and sum the doubles from the file
			while(true)
				sum += input.readDouble();
		}catch(EOFException ax){ //detect end of file
			System.out.println("The Sum is " + sum);
		}
	}
}