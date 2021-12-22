import java.util.*;

public class OOPA1Q4 {
	public static void main(String[] args) {
		Scanner yash = new Scanner(System.in);
		int pos = 0, neg = 0, odd = 0, even = 0, zero = 0;
		int arr[] = new int[10];
		System.out.print("Enter 10 elements: ");
		for (int i = 0; i < 10; i++) {
			arr[i] = yash.nextInt();
		}
		for (int i = 0; i < 10; i++) {
			if (arr[i] > 0) {
				pos++;
			}
			if (arr[i] == 0) {
				zero++;
			}
			if (arr[i] < 0) {
				neg++;
			}
			if (arr[i] % 2 == 0) {
				if (arr[i] == 0) {
					even = even;
				} else {
					even++;
				}
			}
			if (arr[i] % 2 != 0) {

				odd++;
			}
		}
		System.out.print("Positive:\t" + pos + "\nNegative:\t" + neg + "\nEven nos.:\t" + even + "\nOdd nos.:\t" + odd
				+ "\nZeros:    \t" + zero);
	}
}