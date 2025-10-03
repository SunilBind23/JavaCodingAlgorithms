package DSA;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class Sorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> ages = new ArrayList<Integer>();
		ages.add(12);
		ages.add(34);
		ages.add(67);
		ages.add(89);
		ages.add(23);
		ages.add(34);

		Collections.sort(ages);
		for (int i : ages) {
			System.out.println(i);
		}

		Map<String, String> capitalCities = new LinkedHashMap();
		capitalCities.put("England", "London");
		capitalCities.put("India", "New Dehli");
		capitalCities.put("Austria", "Wien");
		capitalCities.put("Norway", "Oslo");
		capitalCities.put("Norway", "Oslo"); // Duplicate
		capitalCities.put("USA", "Washington DC");
		System.out.println(capitalCities);
		for (String i : capitalCities.keySet()) {
			System.out.println("key: " + i + " value: " + capitalCities.get(i));
		}
		
		
		
		capitalCities.get("Norway");
		capitalCities.remove("England");
		// capitalCities.clear();
		capitalCities.size();

		for (String key : capitalCities.keySet()) {
			System.out.println(key);
		}
		for (String value : capitalCities.values()) {
			System.out.println(value);
		}

		for (String key : capitalCities.keySet()) {
			System.out.println("Key" + key + "Value" + capitalCities.get(key));
		}
	}

}
