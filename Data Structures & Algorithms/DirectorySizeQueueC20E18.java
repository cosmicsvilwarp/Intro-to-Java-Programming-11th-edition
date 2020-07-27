/*Sebas*/
import java.io.*;
import java.net.*;
import java.util.*;

//Find directory size, use queue

class Untitled {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter directory path: ");
		String path = "/Users/sebastienstvil/Downloads";
		File file = new File(path);
		if(!file.exists()){
			throw new FileNotFoundException(file.getName() + " is not a valid path!");
		}
		//Get directory size
		long size = getSize(file);
		System.out.println("The size of the directory is " + size);
	}
	public static long getSize(File file){
		long size = 0;
		Queue<File>directory = new LinkedList<>();
		directory.add(file);
		
		while(!directory.isEmpty()){
			File t = directory.poll();
			if(t.isFile()){
				size += t.length();
			}
			else{
				Collections.addAll(directory, t.listFiles());
			}
		}
		return size;
	}
}