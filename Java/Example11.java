// We use this import, because better to write out.println() instead System.out.println();
import static java.lang.System.out;

public class Example11 {
	public static void main(String[] args) {
		out.println(power(2, 3)); // = 8
		out.println(power(10, 3));// = 1000
		out.println(power(12, 5));// = 248832
	}

	// Simple way to organize recursion
	public static int power(int n, int m) {
		if (m == 1) return n;
		if (m % 2 == 0) {
			int y = power(n, m / 2);
			return y * y;
		}
		return power(n, m - 1) * n;
	}
}
