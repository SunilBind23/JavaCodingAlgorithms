package DSA;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class CountOccurence {
	public static void Occurence(String str) {

		Map<Character, Integer> mapCount = new LinkedHashMap<Character, Integer>();
		for (char ch : str.toCharArray()) {
			if (Character.isLetterOrDigit(ch)) {
				mapCount.put(ch, mapCount.getOrDefault(ch, 0) + 1);
			}
		}
		for (Map.Entry<Character, Integer> entry : mapCount.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Occurence("Hello Java");
	}

package DSA;

import java.util.HashMap;
import java.util.Map;

public class MapPractice {
	
	public static void countFrequencyofWord(String str) {
		Map<String, Integer> map = new HashMap<>();
		str = str.toLowerCase();
		String stArr[] = str.split(" ");
		for (int i = 0; i < stArr.length; i++) {
			String word = stArr[i];
			if (map.containsKey(word)) {
				map.put(word, map.getOrDefault(word, 0) + 1);
			} else {
				map.put(word, 1);
			}
		}
		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey() + "= " + entry.getValue());
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		countFrequencyOfCharacter("Java Programming");
		countFrequencyofWord("I Love Java. I Love India");
	}

}

	


