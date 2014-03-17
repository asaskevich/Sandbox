import java.util.Stack;

public class Example23 {
	public static void main(String[] args) {
		// Collection: Stack
		// Create new empty stack
		// Last In First Out
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(1);
		stack.push(2);
		stack.pop();
		stack.push(3);
		stack.push(4);
		stack.push(5);
		// After all operations it's {1, 3, 4, 5}
		while (!stack.isEmpty())
			System.out.println(stack.pop());
	}
}