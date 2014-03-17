import java.util.Scanner;

public class Example31 {
	public static void main(String[] args) {
		// We can use scanner for parsing input stream
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		boolean b = scan.nextBoolean();
		double d = scan.nextDouble();
		String s = scan.nextLine();
		// Print readied values
		System.out.println(n);
		System.out.println(d);
		System.out.println(b);
		System.out.println(s);
		// Don't miss to close scanner
		scan.close();
	}
}