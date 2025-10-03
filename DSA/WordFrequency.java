package DSA;

import java.util.HashMap;
import java.util.Map;

public class WordFrequency {

	public static void main(String[] args) {
		String paragraph = "Selenium is fun. Selenium is powerful. Java with Selenium is great";
		paragraph = paragraph.toLowerCase().replaceAll("[^a-zA-Z0-9\\s]", "");
		System.out.println(paragraph);

		String words[] = paragraph.split("\\s+");

		Map<String, Integer> wordcount = new HashMap();
		
		for (String word : words) {
			wordcount.put(word, wordcount.getOrDefault(word, 0) + 1);

		}

		// Step 4: Print the word frequencies
		for (Map.Entry<String, Integer> entry : wordcount.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
	}
}
