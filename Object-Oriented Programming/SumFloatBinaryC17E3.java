/*Sebas*/
import java.io.*;
import java.net.*;
import java.util.*;



class Untitled {
	public static void main(String[] args) throws IOException {
		float sum = 0;
		
		File file = new File("/Users/sebastienstvil/Movies/Test/Exercise17_07.dat");
		try(
			DataOutputStream output = new DataOutputStream(new BufferedOutputStream(
										new FileOutputStream(file)));
		){
			output.writeFloat(45.64f);
			output.writeFloat(10.33f);
			output.writeFloat(30.01f);
			output.writeFloat(14.02f);
		}
		try(
			DataInputStream input = new DataInputStream(new BufferedInputStream(new FileInputStream(file)));
		){
			while(true)
				sum += input.readFloat();
		}catch(EOFException ex){
			System.out.println("The sum is " + sum);
		}
	}
}