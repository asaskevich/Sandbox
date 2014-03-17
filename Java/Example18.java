// We use this import, because better to write out.println() instead System.out.println();
import static java.lang.System.out;

public class Example18 {
	public static void main(String[] args) {
		// It's a lot of ways to create string in Java
		String s_1 = "s_1";
		String s_2 = new String("s_2");
		String s_3 = new String(new char[] { 's', '_', '3' });
		String s_4 = new String(new byte[] { 's', '_', '4' });
		String s_5 = String.valueOf(5);
		// Print string in formated style
		out.printf("%s\n%s\n%s\n%s\n%s", s_1, s_2, s_3, s_4, s_5);
		// Some operations with strings
		s_1 = s_1.toUpperCase();
		s_2 = s_2.replace('s', 't');
		s_3 = s_3.substring(1);
		s_4 = s_4 + s_5;
		// Print new values
		out.printf("\n%s\n%s\n%s\n%s", s_1, s_2, s_3, s_4);
	}
}