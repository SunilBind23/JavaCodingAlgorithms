package DSA;

public class ReverseVowels {
	public static String ReverseVovelsFromString(String str) {
		char[] arr = str.toCharArray();
		int left = 0, right = arr.length - 1;
		while (left < right) {
			if (!isVowel(arr[left])) {
				left++;
			} else if (!isVowel(arr[right])) {
				right--;
			} else {
				char temp = arr[left];
				arr[left] = arr[right];
				arr[right] = temp;
				left++;
				right--;

			}
		}
		return new String(arr);
	}

	private static boolean isVowel(char ch) {
		return "aeiouAEIOU".indexOf(ch) != -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(ReverseVovelsFromString("hello")); // Output: holle
		System.out.println(ReverseVovelsFromString("leetcode")); // Output: leotced
	}

}
