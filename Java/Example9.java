// We use this import, because better to write out.println() instead System.out.println();
import static java.lang.System.out;

public class Example9 {
	public static void main(String[] args) {
		int i = 0;
		// Simple switch
		switch (i) {
		// If i == 0
			case 0:
				out.println("Zero");
				break;
			// If i == 1
			case 1:
				out.println("One");
				break;
			// If i == 2
			case 2:
				out.println("Two");
				break;
			// Other variants
			default:
				out.println("Unknown value");
		}
	}
}
