package DSA;

public class ReverseanInteger {
	public static void reverseInteger(int num) {
		int rev =0;
		while(num!=0) {
			rev = rev*10+num%10;
			num = num/10;	
		}
		System.out.println("everse Number is : "+ rev);
	}
public static void main(String[] args) {
	reverseInteger(12345);
}
}
