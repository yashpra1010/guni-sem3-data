import java.util.*;

class student {
	student() {
		System.out.print("Unknown");
	}

	student(String name) {
		System.out.print("Name entered: " + name);
	}
}

public class OOPA1Q3 {
	public static void main(String[] args) {
		Scanner yash = new Scanner(System.in);
		char ch;
		String name;
		System.out.print("Do you want to pass name(y/n): ");
		ch = yash.next().charAt(0);
		if (ch == 'y' || ch == 'Y') {
			System.out.print("Enter name: ");
			name = yash.next();
			student obj = new student(name);
		} else {
			student obj1 = new student();
		}
	}
}
