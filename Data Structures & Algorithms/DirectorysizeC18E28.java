/*Sebas*/
//Find folder size using recursion 
import java.io.*;
import java.net.*;
import java.util.*;

class DirectorySize{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter filepath: ");
		String path = input.next();
		
		try{
			System.out.println("The filepath size is " + getDirectory(new File(path)));
		}catch(FileNotFoundException ex){
			ex.printStackTrace();
		}
	}
	
	/** recursive version */
	public static long getDirectory(File file, int a) throws FileNotFoundException{
		if(!file.isDirectory() && !file.isFile()){
			throw new FileNotFoundException(file.getAbsolutePath() + " is not a valid path");
		}
		
		//base case
		if(file.isFile()) return file.length();
		long size = 0;
		
		File[]directory = file.listFiles();
		for(File e : directory)
			size += getDirectory(e);
			
		return size;
	}
	/** non-recursive version */
	public static long getDirectory(File file) throws FileNotFoundException {
		long size = 0;
			ArrayList<File> allFiles = new ArrayList<>(500);
			allFiles.add(file);
			for (int i = 0; i < allFiles.size(); i++) {
				File f = allFiles.get(i);
				if (f.isFile())
					size += f.length();
				else if (f.listFiles()!= null && f.listFiles().length != 0)
					Collections.addAll(allFiles, f.listFiles());
			}
			return size;
	}
}