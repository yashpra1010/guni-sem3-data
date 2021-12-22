import java.util.*;

public class OOPA1Q2 {
	public static void main(String[] args) {
		Scanner yash = new Scanner(System.in);
		double bal, amt;
		System.out.print("Enter balance in Pooja's accout: ");
		bal = yash.nextDouble();
		System.out.print("Enter Amount Arjun want to withdraw: ");
		amt = yash.nextDouble();
		if (amt + 0.50 < bal) {
			if (amt % 5 == 0) {
				System.out.print("WITHDRAW TRANSACTION SUCCESSFUL!!");
				System.out.print("\nBalance in account: " + (bal - amt - 0.5));
			} else {
				System.out.print("Can not withdraw transaction because withdraw amount is not multiple of 5.");
				System.out.print("\nBalance in Pooja's account: " + bal);
			}
		} else {
			System.out.print("Pooja's account does not have enough balance.");
		}
	}
}
