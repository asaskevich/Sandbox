import java.util.ArrayList;

public class Example21 {
	public static void main(String[] args) {
		// Collection: List
		// Create new empty list
		ArrayList<String> list = new ArrayList<String>();
		list.add("#1");
		list.add("#2");
		list.add("#3");
		// Now it's [#1, #2, #3]
		list.add(1, "#4");
		// Now it's [#1, #4, #2, #3]
		list.remove(3);
		// Now it's [#1, #4, #2]
		for (String s : list)
			System.out.println(s);
	}
}