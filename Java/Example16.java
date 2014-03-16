// We use this import, because better to write out.println() instead System.out.println();
import static java.lang.System.out;

import java.util.Arrays;

public class Example16 {
	public static void main(String[] args) {
		// Empty array, initialized with zeros
		int[] arr_1 = new int[10];
		// Pre-initialized array
		int arr_2[] = { 1, 2, 3, 4, 5 };
		// Array of arrays
		int[] arr_3[] = { { 1, 23, 4 }, { 2, 3 }, { 4 } };
		// Print arrays
		out.println(Arrays.toString(arr_1));
		out.println(Arrays.toString(arr_2));
		out.println(Arrays.toString(arr_3));
	}
}