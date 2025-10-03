package DSA;

public class Target {
	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 56, 7, 5, 6, 7, 8 };
		int n = arr.length;
		int target = 5;
		int low = 0, high = n - 1;
		while (low <= high) {
			int mid = (low + high) / 2;

			if (arr[mid] == target) {
				System.err.println("found" + target);
				break; // Found
			} else if (arr[mid] < target) {
				
				low = mid + 1; // Search in right half
			} else {
				high = mid - 1; // Search in left half
			}
		}
		
	}
}
