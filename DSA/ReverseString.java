package DSA;

public class ReverseString {

	public static void revString(String str) {
		// int size = str.length();
		String[] words = str.split(" ");
		String rev = " ";
		for (int i = 0; i <= words.length - 1; i++) {
			String word = words[i];
			for (int j = word.length() - 1; j >= 0; j--) {
				rev = rev + word.charAt(j);
			}
			rev += " ";
		}

		System.out.println("Reversed String " + rev);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		revString("Sunil Kumar Bind");
	}

}
