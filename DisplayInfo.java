package codeAlpha;

import java.util.Scanner;

public class DisplayInfo {

	/*
	 * displayInformation method will use getter methods to display the information
	 * about the user and its account status.
	 */

	public void displayInformation(Scanner sc, CreateAccount account, int depositAmount, int withdrawAmount) {

		int n = 0;

		while (true) {
			System.out.println("Do you want to Check your Personal information & Bank Account Status ?");
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
			} else if (n == 1) {
				System.out.println();
				System.out.println("===================================================");
				System.out.println();
				System.out.println("Name : " + account.getName());
				System.out.println("Id : " + account.getId());
				System.out.println("Age : " + account.getAge());
				System.out.println("Current Balance : " + depositAmount);
				System.out.println("Last withdrawal Amount : " + withdrawAmount);
				System.out.println("Address : " + account.getAddress());
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