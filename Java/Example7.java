public class Example7 {
	public static void main(String[] args) {
		// Simple for-loop, that write numbers from 0 to 4
		for (int i = 0; i < 5; i++)
			System.out.println(i);
		// For-loop with step 2
		for (int i = 0; i < 5; i += 2)
			System.out.println(i);
		// For-loop with complex conditions and steps
		for (int i = 0, j = 5; i < j || j > 0; i += 2, j--)
			System.out.println(i + ", " + j);
	}
}
