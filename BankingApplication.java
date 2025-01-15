/* 
 * Task 2 :-  Banking Application:   
 * A Simple Banking Application in Java is an ideal project for coding beginners. It covers fundamental concepts
 * like the Scanner class for input, strings, loops, methods, and conditional statements. This project involves 
 * basic banking operations such as deposits, withdrawals, checking balances, and exiting the program.
 */

package codeAlpha;

import java.util.Scanner; 
import java.util.HashMap;

public class BankingApplication {

	public static void main(String[] args) {

		UserInformation info = new UserInformation();
		ManageAccounts manageaccount = new ManageAccounts();
		GenerateID id = new GenerateID();

		Scanner sc = new Scanner(System.in);

		/*
		 * I have used a hash map that will store data in the form of key value pair.
		 * The key is the string which is actually an id that is assigned to the user
		 * account and the value is the CreateAccount's object that will store the data
		 * of the user. The keys are the unique ids and all the values are the unique
		 * objects that will store the data of multiple users.
		 */

		HashMap<String, CreateAccount> map = new HashMap<>();

		// ==>> Declaring variables
		int n = 0;
		String account_id = "";

		System.out.println();
		System.out.println("============== Welcome to National Banking System ==============");
		System.out.println();

		while (true) {
			while (true) {

				/*
				 * Here, the user is asked to enter the option which he want to use, 1 for
				 * logging, 2 for creating an account, and 0 for existing.
				 */

				System.out.println();
				System.out.println("  =>  Press 1 for Login into Account.");
				System.out.println("  =>  Press 2 for Creating an Account.");
				System.out.println("  =>  Press 0 for Exiting.");

				try {
					n = sc.nextInt();
					break;
				} catch (Exception e) {
					System.out.println("invalid Input.");
					sc.nextLine();
				}
			}

			sc.nextLine();

			if (n == 0) {
				System.out.println("**********  Thank you for your Visit. Exiting...  **********");
				System.exit(1);
			} else if (n == 1) {

				/*
				 * If the user wants to login into his/her account, then he will ask to enter
				 * the ID of his account. After entering the ID the program wants to check that
				 * either it is present in the map or not. So that's why its use contain key
				 * method. If the id is present in the map, then the value Corresponding to that
				 * ID/key will go into the object of CreateAccount class. The reference variable
				 * will contain the reference of the object, whose information we want to
				 * access.
				 */

				System.out.println("Enter your Account ID please : ");
				account_id = sc.next();

				if (map.containsKey(account_id)) {
					CreateAccount currentAccount = map.get(account_id);

					System.out.println();
					System.out.println("Welcome Back " + currentAccount.getName());
					System.out.println();

					/*
					 * Also a managedAccount method of ManagedAccount class is used that will allow
					 * the user to choose the option, which he wants to perform in that unique or
					 * specific object that he is logged in.
					 */

					manageaccount.manageAccount(sc, currentAccount);

				} else {
					System.out.println("Sorry, ID not found.");
					System.out.println("Create an Account First.");
					System.out.println();
					System.out.println("==========================================================================");
					System.out.println();
				}
			}

			else if (n == 2) {

				// Actual functionality that will ask user if he/she wants to create account
				while (true) {

					System.out.println();
					System.out.println("==========================================================================");
					System.out.println();

					n = 0;
					System.out.println("Do you want to Create an Account ?");
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

					if (n == 0) {
						break;
					}

					// If user wants to create account, he will be ask to enter his/her information

					else if (n == 1) {
						sc.nextLine();

						/*
						 * Every time the user wants to create an account, a new object of CreateAccount
						 * class will be created. And this new object will be added into the
						 * UserInformation class's method userInformation to store the unique
						 * information of the user. So every-time a user wants to create an account, a
						 * new object is created. In essence multiple users will have their multiple
						 * unique objects.
						 */

						CreateAccount newAccount = new CreateAccount();
						info.userInformation(sc, newAccount);

						/*
						 * Here I have used the generateId method of the GenerateID class, whose value I
						 * have stored in the newID and the newID then sets into the newAccount's id
						 * attribute, because every time a newAccount is created, every time generateID
						 * method will be called, and then a newID will be generated for a new account
						 * Also, I will put this new id along with its corresponding object into the
						 * map. so that the user can login into this account.
						 */

						String newID = id.generateId();
						newAccount.setId(newID);
						map.put(newID, newAccount);

						System.out.println();
						System.out.println("Account created Successfully.");
						System.out.println("Your Account ID is :- " + newID);
						System.out.println();

						/*
						 * In ManageAccounts class's method manageAccount, I have added this newAccount
						 * object and the scanner class object so that if the user wants to perform any
						 * operation, he/she can do that.
						 */

						manageaccount.manageAccount(sc, newAccount);

					} else {
						System.out.println("Please enter '0' or '1'.");
					}
					break;
				}
			} else {
				System.out.println("Invalid input.");
			}
		}
	}
}