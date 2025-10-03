package DSA;

public class ReverseOnlyLetters {
	public static String RevLetter(String str) {
		int left = 0;
		char[] arr = str.toCharArray();
		int right = arr.length - 1;

		while (left < right) {

			if (!Character.isLetter(arr[left])) {

				left++;

			} else if (!Character.isLetter(arr[right])) {

				right--;

			} else {
				char temp = arr[left];
				arr[left] = arr[right];
				arr[right] = temp;
				left++;
				right--;

			}
		}
		return new String(arr);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "a-bC-dEf-ghIj";
		System.out.println(RevLetter(str));
	}

}
