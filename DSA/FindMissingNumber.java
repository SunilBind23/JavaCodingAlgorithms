package DSA;

public class FindMissingNumber {
	public static void missingNum(int[] num) {
		// total length of number including one missing
		int totalLenght = num.length + 1;
		int totalOfSum = totalLenght * (totalLenght + 1) / 2;
		int sumOfArr = 0;
		for (int i = 0; i < num.length; i++) {
			sumOfArr += num[i];
		}
		int missingNum = totalOfSum - sumOfArr;
		System.out.println("Missing Num Is : " + missingNum);
	}

	public static void main(String[] args) {
		int[] arr = { 1, 3, 2, 4, 5, 7 };
		missingNum(arr);
	}
}
