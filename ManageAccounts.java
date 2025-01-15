package codeAlpha;

import java.util.Scanner;

/*
 * This class is just used to perform operations such as: deposit money, withdraw money, 
 * viewing the account and logging out(if the user logins). 
 */

public class ManageAccounts {

	/*
	 * The CreateAccount object tracks all account-related details (depositAmount,
	 * withdrawAmount). These values persist across sessions since they are part of
	 * the account object stored in the HashMap.
	 */

	public void manageAccount(Scanner sc, CreateAccount newAccount) {

		DepositMoney deposit = new DepositMoney();
		WithdrawMoney withdraw = new WithdrawMoney();
		DisplayInfo display = new DisplayInfo();

		int n = 0;

		while (true) {
			System.out.println("  =>  Enter 0 to LOGOUT.");
			System.out.println("  =>  Enter 1 to deposit Money.");
			System.out.println("  =>  Enter 2 to withdraw Money.");
			System.out.println("  =>  Enter 3 to view your Account.");

			while (true) {
				try {
					n = sc.nextInt();
					break;
				} catch (Exception e) {
					System.out.println("Invalid Option.");
					System.out.print("Enter Again : ");
				}
			}

			if (n == 0) {
				System.out.println("You logged out..");
				break;
			} else if (n == 1) {
				System.out.println();
				System.out.println("============================= Deposite Money ===================================");
				System.out.println();
				System.out.println();

				deposit.depositMoney(sc, newAccount);

			} else if (n == 2) {
				System.out.println();
				System.out.println("============================== Withdraw Money =================================");
				System.out.println();

				System.out.println();
				withdraw.withdrawMoney(sc, newAccount);

			} else if (n == 3) {
				System.out.println();
				System.out.println("=============================== User Information================================");
				System.out.println();
				System.out.println();

				display.displayInformation(sc, newAccount, newAccount.getDepositAmount(),
						newAccount.getWithdrawAmount());
			} else {
				System.out.println("Wrong Option.");
				System.out.println();
			}
		}
	}
}