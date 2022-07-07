package chapter7.project2;

public class CheckingAccount extends BankAccount {

	private SavingsAccount protectedBy;

	public CheckingAccount(int balance) {
		super(balance);

	}

	public CheckingAccount(int balance, SavingsAccount protectedBy) {
		super(balance);
		this.protectedBy = protectedBy;

	}

	@Override
	public boolean withdraw(int amount) {
		if (!super.withdraw(amount)) {
			protectedBy.balance -= amount - this.balance;
			this.balance = 0;
		}
		return true;


	}
}
