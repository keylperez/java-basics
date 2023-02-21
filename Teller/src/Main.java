
import java.util.Scanner;

import models.*;

/**
 * 
 *
 */
public class Main {

	/**
	 * 
	 * @param scanner
	 * @return ATM
	 */
	public static ATM initializeATM(Scanner scanner) {

		// 
		// Initializing The first customer
		// 
		Account account00 = new SavingsAccount("00", 888);
		Account account01 = new SavingsAccount("01", 5555);
		Account account02 = new CheckingsAccount("02", 9999);

		Customer customer1 = new Customer("John Doe", "johndoe", 1234);
		customer1.addAccount(account00);
		customer1.addAccount(account01);
		customer1.addAccount(account02);
		
		
		// 
		// Initializing the second customer
		//
		Account account11 = new SavingsAccount("11", 1000);
		Account account12 = new SavingsAccount("12", 1000);

		Customer customer2 = new Customer("Jane Doe", "janedoe", 4321);
		customer2.addAccount(account11);
		customer2.addAccount(account12);
		
		// 
		// Adding the two customers to a bank
		// 
		Bank bank1 = new Bank("BDO");
		bank1.addCustomer(customer1);
		bank1.addCustomer(customer2);
	
		//
		// Initializing a new customer
		//
		Account account = new SavingsAccount("21", 1000);
		Customer customer = new Customer("Juan Dela Cruz", "jlc", 1212);
		customer.addAccount(account);
		
		//
		// Adding the customer to a bank
		//
		Bank bank2 = new Bank("BPI");
		bank2.addCustomer(customer);

		// 
		// Adding Bank Data to ATM
		//
		Bank[] banks = { bank1, bank2 };
		ATM atm = new ATM(banks, scanner);
		return atm;
	}
	
	/**
	 * 
	 */
	public static void clearScreen() {
		for(int i = 0; i < 10; i++) 
			System.out.println("");
	}
	
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ATM atm = initializeATM(scanner);

		boolean running = true;
		while(running) {
			atm.start();
			
			System.out.println("Press enter to exit");
			scanner.nextLine();
			clearScreen();
		}
		
		
		scanner.close();
	}
	
}
