package DSA;

public class EvenWordsfromString {
	public static void EvenWord(String word) {
		String[] stArr = word.split(" ");
		for (int i = 0; i <= stArr.length - 1; i++) {
			if (stArr[i].length() % 2 == 0) {
				System.out.println("Even String : " + stArr[i]);

			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EvenWord("Sunil Bind How Are You also I am Here");
	}

}
