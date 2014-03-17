import java.util.PriorityQueue;

public class Example24 {
	public static void main(String[] args) {
		// Collection: PriorityQueue
		// Create new Queue
		// NOTE: it's will be return values from smallest to largest
		PriorityQueue<Integer> q = new PriorityQueue<Integer>();
		q.add(3);
		q.add(1);
		q.add(2);
		// Now it's {1, 2, 3}
		while (!q.isEmpty())
			System.out.println(q.poll());
	}
}