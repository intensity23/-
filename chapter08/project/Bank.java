package chapter8.project;

public class Bank {
	private Customer[] customers;
	private int numberOfCustomers;

	public Bank() {
		customers = new Customer[10];
	}

	public void addCustomer(Customer customer) {
		for (int i = 0; i < customers.length; i++) {
			if (customers[i] == null) {
				customers[i] = customer;
				break;
			}
			numberOfCustomers += 1;
		}
	}

	public Customer[] getCustomers() {
		return customers;
	}

	public int getNumberOfCustomers() {
		return numberOfCustomers;
	}

	public Customer getCustomer(int index) {
		return customers[index];
	}

}
