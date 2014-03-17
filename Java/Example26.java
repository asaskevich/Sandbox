// Enumeration sample
public class Example26 {
	public static void main(String[] args) {
		// Get all constants and print them
		Chars[] vals = Chars.values();
		for (Chars n : vals)
			System.out.println(n.name() + " " + n.ordinal());
	}
}

// Enumeration store enumerated values
enum Chars {
	A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W, X, Y, Z, a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u, v, w, x, y, z;
}