package codeAlpha;

import java.util.Scanner;

/*
 * The purpose of userInformation Class is to take input from the user to set the attributes
 * that are connected with the user's information like their name, their age and address, etc. 
 * In essence, this class takes input from the user and createAccount class sets them in suitable 
 * variables. That's it. 
 */

public class UserInformation {

	public void userInformation(Scanner sc, CreateAccount newAccount) {

		System.out.println("Enter Name Please.");

		while (true) {
			newAccount.setName(sc.nextLine());

			/*
			 * The "matches" method of string, checks here that either the name that we are
			 * going to set lies in alphabet or not. If lies then okay. If not then it will
			 * give a useful message. And allow the user again to enter his/her name.
			 */

			if (newAccount.getName().matches("[a-z A-Z]+")) {
				break;
			} else {
				System.out.println("Please Enter Name in Alphabetical letters only.");
			}
		}

		System.out.println("Enter Age Please.");

		/*
		 * Here, the program ensures that the entered age can only be an integer form.
		 * It cannot be in alphabet or in English, or in any other language form.
		 */

		while (true) {
			try {
				newAccount.setAge(sc.nextInt());
				break;
			} catch (Exception e) {
				System.out.println("Please Enter Age in integer form.");
				sc.nextLine();
			}
		}

		sc.nextLine();

		/*
		 * Here the program checks that either the user that wants to create an account
		 * is eligible for it or not, if it is eligible, then the process continues. But
		 * if it is not eligible, then the whole program exits after giving a useful
		 * message.
		 */

		if (newAccount.getAge() < 18) {
			System.out.println();
			System.out.println("You are under-Eighteen, So not Eligible for a bank account.");
			System.out.println("SORRY...");
			System.exit(1);
		}
		System.out.println("Enter Address Please.");
		newAccount.setAddress(sc.nextLine());
	}
}