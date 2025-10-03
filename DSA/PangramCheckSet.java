package DSA;

import java.util.HashSet;
import java.util.Set;

public class PangramCheckSet {
	public static boolean PangramCheck(String str) {
		str = str.toLowerCase();
		Set<Character> letters = new HashSet();
		for (char c : str.toCharArray()) {
			if (c >= 'a' && c <= 'z') {
				letters.add(c);
			}
		}
		return letters.size() == 26;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean check = PangramCheck("The quick brown fox jumps over the lazdy dog");

		System.out.println(PangramCheck("hello java"));
		System.out.println(check);
	}

}
