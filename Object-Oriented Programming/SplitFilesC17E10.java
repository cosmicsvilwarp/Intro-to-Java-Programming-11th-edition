/*Sebas*/
/*********************************************************************************
* (Split files) Suppose you want to back up a huge file (e.g., a 10-GB AVI file) *
* to a CD-R. You can achieve it by splitting the file into smaller pieces and    *
* backing up these pieces separately. Write a utility program that splits a      *
* large file into smaller ones using the following command:                      *
*                                                                                *
* java Exercise17_10 SourceFile numberOfPieces                                   *
*                                                                                *
* The command creates the files SourceFile.1, SourceFile.2, . . . , SourceFile.n *
* where n is numberOfPieces and the output files are about the same size.        *
*********************************************************************************/
import java.io.*;
import java.net.*;
import java.util.*;

class Untitled {
	public static void main(String[] args) throws IOException {
		if(args.length != 2){
			System.out.println("Usage: SourceFile numberOfPieces");
			System.exit(0);
		}
		File file = new File(args[0]);
		if(!file.exists()){
			throw new IOException(file.getName() + " does not exist");
		}
		else if(file.isDirectory()){
			System.out.println("Path is a directory. Please try again!");
			System.exit(1);
		}
		
		int numberOfPieces = Integer.parseInt(args[1]);
		int partitionSize = (int)file.length() / numberOfPieces;
		
		try (
			BufferedInputStream input = new BufferedInputStream(new FileInputStream(file));
			){
			for(int i = 0; i <= numberOfPieces; i++){
				
				try(
					BufferedOutputStream output =  new BufferedOutputStream(new FileOutputStream(new File(args[0] + "." + i)));
					){
					int currentByte = 0;
					int buffer = 0;
					while(currentByte++ < partitionSize && (buffer = input.read()) != -1){
						output.write((byte)buffer);
					}
				}
			}
		}
	}
}