package models;

public class Customer {

	private String name;
	
	private String userID;
	
	private int pin;
	
	private Account[] accounts = new Account[5];
	
	private int numberOfAccount = 0;
	
	public Customer(String name, String userID, int pin) {
		this.name = name;
		this.userID = userID;
		this.pin = pin;
	}
	
	public void addAccount(Account account) {
		this.accounts[numberOfAccount++] = account;
	}
	
	public Account[] getAccountsByType(int accountType) {
		Account[] filteredAccounts = new Account[accounts.length];
		int i = 0;
		for(Account account : accounts) {
			if (account != null && account.getAccountType() == accountType) {
				filteredAccounts[i] = account;
				i++;
			}
		}
		
		return filteredAccounts;
	}
	
	public String getName() {
		return name;
	}
	
	public boolean checkUserID(String id) {
		return userID.equals(id);
	}
	
	public boolean checkPin(int pin) {
		return this.pin == pin;
	}
	
}
