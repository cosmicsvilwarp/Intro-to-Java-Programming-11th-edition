/*Sebas*/
/*********************************************************************************
* (Create a binary data file) Write a program to create a file named             *
* Exercise17_02.dat if it does not exist. Append new data to it if it already    *
* exists. Write 100 integers created randomly into the file using binary I/O.    *
*********************************************************************************/
import java.io.*;

class Exercise_17_02 {
	public static void main(String[] args) throws IOException {
		
		File file = new File("/Users/sebastienstvil/Movies/Test/Exercise17_02.dat");
		boolean append = file.exists();
		
		try (
			// Create an output stream to the file
			// Append new data if file already exists
			FileOutputStream output = 
				new FileOutputStream(file, append);
		) {
			// Output 100 integers created randomly into the file
			for (int i = 0; i < 100; i++)
				output.write((int)(1 + Math.random() * 100));
		}
		
		//This is simply to read the program because it is in binary. **Not part of exercice
		try(
			FileInputStream input = new FileInputStream(file);
		){
			int r = 0;
			while((r = input.read()) != -1){
				System.out.print(r + " ");
			}
		}
	}
}