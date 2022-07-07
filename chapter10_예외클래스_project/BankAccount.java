package chapter10_예외클래스_project;

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

	public boolean transfer(int amount, BankAccount otherAccount) throws NullPointerException{
		if (balance >= amount) {
			balance -= amount;
			otherAccount.deposit(amount);
			return true;
		} else if(amount<0 || amount > balance ){
			throw new IllegalArgumentException("해당하는 금액을 보낼 수 없습니다."); 
		}
		return false;
	}

	@Override
	public String toString() {
		return "현재잔액: " + balance;
	}

}
