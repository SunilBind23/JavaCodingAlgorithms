package DSA;

public class FistLowest {
	public void FirstLowes(int[] ages) {
		int lowest = ages[0];
		for (int age : ages) {
			if (lowest > age) {
				lowest = age;
			}
		}
		System.out.println("Lowes age is " + lowest);
	}

	public void FirstLargest(int[] values) {
		int Largest = values[0];
		for (int val : values) {
			if (Largest < val) {
				Largest = val;
			}
		}
		System.out.println("FirstLargest value  is " + Largest);
	}

	public static void main(String[] args) {
		FistLowest p = new FistLowest();
		int val[] = { 12, 34, 56, 4, 67, 456, 8 };
		p.FirstLowes(val);
		p.FirstLargest(val);

	}

}
