package DSA;

public class Factorial_Of_a_Number {
  //5! = 5 × 4 × 3 × 2 × 1 = 120
  //4! = 4 × 3 × 2 × 1 = 24
  //3! = 3 × 2 × 1 = 6
  //0! = 1
  public static void main(String[] args) {
        int num = 5;
        int fact = 1;

        for (int i = 1; i <= num; i++) {
            fact = fact * i;
        }

        System.out.println("Factorial = " + fact);
    }


}
