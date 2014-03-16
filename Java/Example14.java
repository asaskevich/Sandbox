// We use this import, because better to write out.println() instead System.out.println();
import static java.lang.System.out;

public class Example14 {
	public static void main(String[] args) {
		// Create new instance of class
		Day day = new Day(60);
		WeekDay wday = new WeekDay(60);
		MonthDay mday = new MonthDay(60);
		// And access to it functions
		// Each instance store day = 60
		day.printDay(); // 60
		wday.printDay(); // 4
		mday.printDay(); // 29
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

	public void printDay() {
		out.println(day);
	}
}

// It's class inherit class Day with it fields, functions
class WeekDay extends Day {
	public WeekDay(int day) {
		super(day);
	}

	// Method override base method
	public void printDay() {
		out.println(day % 7);
	}
}

class MonthDay extends Day {
	public MonthDay(int day) {
		super(day);
	}

	public void printDay() {
		out.println(day % 31);
	}
}