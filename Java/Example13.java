// We use this import, because better to write out.println() instead System.out.println();
import static java.lang.System.out;

public class Example13 {
	public static void main(String[] args) {
		// Create new instance of class
		Day day = new Day(6);
		WeekDay wday = new WeekDay(4);
		Day wday_1 = new WeekDay(3);
		// And access to it field
		out.println(day.day); // 6
		out.println(wday.day); // 4
		out.println(wday_1.day); // 3
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

// It's class inherit class Day with it fields, functions
class WeekDay extends Day {
	public WeekDay(int day) {
		// Call constructor of Day class
		super(day);
	}
}