package chapter7.project;

public class Customer {
	// 필드
	private String firstName;
	private String lastName;
	private BankAccount account;

	// 생성자
	public Customer(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
	// 메서드

	public BankAccount getAccount() {
		return account;
	}

	

	public void setAccount(BankAccount account) {
		this.account = account;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	@Override
	public String toString() {
		
		return "이름: " + firstName + lastName  + ", 잔액 : " + account.getBalance();
	}

}
