
package models;

import java.util.Scanner;

public class ATM {

	private Bank[] banks;
	
	private Customer customer;
	
	private Scanner scanner;

	public ATM(Bank[] banks, Scanner scanner) {
		this.banks = banks;
		this.scanner = scanner;
	}
	
	public void start() {
		System.out.println("Please input your id");
		String userId = scanner.nextLine();
		
		for(Bank bank : banks) {
			this.customer = bank.findCustomerById(userId);
			if(this.customer != null) {
				break;
			}
		}
		
		if(customer == null) {
			System.out.println("ID not recognized");
			return;
		}
		
		//
		//
		System.out.println("Input your pin");
		int pin = Integer.parseInt(scanner.nextLine());
		boolean pinValid = customer.checkPin(pin);
		if(!pinValid) {
			System.out.println("Pin is invalid.");
			return;
		}
		
		//
		// 
		System.out.println("Welcome " + customer.getName());
		
		System.out.println("[1] Withdraw");
		System.out.println("[2] Deposit");
		System.out.println("[3] Check balance");
		
		System.out.println("Choose your transaction");

		int transactionType = Integer.parseInt(scanner.nextLine());
		
		//
		//
		System.out.println("[1] Savings");
		System.out.println("[2] Checking");
		
		System.out.println("Choose your type of account");
		int accountType = Integer.parseInt(scanner.nextLine());
		
		//
		//
		Account[] accounts = customer.getAccountsByType(accountType);
		int accountsFound = 0;
		for(int i = 0; i < accounts.length; i++) {
			if(accounts[i] != null) {
				accountsFound++;
				
				System.out.printf("[%d] Account Number: %s \n", 
						i, accounts[i].getAccountNumber());
			}
		}
		
		if(accountsFound == 0) {
			System.out.println("No accounts found for this type");
			return;
		}
		
		System.out.println("Choose your account");
		int accountIndex = Integer.parseInt(scanner.nextLine());
		
		Account selectedAccount = accounts[accountIndex];
		double balance = selectedAccount.getBalance();
		switch(transactionType) {
		case 1:
			System.out.println("Enter your withdrawal amount");
			double withdrawalAmount = Double.parseDouble(scanner.nextLine());
			balance = selectedAccount.withdraw(withdrawalAmount);
			break;
		case 2:
			System.out.println("Enter your deposit amount");
			double depositAmount = Double.parseDouble(scanner.nextLine());
			balance = selectedAccount.deposit(depositAmount);
			break;
		}
		System.out.println("Balance: " + balance);
		System.out.println("Thank you for banking with us.");
	}
	
}
