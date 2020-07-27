/*Sebas*/
/**
 * (Find words) Write a program that finds all occurrences of a
 * word in all the files under a directory, recursively.
 * Pass the parameters from the command line as follows:
 *
 * java Exercise18_30 dirName word
 *
 * 
 */
import java.io.*;
import java.net.*;
import java.util.*;



class CountOccurences {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("****Program counts word occurences****\n");
		System.out.println("Enter file path: ");
		String path = input.next();
		System.out.println("Enter word: ");
		String word = input.next();
		
		try{
			File file = new File(path);
			System.out.println("\nSearching...\n");
			System.out.println("The count of " + word + " in " + file.getName() + " is " + getCount(file, word));
			System.out.println("\nSearch Complete.");
		}catch(FileNotFoundException ex){
			ex.printStackTrace();
		}
	}
	/*** recursive version ***/
	public static long getCount(File file, String word, int a) throws FileNotFoundException{
		if(!file.isDirectory() && !file.isFile()){
			throw new FileNotFoundException(file.getAbsolutePath() + " is not a valid path");
			}

//recursive search over your files. Use ListfFiles() to denote all files within directories and then traverse the file tree down.

		File[] files = file.listFiles();
		int count = 1;
		if(files != null){
			for (File f : files)
				if (f.isFile()){
					try(
						Scanner input = new Scanner(f);
						){
							while(input.hasNext()){
								String line = input.nextLine();
								if(line.contains(word)){
									count += getCount(f, word);
								}
							}
						}
				}
		}
		return count;
	}
	/*** non recursive version ***/  
	public static long getCount(File file, String word) throws FileNotFoundException{
		if(!file.isDirectory() && !file.isFile()){
			throw new FileNotFoundException(file.getAbsolutePath() + " is not a valid path");
		}
		
		long count = 0;
		ArrayList<File>allfiles = new ArrayList<>();
		allfiles.add(file);
		for(int i = 0; i < allfiles.size(); i++){
			
			File e = allfiles.get(i);
			
			if(e.isFile()){
				try (
					Scanner input = new Scanner(e);
				){
					while(input.hasNext()){
						String line = input.nextLine();
						if(line.contains(word))
							count++;
					}
				}
			}
			if(e.listFiles()!= null && e.listFiles().length != 0){
				Collections.addAll(allfiles, e.listFiles());
			}
		}
		return count;
	}
}
				
				