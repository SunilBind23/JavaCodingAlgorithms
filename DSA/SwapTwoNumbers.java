package DSA;

public class SwapTwoNumbers {
public void swapNum(int num1,int num2) {
	System.out.println("Before swap: " +"num1 " + num1 +"  and num2 "+ num2 );
	num1=num1+num2;    // 10+20=30 a==30
	num2=num1-num2;  //   30-20=== 10 ===b
	num1=num1-num2;  //   30-10==20===a
	System.out.println("after swap: " + " num1 " +num1 +"  and num2 "+ num2 );
}
public static void main(String[] args) {
	new SwapTwoNumbers().swapNum(10, 30);
}
}
