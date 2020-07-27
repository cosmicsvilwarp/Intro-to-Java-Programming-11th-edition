/*Sebas*/
/*(Count the occurrences of words in a text file) Rewrite Programming Exercise 21.8 using streams.*/
import java.io.*;
import java.nio.file.*;
import java.util.*;
import java.util.stream.*;

class Demo {
	public static void main(String[] args) throws IOException {
		if (args.length != 1) {
			System.out.println(
				"Usage: java Exercise30_18 fullfilename");
			System.exit(1);
		}

		String filename = args[0];

		Files.lines(new File(filename).toPath()).parallel().map(line -> 
			Stream.of(line.split("[\\s+\\p{Punct}]"))).reduce((e1, e2) -> Stream.concat(e1, e2)).get()
			.filter(e -> e.length() > 0).collect(
				Collectors.groupingBy(String::toLowerCase, TreeMap::new,
					Collectors.counting()))
			.forEach((k, v) -> System.out.println(k + " " + v));
	}
}
