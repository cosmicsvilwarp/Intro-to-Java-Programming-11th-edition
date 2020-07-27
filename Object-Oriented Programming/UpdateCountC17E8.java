/*Sebas*/
/*********************************************************************************
* (Update count) Suppose you wish to track how many times a program has been     *
* executed. You can store an int to count the file. Increase the count by 1 each *
* time this program is executed. Let the program be Exercise17_08 and store the  *
* count in Exercise17_08.dat.                                                    *
*********************************************************************************/
import java.io.*;
import java.net.*;
import java.util.*;



class Untitled {
	public static void main(String[] args) throws IOException {
		//File textfile = new File("/Users/sebastienstvil/Movies/Test/Exercise17_08.text");
		File file = new File("/Users/sebastienstvil/Movies/Test/Exercise17_08.dat");
		
		try (
			RandomAccessFile raf = new RandomAccessFile(file, "rw");
		){
			//takes value of 1 if file is ran for first time otherwise increments by 1
			int count = (raf.length() == 0)? 1 : raf.readInt() + 1; 
			raf.seek(0); // Move the file pointer to the beginning
			raf.writeInt(count); //inserts value of count in dat file
			
			//Displays program execution count 
			System.out.println("The count is " + count);
		}
	}
}