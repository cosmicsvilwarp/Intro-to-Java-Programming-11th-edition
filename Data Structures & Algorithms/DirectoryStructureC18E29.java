/*Sebas*/
import java.io.*;
import java.net.*;
import java.util.*;



class Untitled {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter filepath:");
		String path = input.next();
		try{
			displayFiles(new File(path));
		}catch(FileNotFoundException ex){
			ex.printStackTrace();
		}
	}
	/** non-recursive version */
	public static void displayFiles(File file, int a) throws FileNotFoundException {
		if(!file.isDirectory() && !file.isFile()){
			throw new FileNotFoundException(file.getPath() + " is not a valid path.");
		}
		ArrayList<File> allFiles = new ArrayList<>(500);
		allFiles.add(file);
		for (int i = 0; i < allFiles.size(); i++) {
			File f = allFiles.get(i);
			if (f.isDirectory())
				System.out.println("+--" + f.getName());
			if (f.isFile())
				System.out.println("	+--" + f.getName());
			else if (f.listFiles()!= null && f.listFiles().length != 0)
				Collections.addAll(allFiles, f.listFiles());
		}
	}
	
	/** recursive version */
	public static void displayFiles(File file) throws FileNotFoundException {
		if(!file.isDirectory() && !file.isFile()){
			throw new FileNotFoundException(file.getPath() + " is not a valid path.");
		}
		if(file.isFile()) return;
		
		File[]directory = file.listFiles();
		for(File e : directory){
			displayFiles(e);
			if(e.isDirectory())
				System.out.println("+--" + e.getName());
			else if (e.isFile())
				System.out.println("	+--" + e.getName());
		}
	}
}
		
			