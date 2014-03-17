public class Example28 {
	public static void main(String[] args) {
		TimeListener[] tListener = { new Clocks(), new Watches() };
		tListener[0].timeChanged(1000);
		tListener[1].timeChanged(1001);
	}
}

// Implementation looks like inheritance
// But you can inherit only one class
// As you can implements more than one class
class Clocks implements TimeListener {
	// Override interface method
	public void timeChanged(long time) {
		System.out.println("Clocks: time changed!");
	}
}

class Watches implements TimeListener {
	public void timeChanged(long time) {
		System.out.println("Watches: time changed!");
	}
}

interface TimeListener {
	// Interface doesn't need realization of him methods
	public void timeChanged(long time);
}
