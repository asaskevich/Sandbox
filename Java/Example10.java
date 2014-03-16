// We use this import, because better to write out.println() instead System.out.println();
import static java.lang.System.out;

public class Example10 {
	public static void main(String[] args) {
		// Call function without arguments
		printHi();
		// Call function with two int arguments
		out.println(getSum(2, 3));
		// 4 arguments
		out.println(getSum(1, 2, 3, 4));
		// 9 arguments
		out.println(getSum(1, 2, 3, 4, 5, 6, 7, 8, 9));
	}

	// Function take 2 arguments and return it sum
	public static int getSum(int a, int b) {
		return a + b;
	}

	// Function doesn't take arguments and nothing return
	public static void printHi() {
		out.println("Hi!");
	}

	// Function can take any number of arguments - zero, one, five or ten
	public static int getSum(int... args) {
		int sum = 0;
		for (int el : args)
			sum += el;
		return sum;
	}
}
