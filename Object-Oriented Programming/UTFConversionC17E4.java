/*Sebas*/
/*********************************************************************************
* (Convert a text file into UTF) Write a program that reads lines of characters  *
* from a text file and writes each line as a UTF-8 string into a binary file.    *
* Display the sizes of the text file and the binary file. Use the following      *
* command to run the program:                                                    *
*                                                                                *
* java Exercise17_04 Welcome.java Welcome.utf                                    *
*********************************************************************************/
import java.io.*;
import java.util.*;

class Exercise_17_04 {
	public static void main(String[] args) throws IOException {
		// Check java usage
		/*if (args.length != 2) {
			System.out.println("Usage: java Exercise_17_04 SourceFile TargetFile");
			System.exit(1);
		}*/
		
		File sourcefile = new File("/Users/sebastienstvil/Movies/Test/lincoln.txt");
		File targetfile = new File("/Users/sebastienstvil/Movies/Test/Welcome.utf");
;
		if (!sourcefile.exists()) {
			System.out.println(sourcefile.getAbsolutePath());
			System.out.println("File does not exist...");
			System.exit(1);
		}

		try (
			// Read lines of characters from text file and 
			// write each line as UTF-8 string to binary file
			Scanner input = new Scanner(sourcefile);
			DataOutputStream output = 
				new DataOutputStream(new FileOutputStream(targetfile));
		) {
			String s;
			int fileSize = 0;
			while (input.hasNext()){
				s = input.nextLine();
				output.writeUTF(s);
				fileSize += s.length();
			}
			System.out.println(sourcefile.getName() + " = " + fileSize + " bytes");
			System.out.println(targetfile.getName() + " = " + output.size() + " bytes");
		}
	}
}