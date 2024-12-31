# CodeAlpha_Simple_Banking_Application

Simple Banking Application - Java Project

A simple Banking Application implemented in Java, designed to provides basic banking operations such as account creation, deposit, withdrawal, and balance checking with clear and structured logic.


=> Features 

1. Encapsulation: Uses private attributes and public getter/setter methods for secure data handling.

2. Account Management: Allows users to create an account by entering their name, age, ID, and address.

3. Banking Operations: Deposit money into the account. Withdraw money with proper validations. Check account balance and personal details.

4. Validation: Ensures users under 18 cannot create accounts. Prevents invalid deposits and withdrawals.

5. Error Handling: Robust input validation and exception handling for a smooth user experience.


=> Project Structure

1. CreateAccount Class:

Handles user data with private attributes (name, age, id, address).
Provides getter and setter methods to access and modify data securely.

2. BankingApplication Class:

Contains the main logic for the banking operations.
Uses methods like depositMoney(), withdrawMoney(), and displayInformation() to perform operations.


=> How to Run

1. Clone the repository.
2. Compile the code.
3. Run the program.


=> Key Concepts Covered

1. Encapsulation: Securely manages private user data.

2. Input Handling: Uses Scanner for user input and ensures proper validation.

3. Conditional Statements: Validates operations like deposits, withdrawals, and account creation.

4. Exception Handling: Prevents program crashes by managing invalid inputs gracefully.


=> Example Usage

1. Creating an Account:

Enter your details (name, age, ID, address).
If age < 18, the system denies account creation.

2. Deposit Money:

Input the amount to deposit.
Ensures the deposit amount is valid and not too large.

3. Withdraw Money:

Input the withdrawal amount.
Ensures the withdrawal amount does not exceed the balance.

4. Display Account Information:

View your account details and the latest transaction status.


=> Limitations

Currently, supports single-user accounts.
Does not store data persistently; all information resets after the program ends.


=> Improvements for Future

Add support for multiple user accounts.
Implement persistent data storage (e.g., files or databases).
Add a graphical user interface (GUI) for a more interactive experience.


This project is an ideal start for Java programming learners to explore fundamental concepts and develop practical skills in software development.


=> Author: Abdur Rehman

  A Computer Science student passionate about software development. Skilled in Java, data structures, and algorithms.

=> Feel free to reach out or contribute to improve this project.

=> License: This project is licensed under the MIT License.

