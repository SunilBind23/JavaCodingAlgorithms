package DSA;

public class CountNumberOfDigit {

	public static void countNumberDigit(int num) {
		int digit = 0;
		while (num != 0) {
			num = num / 10;
			digit++; 
		}
		System.out.println(digit);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		countNumberDigit(12345);
	}

}
