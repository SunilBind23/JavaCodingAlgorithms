package DSA;

public class ReplaceVowels {
	public static String ReplaceVowelsToX(String str) {
		char[] chArr = str.toCharArray();
		for (int i = 0; i <= chArr.length - 1; i++) {
			if (isVowel(chArr[i])) {
				chArr[i] = 'x';
			}
		}
		return new String(chArr);
	}

	private static boolean isVowel(char ch) {
		return "aeiouAEIOU".indexOf(ch) != -1;
	}

	public static void main(String[] args) {
		System.out.println(ReplaceVowelsToX("hello")); // hxllx
		System.out.println(ReplaceVowelsToX("LeetCode")); // LxxtCxdx
	}
}
