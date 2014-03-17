import java.util.Vector;

public class Example20 {
	public static void main(String[] args) {
		// Collection: Vector
		// Create an empty vector
		Vector<Integer> vector = new Vector<Integer>();
		// Push values
		vector.add(1);
		vector.add(2);
		vector.add(3);
		vector.add(4);
		// Now it's [1, 2, 3, 4]
		vector.remove(1);
		// Now it's [1, 3, 4]
		for (Integer i : vector)
			System.out.println(i);		
	}
}