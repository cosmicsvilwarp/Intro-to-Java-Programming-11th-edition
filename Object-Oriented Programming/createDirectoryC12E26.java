/*Sebas*/
/*********************************************************************************
* (Create a directory) Write a program that prompts the user to enter a          *
* directory name and creates a directory using the File’s mkdirs method. The     *
* program displays the message “Directory created successfully” if a directory   *
* is created or “Directory already exists” if the directory already exists.      *
*********************************************************************************/
import java.io.*;
import java.net.*;
import java.util.*;

class Untitled {
	public static void main(String[] args) {
		// Create a Scanner object
		Scanner input = new Scanner(System.in);

				// Prompt the user to enter a directory name
				System.out.print("Enter directory name: ");
				File dir = new File(input.next());

				// Check if directory exists
				if (dir.exists()) {
					System.out.println("Directory already exists");
					System.exit(0);
				}
				else{
					dir.mkdir();
					System.out.println("Directory created successfully");
				}
	}
}