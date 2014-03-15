public class Example8 {
	public static void main(String[] args) {
		int i = 0;
		int j = 10;
		// Simple while-loop, first check, then do statements
		while (i < 10) {
			System.out.println(i);
			i++;
		}
		i = 0;
		// Another while
		while (i < j || j > 0) {
			System.out.println(i + ", " + j);
			i++;
			j--;
		}
		j = 10;
		do {
			System.out.println(j);
			j--;
		} while (j < 0);
		// ^ This condition is false, but this loop will be executed once
	}
}
