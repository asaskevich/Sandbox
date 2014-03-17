import java.util.HashSet;

public class Example22 {
	public static void main(String[] args) {
		// Collection: Set
		// Create new empty HashSet
		HashSet<String> set = new HashSet<String>();
		set.add("#1");
		set.add("#2");
		// It's now {#1, #2}
		System.out.println("Set contain '#3': " + set.contains("#3"));
		set.remove("#1");
		set.add("#3");
		// It's now {#3, #2}
		System.out.println("Set contain '#3': " + set.contains("#3"));
	}
}