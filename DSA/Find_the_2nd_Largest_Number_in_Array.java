package DSA;

public class Find_the_2nd_Largest_Number_in_Array {
public static void main(String[] str){
  // 
  int largest = Integer.MIN_VALUE;
int secondLargest = Integer.MIN_VALUE;

for (int num : arr) {
    if (num > largest) {
        secondLargest = largest;
        largest = num;
    } else if (num > secondLargest && num != largest) {
        secondLargest = num;
    }
}

   System.out.println("Largest: " + largest);
    System.out.println("Second Largest: " + secondLargest);

  // also we can use sorted array and then print last 2nd
}
}
