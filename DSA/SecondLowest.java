package DSA;

public class SecondLowest {

	public void Lowest() {
		// Step 1: Initialize the array
		int num[] = { 34, 65, 67, 34, 56, 3, 67, 23 };

		// Step 2: Declare variables to store lowest and second lowest
		int lowest, secondLowest;

		// Step 3: Compare first two numbers and assign accordingly
		if (num[0] < num[1]) {
			lowest = num[0]; // lowest = 34
			secondLowest = num[1]; // secondLowest = 65
		} else {
			lowest = num[1];
			secondLowest = num[0];
		}

		// Step 4: Start loop from index 2 because first two are already checked
		for (int i = 2; i < num.length; i++) {

			// If current number is smaller than current lowest
			if (num[i] < lowest) {
				secondLowest = lowest; // Move old lowest to secondLowest
				lowest = num[i]; // Update lowest to new smaller value
			}

			// Else, if number is between lowest and secondLowest
			else if (num[i] < secondLowest && num[i] != lowest) {
				secondLowest = num[i]; // Update secondLowest
			}
		}

		// Step 5: Print result
		System.out.println("second lowest: " + secondLowest);
	}

	// Step 6: Main method to run the program
	public static void main(String[] args) {
		new SecondLowest().Lowest();
	}
}
