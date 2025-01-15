package codeAlpha;

import java.util.Scanner;

public class WithdrawMoney {

	/*
	 * Withdrawal method, used to withdraw money from account, will use multiple
	 * conditions to withdraw money such as if account balance is zero or withdrawal
	 * amount that is intended to withdraw is less or more etc...
	 */

	public void withdrawMoney(Scanner sc, CreateAccount account) {

		int n = 0;
		int amount = 0;

		while (true) {
			System.out.println("Do you want to withdraw money from your account ?");
			System.out.println("  =>  Press 1 for YES.");
			System.out.println("  =>  Press 0 for NO.");

			while (true) {
				try {
					n = sc.nextInt();
					break;
				} catch (Exception e) {
					System.out.println("Please Enter only '0' or '1'.");
					sc.nextLine();
				}
			}

			/*
			 * Here we are using the 'var' array to modify the values that are present in
			 * array and are actually 'depositAmount and withdrawalAmount' variables.
			 * DepositAmount is termed as var[0] while withdrawalAmount is termed as var[1].
			 * And, on these array values, certain operations are performed to calculate the
			 * values, So they can be used later.
			 */

			if (n == 0) {
				break;
			} else if (n == 1) {
				if (account.getDepositAmount() == 0) {
					System.out.println("Sorry, Your Bank Balance is Zero.");
				} else {
					System.out.println("Your Current bank balance is " + account.getDepositAmount() + ".");
					System.out.println("How much amount do you want to withdraw ?");

					while (true) {
						try {
							amount = sc.nextInt();
							break;
						} catch (Exception e) {
							System.out.println("Please Enter only integer type value.");
							sc.nextLine();
						}
					}

					if (amount < 0) {
						System.out.println("Withdraw Unsuccessfull !");
						amount = 0;
					} else if (amount > 1000000000) {
						System.out.println("Amount TOO MUCH big.");
						System.out.println("Withdraw Unsuccessfull !");
						amount = 0;
					} else if (amount <= account.getDepositAmount()) {
						account.setDepositAmount(account.getDepositAmount() - amount);
						account.setWithdrawAmount(amount);
						System.out.println("Withdraw Successfull !");
					} else {
						amount = 0;
						System.out.println("Your withdrawal amount is more than your bank balance.");
						System.out.println("Withdraw Unsuccessfull !");
					}
				}
				break;
			} else {
				System.out.println("Please enter only '0' or '1'.");
			}
		}
	}
}