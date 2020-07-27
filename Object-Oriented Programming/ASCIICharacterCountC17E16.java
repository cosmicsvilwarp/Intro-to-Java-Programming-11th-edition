/*Sebas*/
import java.io.*;
import java.net.*;
import java.util.*;



class Untitled {
	public static void main(String[] args)throws Exception {
		File file = new File("/Users/sebastienstvil/Movies/Test/lincoln.txt");
		int[]count = new int[128];
		
		try(
			BufferedInputStream input = new BufferedInputStream(new FileInputStream(file));
		){
			int buffer = 0;
			while((buffer = input.read()) != -1){
				count[(byte)buffer]++;
			}
		}
		
		System.out.printf("%15s%15s\n", "ASCII Code", "Counts");
		for(int i = 0; i < count.length; i++){
			if(count[i] != 0){
				System.out.printf("%15d%15d\n", i, count[i]);
			}
		}
	}
}