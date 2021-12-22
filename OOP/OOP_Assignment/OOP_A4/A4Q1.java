import java.util.*;

@FunctionalInterface
interface AreaShape {
	public void Area();
}

interface Input {
	void GetData();
}

public class A4Q1 implements Input {
	static int radius, length, breadth;

	public void GetData() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of radius: ");
		radius = sc.nextInt();

		System.out.println("Enter the value of length and breadth: ");
		length = sc.nextInt();
		breadth = sc.nextInt();
		sc.close();
	}

	public static void main(String[] args) {
		A4Q1 obj = new A4Q1();
		obj.GetData();

		AreaShape a1 = () -> {
			System.out.println("\n**********USING LAMBDA EXPRESSION**********");
			System.out.println("Area of Circle is: " + (3.14 * radius * radius));
			System.out.println("Area of Rectangle is: " + (length * breadth));
		};
		a1.Area();
		System.out.println("");

	}
}