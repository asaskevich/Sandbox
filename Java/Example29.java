public class Example29 {
	public static void main(String[] args) {
		// Create and run new thread
		RunnableTimer rTimer = new RunnableTimer();
		Thread th = new Thread(rTimer);
		th.start();
		// Run main thread
		int counter = 0;
		while (counter < 50) {
			System.out.println("Main: " + counter);
			counter++;
		}
	}
}

// Our class will be new thread
class RunnableTimer implements Runnable {
	int	counter	= 0;

	public void run() {
		while (counter < 50) {
			System.out.println("Runnable: " + counter);
			counter++;
		}
	}
}