/*Sebas*/
/*(Replace words) Write a program that replaces all occurrences of a word with a new word in all the files under a directory, recursively. Pass the parameters from the command line as follows:
java Exercise18_31 dirName oldWord newWord*/
import java.io.*;
import java.net.*;
import java.util.*;



class Untitled {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a directory: ");
		String path = "/Users/sebastienstvil/Movies/Test/Chapter1/Te";
		System.out.println("Enter Oldword, Newword: ");
		String[]words = input.next().split(",");
		
		try{
			File file = new File(path);
			System.out.println("\nReplacing words in directories.......\n");
			replaceOccurences(file, words[0], words[1]);
			System.out.println("\nProgram complete!\n");
		}catch(FileNotFoundException ex){
			ex.printStackTrace();
		}
	}
	
	public static void replaceOccurences(File file, String oldWord, String newWord) throws FileNotFoundException{
		if(!file.isDirectory() && !file.isFile()){
			throw new FileNotFoundException(file.getPath() + " is not a valid path");
		}
		
		
		
		File[]allFiles = file.listFiles();
		if(allFiles == null) return ;
		String s = "";
		if(allFiles != null){
			for(File e : allFiles){
				
				replaceOccurences(file, oldWord, newWord);
				
				if(e.isFile()){
					
					try(
						Scanner input = new Scanner(e);
						PrintWriter output = new PrintWriter(e);
					){
						while(input.hasNext()){
							s = input.nextLine();
						}
						
						if(s.length() > 0){
							
							output.write(s.replaceAll(oldWord, newWord));
						}
					}
				}
			}
		}
	}
}
