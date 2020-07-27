/*Sebas*/

/*********************************************************************************
* (Search Web) Modify Listing 12.18 WebCrawler.java to search for the word       *
* Computer Programming starting from the URL http://cs.armstrong.edu/liang.      *
* Your program terminates once the word is found. Display the URL for the page   *
* that contains the word.                                                        *
*********************************************************************************/
import java.io.*;
import java.net.*;
import java.util.*;

class Exercise_12_33 {
	/** Main method */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// URL to start search
		System.out.println("Enter a url: ");
		String startingURL = input.next();
		
		// Word to be searched for
		System.out.println("Enter searchWord: ");
		String searchWord = input.next();

		// Invoke crawler
		crawler(startingURL, searchWord);
	}
	public static void crawler(String startingURL, String word) {
			ArrayList<String> listOfPendingURLs = new ArrayList<>();
			ArrayList<String> listOfTraversedURLs = new ArrayList<>();

			listOfPendingURLs.add(startingURL);
			while (!listOfPendingURLs.isEmpty() &&
					listOfTraversedURLs.size() <= 100) {
				String urlString = listOfPendingURLs.remove(0);
				if (!listOfTraversedURLs.contains(urlString)) {
					listOfTraversedURLs.add(urlString);
					System.out.println("Craw " + urlString);

					for (String s: getSubURLs(urlString, word)) {
						if (!listOfTraversedURLs.contains(s))
							listOfPendingURLs.add(s);
					}
				}
			}
		}

	public static ArrayList<String> getSubURLs(String urlString, String word) {
		ArrayList<String> list = new ArrayList<>();

		try {
			java.net.URL url = new java.net.URL(urlString);
			Scanner input = new Scanner(url.openStream());
			int current = 0;
			
			//Iterate through each line of website
			while (input.hasNext()) {
				String line = input.nextLine();
				
				//Look for word
				if(line.contains(word)){
					System.out.println("The word " + word + 
						" was found on URL: " + urlString);
					System.exit(0);// exits if the url contains the specified word */
				}
				
				//Look for website
				current = line.indexOf("http:", current);
				while (current > 0) {
					int endIndex = line.indexOf("\"", current);
					if (endIndex > 0) { // Ensure that a correct URL is found
						list.add(line.substring(current, endIndex));
						current = line.indexOf("http:", endIndex);
					}
					else
						current = -1;
				}
			}
		}
		catch (Exception ex) {
			System.out.println("Error: " + ex.getMessage());
		}

		return list;
	}
}