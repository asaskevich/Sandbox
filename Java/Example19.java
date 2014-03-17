import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Example19 {
	public static void main(String[] args) {
		// First we create Pattern used to check our String
		Pattern p = Pattern.compile("^0x[0-9a-fA-F]{1,10}");
		// Next we create matcher, that will be check our String by Pattern
		Matcher m_1 = p.matcher("0x12423");
		Matcher m_2 = p.matcher("23");
		// Run checker
		boolean match_1 = m_1.matches();
		boolean match_2 = m_2.matches();
		System.out.println("0x12423 is HEX notation: " + match_1);
		System.out.println("23 is HEX notation: " + match_2);
	}
}