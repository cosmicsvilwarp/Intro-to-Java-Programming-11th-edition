/*Sebas*/
import java.io.*;
import java.net.*;
import java.util.*;
import java.util.stream.*;
import java.nio.file.*;


class Demo {
	public static void main(String[] args) throws IOException {
		System.out.println("Enter txt file path:");
		//Create file object
		String path = new Scanner(System.in).next();
		File file = new File(path);
		
		//Check if file exists 
		if(!file.exists())
			throw new FileNotFoundException(file.getName() + " does not exist");
			
		List<String>list = Files.lines(file.toPath()).parallel().map(line -> 
				Stream.of(line.split("[\\s+\\p{Punct}]"))).reduce((e1, e2) -> Stream.concat(e1, e2)).get()
				.filter(e -> e.length() > 0)
				.collect(Collectors.toList());
			//	.forEach((k) -> System.out.println(k + " "));	
				
		Collections.sort(list);	
		
		list.forEach(e -> System.out.println(e));
	}
}