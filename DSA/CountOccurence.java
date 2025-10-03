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

}
