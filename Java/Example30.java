public class Example30 {
	public static void main(String[] args) {
		try {
			// Something not OK
			// Maybe it error?
			throw new MainException();
		} catch (MainException e) {
			e.printStackTrace();
		}
		// If you run a program, it will be generated MainException:
		// MainException: Unknown error in Main()
		// at Example30.main(Example30.java:6)
	}
}

class MainException extends Exception {
	public String getMessage() {
		return "Unknown error in Main()";
	}
}