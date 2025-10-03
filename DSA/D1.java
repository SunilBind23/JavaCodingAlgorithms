package DSA;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

public class D1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> mames = new ArrayList<String>();
		mames.add("sunil");
		mames.add("nikhil");
		mames.add("anil");
		mames.add("amit");
		mames.add("abhisekh");
		mames.add("ajit");
		mames.add("amit");
		mames.add("rajat");
		System.out.println(mames);

		Iterator<String> it = mames.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

		HashSet<String> name = new HashSet<String>();
		name.add("sunil");
		name.add("nikhil");
		name.add("anil");
		name.add("amit");
		name.add("abhisekh");
		name.add("ajit");
		name.add("amit");
		name.add("rajat");
		System.out.println(name);

		Map<String, String> capitalCities = new HashMap<String, String>();
		capitalCities.put("England", "London");
		capitalCities.put("Germany", "Berlin");
		capitalCities.put("Norway", "Oslo");
		capitalCities.put("USA", "Washington DC");
		System.out.println(capitalCities);
	}
}
