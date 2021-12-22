import java.util.*;

public class OOPA1Q1 {
	public static void main(String[] args) {
		Scanner yash = new Scanner(System.in);
		int Z, i, ans;
		System.out.print("\nEnter element whose first 10 multiple you want to find(5<Z<41): ");
		Z = yash.nextInt();
		if (Z > 5 && Z < 41) {
			for (i = 1; i < 11; i++) {
				ans = Z * i;
				System.out.println(Z + "x" + i + "=" + ans);
			}
		} else {
			System.out.println("Entered element does not satsify the given condition.");
		}

	}
}