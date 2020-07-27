/*Sebas*/
import java.io.*;
import java.net.*;
import java.util.*;

/**
 * (Create a text file)
 * Write a program to create a file named Exercise17_01.txt if it does
 * not exist. Append new data to it if it already exists. Write 100
 * integers created randomly into the file using text I/O.
 * Integers are separated by a space.
 * Created by luizsa on 10/5/14.
 */
class Exercise_01 {

	public static void main(String[] args) throws IOException {
		//Create file object
		File file = new File("/Users/sebastienstvil/Movies/Test/Exercise17_01.txt");
		
		//boolean is true if file exists
		boolean append = file.exists();

		try (PrintWriter printWriter = new PrintWriter(new BufferedOutputStream(new FileOutputStream(file, append)))) {

			for (int i = 0; i < 100; i++) {
				printWriter.write((int) (Math.random() * (1000)) + " ");
			}
		}
	}
}