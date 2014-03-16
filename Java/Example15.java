// We use this import, because better to write out.println() instead System.out.println();
import static java.lang.System.out;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Example15 {
	public static void main(String[] args) {
		// Create new instance of class
		Day day = new Day(60);
		// Reflexion example
		Class<? extends Day> cl = day.getClass();
		// While program is run, we can get all information about any class, such as fields, modifiers, methods, constructors
		out.println(cl.getCanonicalName());
		out.println(cl.getPackage());
		for (Field f : cl.getFields())
			out.println(f.toString());
		for (Method m : cl.getMethods())
			out.println(m.toString());
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