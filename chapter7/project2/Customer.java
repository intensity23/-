package chapter7.project2;

public class Customer {
	// 필드
	private String firstName;
	private String lastName;
	private BankAccount[] accounts;
	private int numberOfAccounts;

	// 생성자
	public Customer(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		accounts = new BankAccount[5];
	}
	// 메서드

	public void addAccount(BankAccount account) {
		// accounts[numberOfAccount++] = account;
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i] == null) {
				accounts[i] = account;
				break;
			}

		}
		numberOfAccounts += 1;
	}

	public BankAccount getAccount(int index) {
		return accounts[index];
	}

	public int getNumberOfAccounts() {
		return numberOfAccounts;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	@Override
	public String toString() {

		return "이름: " + firstName + lastName + ", 계좌의 개수 : "+ numberOfAccounts;
	}

}
