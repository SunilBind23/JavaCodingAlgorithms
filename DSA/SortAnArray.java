package DSA;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SortAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 56, 34, 56, 7, 8, 56, 76, 56, 34, 56, 4 };
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
	}

	public static void bubbleSort() {
		int arr[] = { 56, 34, 56, 7, 8, 56, 76, 56, 34, 56, 4 };
		int n = arr.length;
		for(int i=0;i<n-1;i++) {
			
			for(int j=0;j<n-i-1;j++) {
				
				if(arr[j]>arr[i+1]) {
					int temp =arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}
}
