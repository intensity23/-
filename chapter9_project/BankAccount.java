package chapter9_project;

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
		try {
			if (balance >= amount) {
				balance -= amount;
				otherAccount.deposit(amount);
				return true;
			} else

				return false;

		} catch (NullPointerException e) {
//			e.printStackTrace();
			System.out.println("해당하는 계좌가 없습니다.");
			System.out.println("송금 실패");
		} catch (ArithmeticException e) {
//			e.printStackTrace();
		}
		return false;
	}

	@Override
	public String toString() {
		return "현재잔액: " + balance;
	}

}
