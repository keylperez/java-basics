package models;

public abstract class Account {

	private String accountNumber;
	
	// 1 - Savings, 2 - Checking
	private int accountType;

	private double balance;
		
	public Account(String accountNumber, int accountType, double balance) {
		this.accountNumber = accountNumber;
		this.accountType = accountType;
		this.balance = balance;
	}
	
	public double withdraw(double money) {
		balance -= money;
		
		return balance;
	}
	
	public double deposit(double money) {
		balance += money;
		
		return balance;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public int getAccountType() {
		return accountType;
	}
	
	public String getAccountNumber() {
		return accountNumber;
	}
	
}
