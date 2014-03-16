// We use this import, because better to write out.println() instead System.out.println();
import static java.lang.System.out;

public class Example12 {
	public static void main(String[] args) {
		// Create new instance of class
		Day day = new Day(6);
		// And access to it field
		out.println(day.day);
	}
}

// Class Day store integer value
class Day {
	int	day	= 1;

	// It's constructor, that take one argument
	// It's looks like function
	public Day(int day) {
		this.day = day;
	}
}