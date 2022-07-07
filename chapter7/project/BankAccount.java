package chapter7.project;

public class BankAccount {
	// 필드
	private int balance;

	// 생성자
	public BankAccount(int balance) {

		this.balance = balance;
	}

	// 메소드
	public int getBalance() {
		return balance;
	}

	public void deposit(int amount) {
		balance += amount;
	}

	public boolean withdraw(int amount) {
		if (balance >= amount) {
			balance -= amount;
			return true;
		}
		return false;

	}

	public boolean transfer(int amount, BankAccount otherAccount) {
		if (withdraw(amount)) {
			otherAccount.deposit(amount);
			return true;

		}
		return false;
	}

}
