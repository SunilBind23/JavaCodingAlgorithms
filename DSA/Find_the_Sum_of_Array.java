package DSA;


public class Find_the_Sum_of_Array {
	public static void main(String[] args) {
		int[] Arr = {78, 32,45, 34, 56, 67, 78, 89, 89 };
		
	
		int size = Arr.length;
		int sum = 0;
		int sort =Arr[0];
		for (int i = 0; i <= size - 1; i++) {
			
			
			sum += Arr[i];
			System.out.println("sum of the array : " + sort);
		}
		System.out.println("sum of the array : " + sum);
		
	}
}
                                                                                                                                                                                                                 