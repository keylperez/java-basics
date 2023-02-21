package models;

public class Bank {

	private String name;
	
	private Customer[] customers = new Customer[5];
	
	private int numberOfCustomers = 0;
	
	public Bank(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void addCustomer(Customer customer) {
		this.customers[numberOfCustomers++] = customer;
	}
	
	public Customer findCustomerById(String userId) {
		Customer foundCustomer = null;
		for(Customer customer: customers) {
			
			if(customer != null) {
				boolean success = customer.checkUserID(userId);
				if(success) {
					foundCustomer = customer;
					break;
				}
			}
		}
		
		return foundCustomer;
	}
	
}
