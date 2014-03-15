public class Example4 {
	public static void main(String[] args) {
		// We declaring variables
		int a = 1;
		int b = 3;
		// Now we using binary operators
		int d = a & b;
		int  e = a | b;
		int f = a ^ b;
		int g = ~a;
		System.out.println(d); // d = 1
		System.out.println(e); // e = 3
		System.out.println(f); // f = 2
		System.out.println(g); // g = -2
	}
}
