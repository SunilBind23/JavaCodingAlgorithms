package DSA;

public class lengthLastWord {
	public static void lastWord(String str) {
		String[] stArr = str.split(" ");
		String LastWord = stArr[stArr.length - 1];
		System.out.println(LastWord.length());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		lastWord("Hello Sunil How Are   You");
	}

}
