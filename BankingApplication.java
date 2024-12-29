/* 
 * Task 2 :-  Banking Application:
 * A Simple Banking Application in Java is an ideal project
 * for coding beginners. It covers fundamental concepts
 * like the Scanner class for input, strings, loops, methods,
 * and conditional statements. This project involves basic
 * banking operations such as deposits, withdrawals,
 * checking balances, and exiting the program.
 */

package codeAlpha;

import java.util.Scanner;

public class BankingApplication {

	// All methods in main class now can use the Create_account Class's methods
	static CreateAccount obj1 = new CreateAccount();

	// using scanner class for taking input
	public static Scanner sc = new Scanner(System.in);

	// ==>> Declaring Class level variables
	static int depositAmount = 0;
	static int withdrawAmount = 0;

	public static void main(String[] args) {

		// ==>> Declaring variables
		int n = 0;

		System.out.println();
		System.out.println("============== Welcome to National Banking System ==============");
		System.out.println();

		// Actual functionality that will ask user if he/she wants to create account
		while (true) {

			System.out.println("Do you want to Create an Account ?");
			System.out.println("Press 1 for YES.");
			System.out.println("Press 0 for NO.");

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
				System.exit(1);
			}

			// If user wants to create account, he will be ask to enter his/her information
			else if (n == 1) {
				sc.nextLine();

				System.out.println("Enter Name Please.");
				obj1.setName(sc.nextLine());

				System.out.println("Enter Age Please.");

				while (true) {
					try {
						obj1.setAge(sc.nextInt());
						break;
					} catch (Exception e) {
						System.out.println("Please Enter Age in integer form.");
						sc.nextLine();
					}
				}

				sc.nextLine();

				if (obj1.getAge() < 18) {
					System.out.println();
					System.out.println("You are under-Eighteen, So not Eligible for a bank account.");
					System.out.println("Thank you for your Visit. Exiting...");
					System.exit(1);
				}

				System.out.println("Enter Id Please.");
				obj1.setId(sc.nextLine());

				System.out.println("Enter Address Please.");
				obj1.setAddress(sc.nextLine());

				// Multiple methods will be called and run furthur if the user wants to process
				// them

				System.out.println();
				System.out.println("============================= Deposite Money ===================================");
				System.out.println();

				System.out.println();
				depositMoney();

				System.out.println();
				System.out.println("=============================== Withdraw Money =================================");
				System.out.println();

				System.out.println();
				withdrawMoney();

				System.out.println();
				System.out.println("================================ User Information================================");
				System.out.println();

				System.out.println();
				displayInformation();

				System.out.println();
				System.out.println("**********  Thank you for your Visit. Exiting...  **********");

				break;
			} else {
				System.out.println("Please enter '0' or '1'.");
			}
		}
	}

	/*
	 * Withdrawal method, used to withdraw money from account, will use multiple
	 * conditions to withdraw money such as if account balance is zero or withdrawal
	 * amount that is intended to withdraw is less or more etc...
	 */

	private static void withdrawMoney() {

		int n = 0;
		while (true) {
			System.out.println("Do you want to withdraw money from your account ?");
			System.out.println("Press 1 for YES.");
			System.out.println("Press 0 for NO.");

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
			} else if (n == 1) {
				if (depositAmount == 0) {
					System.out.println("Sorry, Your Bank Balance is Zero.");
				} else {
					System.out.println("Your Current bank balance is " + depositAmount + ".");
					System.out.println("How much amount do you want to withdraw ?");

					while (true) {
						try {
							withdrawAmount = sc.nextInt();
							break;
						} catch (Exception e) {
							System.out.println("Please Enter only integer type value.");
							sc.nextLine();
						}
					}

					if (withdrawAmount < 0) {
						System.out.println("Withdraw Unsuccessfull !");
						withdrawAmount = 0;
					} else if (withdrawAmount > 1000000000) {
						System.out.println("Amount TOO MUCH big.");
						System.out.println("Withdraw Unsuccessfull !");
						withdrawAmount = 0;
					} else if (withdrawAmount <= depositAmount) {
						depositAmount = depositAmount - withdrawAmount;
						System.out.println("Withdraw Successfull !");
						System.out.println("Now your Bank Balance is amount " + depositAmount + ".");
					} else {
						withdrawAmount = 0;
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

	/*
	 * depositMoney method, simply used to deposit money in the account, and tell if
	 * deposited or not.
	 */

	private static void depositMoney() {

		int n = 0;

		while (true) {
			System.out.println("Do you want to deposit money into your Bank Account ?");
			System.out.println("Press 1 for YES.");
			System.out.println("Press 0 for NO.");

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
			} else if (n == 1) {
				while (true) {
					System.out.println("How much amount do you want to deposit ?");
					try {
						depositAmount = sc.nextInt();
						break;
					} catch (Exception e) {
						System.out.println("Please Enter in Integer form.");
						sc.nextLine();
					}
				}

				if (depositAmount > 1000000000) {
					System.out.println("Amount TOO MUCH big to be deposit.");
					System.out.println("Deposit Unsuccessfull !");
					depositAmount = 0;
				} else if (depositAmount > 0 && depositAmount <= 1000000000) {
					System.out.println("Amount " + depositAmount + " has been deposited into your account.");
					break;
				} else {
					System.out.println("No Amount has been deposited into your account.");
					depositAmount = 0;
				}
			} else {
				System.out.println("Please Enter only '0' or '1'.");
			}
		}
	}

	/*
	 * displayInformation method will use getter methods to display the information
	 * about the user and its account status.
	 */

	private static void displayInformation() {

		int n = 0;

		while (true) {
			System.out.println("Do you want to Check your Personal information & Bank Account Status ?");
			System.out.println("Press 1 for YES.");
			System.out.println("Press 0 for NO.");

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
			} else if (n == 1) {
				System.out.println();
				System.out.println("===================================================");
				System.out.println();
				System.out.println("Name : " + obj1.getName());
				System.out.println("Id : " + obj1.getId());
				System.out.println("Age : " + obj1.getAge());
				System.out.println("Current Balance : " + depositAmount);
				System.out.println("Last withdrawal Amount : " + withdrawAmount);
				System.out.println("Address : " + obj1.getAddress());
				System.out.println();
				System.out.println("===================================================");
				System.out.println();

				break;
			} else {
				System.out.println("Please Enter only '0' or '1'.");
			}
		}
	}
}