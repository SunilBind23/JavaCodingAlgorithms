package DSA;

public class Reverse_an_Integer {
	public static void Reverse(int value) {

		int num = 12345;
		int rev = 0;

		while (num != 0) {
			int digit = num % 10; // last digit nikalna
			rev = rev * 10 + digit; // reverse banate jana
			num = num / 10; // last digit hatana
		}

		System.out.println("Reversed Number: " + rev);
	}

	public static void main(String[] args) {
		RevByStrig(1234555);
		// Reverse(12345);
	}

	public static void RevByStrig(int num) {

		String str = Integer.toString(num); // int → String
		String revStr = "";

		for (int i = str.length() - 1; i >= 0; i--) {
			revStr += str.charAt(i); // last se char add karte jana
		}
		int reversedNum = Integer.parseInt(revStr); // String → int
		System.out.println("Reversed Number: " + reversedNum);

	}
}
