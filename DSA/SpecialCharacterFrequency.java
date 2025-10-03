package DSA;

import java.util.HashMap;
import java.util.Map;

public class SpecialCharacterFrequency {
	public static void Special_Character_Frequency(String str) {
		str = str.toLowerCase();
		Map<Character, Integer> letters = new HashMap();
		for (char ch : str.toCharArray()) {
			if (!Character.isLetterOrDigit(ch)) {
				letters.put(ch, letters.getOrDefault(ch, 0) + 1);
			}

		}
		for (Map.Entry<Character, Integer> entry : letters.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Special_Character_Frequency("dfdsj#%^&%^&^%^&$%u7");
	}

}
