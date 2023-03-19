
import java.util.Scanner;

public class MakeChange {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Please enter the price of the item: ");
		double itemPurchased = sc.nextDouble();

		System.out.println("Please enter the amout of cash tendered: ");
		double cashTendered = sc.nextDouble();

		sc.close();

		double fundsNeeded;
		if (cashTendered < itemPurchased && cashTendered > 0) {
			fundsNeeded = itemPurchased - cashTendered;
			double rounded = Math.round(fundsNeeded * 100) / 100.0;
			System.out.println(printResult(itemPurchased, cashTendered)
					+ "Insufficient cash tendered! Please request an additional: $" + rounded + " from the customer.");
		}

		if (cashTendered == itemPurchased) {
			System.out.println(printResult(itemPurchased, cashTendered)
					+ "Customer has tendered the exact amount on this purchase.");
		}

		double change = cashTendered - itemPurchased;

		if (cashTendered > itemPurchased && itemPurchased > 0) {

			int twentyBill = (int) (change / 20);
			change %= 20.00;
			System.out.println(printResult(itemPurchased, cashTendered));

			if (twentyBill > 0) {

				if (twentyBill >= 2) {
					System.out.println(twentyBill + " twenty dollar bills ");

				} else {
					System.out.println(twentyBill + " twenty dollar bill ");

				}

			}

			int tenBill = (int) (change / 10);
			change %= 10.00;

			if (tenBill > 0) {
				System.out.println(tenBill + " ten dollar bill ");

			}

			int fiveBill = (int) (change / 5);
			change %= 5.00;

			if (fiveBill > 0) {
				System.out.println(fiveBill + " five dollar bill ");

			}

			int oneBill = (int) (change / 1);
			change %= 1.00;

			if (oneBill > 0) {

				if (oneBill >= 2) {
					System.out.println(oneBill + " one dollar bills ");

				} else {
					System.out.println(oneBill + " one dollar bill ");

				}
			}

			int quarter = (int) (change / 0.25);
			change %= 0.25;

			if (quarter > 0) {
				if (quarter >= 2) {
					System.out.println(quarter + " quarters ");
				} else {
					System.out.println(quarter + " quarter ");
				}
			}

			int dime = (int) (change / 0.100);
			change %= 0.100;

			if (dime > 0) {
				if (dime >= 2) {
					System.out.println(dime + " dimes ");

				} else {
					System.out.println(dime + " dime ");
				}
			}

			int nickel = (int) (change / 0.05);
			change %= 0.050;

			if (nickel > 0) {
				System.out.println(nickel + " nickel ");
			}
			
			int penny = (int) (change / 0.009);
			change %= 0.01;

			if (penny > 0) {

				if (penny >= 2) {
					System.out.println(penny + " pennies ");
				} else {
					System.out.println(penny + " penny ");
				}
			}

		}

		if (cashTendered <= 0 || itemPurchased <= 0) {
			System.err.println("Number cannot be zero or less. Try again.");
		}

	}

	public static String printResult(double itemPurchased, double cashTendered) {
		String message = "Amount: " + itemPurchased + ", " + "Tendered: " + cashTendered + ", Result: ";
		return message;

	}

}
