package DSA;

public class Palindrome {
	public static void PalindromeNumer(int num) {
		int pelindrome = 0;
		int temp = num;
		while (num != 0) {
			pelindrome = pelindrome * 10 + num % 10;
			num /= 10;

		}
		if (temp == pelindrome) {
			System.out.println(temp + " Number is Pelindrom " + pelindrome);
		} else {
			System.out.println(temp + " Number is not Pelindrom " + pelindrome);
		}

	}

	public static void PalindromeString(String str) {

		String rev = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			rev = rev + str.charAt(i);
		}
		if (str.equals(rev)) {
			System.out.println("Palindrome String");
		} else {
			System.out.println("Not Palindrome");
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PalindromeNumer(0100);
		PalindromeString("madam");
		String str = "madam";
		StringBuilder stb = new StringBuilder(str);
		stb.reverse();
		System.out.println(stb);
	}

}
