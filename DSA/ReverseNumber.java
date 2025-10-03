package DSA;



public class ReverseNumber {

	public static void reverseNumber(int num) {
		int rev = 0;
		
		
		while (num != 0) {
			rev = rev * 10 + num % 10;
			num = num / 10;
		}
		System.out.println("Reversed Number : " + rev);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		reverseNumber(12345345);
		int num=12345;
		int rev =0;
		
		while(num !=0) {
		rev = rev*10 + num%10;
		num /=10;
		}
		System.out.println(rev);
	}

}
