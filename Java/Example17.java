// We use this import, because better to write out.println() instead System.out.println();
import static java.lang.System.out;

import java.util.Arrays;

public class Example17 {
	public static void main(String[] args) {
		// Pre-initialized array
		int arr[] = { -1, 7, 3, -4, 5 };
		Arrays.sort(arr); // Sort array
		String arr_str = Arrays.toString(arr); // Return string implementation of array
		int pos = Arrays.binarySearch(arr, 4); // Will be negative - there is no 4 in arr
		// Print values
		out.println(arr_str);
		out.println(pos);
	}
}