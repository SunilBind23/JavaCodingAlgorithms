package DSA;

public class FactorialofNumber {
	public static void fact(int num) {
		int fact = 1;
		for (int i = 1; i <= num; i++) {
			fact = fact * i;
		}
		System.out.println(fact);
	}

	public static int factwithRec(int num) {
		if (num == 0 || num == 1) {
			return 1;
		} else {
			return num * factwithRec(num - 1);
		}

	}

	public static void main(String[] args) {
		fact(7);
		int f = factwithRec(5);
		System.out.println(f);
	}
}
