import java.util.HashMap;

public class Example25 {
	public static void main(String[] args) {
		// Collection: HashMap
		// Create new HashMap
		// Type of keys - Integer
		// Type of values - String
		// HashMap store keys in increase order
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "One");
		map.put(2, "Three");
		map.put(0, "Zero");
		map.put(1, "One-one");
		// Print HashMap
		for (Integer key : map.keySet())
			System.out.println(key + ": " + map.get(key));
	}
}