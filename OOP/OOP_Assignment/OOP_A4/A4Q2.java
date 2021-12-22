import java.util.*;
/**
 * A4Q2
 */
public class A4Q2 {

	public static void main(String[] args) {
		Stack<Integer> stackNumber = new Stack<>();
		stackNumber.push(10);
		stackNumber.push(20);
		stackNumber.push(30);
		stackNumber.push(40);
		stackNumber.push(9274);
		System.out.println("Stack => "+(stackNumber));
		System.out.println("");
		
		int numAtTop = stackNumber.pop();
		System.out.println("stack.pop() => "+numAtTop);
		System.out.println("Current Stack => "+(stackNumber));
		System.out.println("");

		numAtTop = stackNumber.peek();
		System.out.println("stack.peek() => "+numAtTop);
		System.out.println("Current Stack => "+(stackNumber));
		System.out.println("");

		System.out.println("Size of Stack is: "+stackNumber.size());
		Iterator i = stackNumber.iterator();
		System.out.println("Current Stack: ");
		while (i.hasNext()) {
			System.out.println(i.next());
		}
		System.out.println("");
	}
}