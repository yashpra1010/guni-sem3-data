import java.util.*;
class prac24{
	public static void main(String[] args) {
		Queue<String> q = new PriorityQueue<>();
		q.add("Semester 1: C++");
		q.add("Semester 2: C#");
		q.add("Semester 3: Java");
		q.add("Semester 4: Python");
		q.add("Semester 5: Ruby");

		System.out.println("Head Element: "+q.element());
		q.offer("Semester 6: Pascal");
		System.out.println("Iterating the Queue Elements: ");
		Iterator itr = q.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		q.remove();
		q.poll();
		System.out.println("After removing two elements from the queue:");
		Iterator itr2 = q.iterator();
		while (itr2.hasNext()) {
			System.out.println(itr2.next());
		}
	}
}