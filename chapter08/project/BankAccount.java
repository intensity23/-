package chapter8.project;

public class BankAccount {
	// 필드
	protected int balance;

	// 생성자
	public BankAccount(int balance) {

		this.balance = balance;
	}
	

	// 메소드
	public String getAccountType() {
		return null;
	}
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
		} else {
			return false;

		}

	}

	public boolean transfer(int amount, BankAccount otherAccount) {
		if (balance >= amount) {
			balance -= amount;
			otherAccount.deposit(amount);
			return true;
		} else {
			return false;
		}
	}

	@Override
	public String toString() {
		return "현재잔액: " + balance;
	}

}
