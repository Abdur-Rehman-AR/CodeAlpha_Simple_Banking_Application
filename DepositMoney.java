package codeAlpha;

import java.util.Scanner;

public class DepositMoney {

	// depositMoney method, simply used to deposit money in the account and tell if
	// deposited or not.

	public void depositMoney(Scanner sc, CreateAccount account) {

		int n = 0;
		int amount = 0;

		while (true) {
			System.out.println("Do you want to deposit money into your Bank Account ?");
			System.out.println("  =>  Press 1 for YES.");
			System.out.println("  =>  Press 0 for NO.");

			/*
			 * Here I have used the while loop, which runs until the user enters a correct
			 * input, which should be in the form of integer.
			 */
			while (true) {
				try {
					n = sc.nextInt();
					break;
				} catch (Exception e) {
					System.out.println("Please Enter only '0' or '1'.");
					sc.nextLine();
				}
			}

			if (n == 0) {
				break;

				/*
				 * Here, the program asked the user how much amount do he/she want to deposit?
				 * If the amount is in integer form, then it's okay and the program continues.
				 * But if the amount is not in integer form, then it will ask the user again and
				 * again that how much amount will he want to put until a correct figure is
				 * matched.
				 */
			} else if (n == 1) {
				while (true) {
					System.out.println("How much amount do you want to deposit ?");
					try {
						amount = sc.nextInt();
						break;
					} catch (Exception e) {
						System.out.println("Please Enter in Integer form.");
						sc.nextLine();
					}
				}

				/*
				 * If the amount is in negative form, then the amount will not be deposited. If
				 * the amount is above than one billion, Then the amount will be too much to be
				 * deposited. So it will also not deposit. But if the amount starts from above
				 * than 0 and its limit is 1 billion Then it will be deposited.
				 */

				if (amount > 1000000000) {
					System.out.println("Amount TOO MUCH big to be deposit.");
					System.out.println("Deposit Unsuccessfull !");
					amount = 0;
				} else if (amount > 0 && amount <= 1000000000) {
					System.out.println("Amount " + amount + " has been deposited into your account.");
					account.setDepositAmount(account.getDepositAmount() + amount);
					break;
				} else {
					System.out.println("No Amount has been deposited into your account.");
					amount = 0;
				}
			} else {
				System.out.println("Please Enter only '0' or '1'.");
			}
		}
	}
}