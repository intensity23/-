package chapter10_예외클래스_project;

public class BankTest {
	public static void main(String[] args) {
		 

		CheckingAccount tonyAccount = new CheckingAccount(3000);
		CheckingAccount steveAccount = new CheckingAccount(4000);
		CheckingAccount shAccount = new CheckingAccount(10000);
		
		try {
			shAccount.transfer(4000, tonyAccount);
			System.out.println("송금완료");
			shAccount.transfer(4000, tonyAccount);
			System.out.println("송금완료");
			shAccount.toString();
			shAccount.transfer(4000, tonyAccount);
			System.out.println("송금완료");
		} catch (NullPointerException e) {
			System.out.println("해당하는 계좌가 없습니다.");
			System.out.println("송금 실패");
		}catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
//			System.out.println("해당하는 금액을 보낼 수 없습니다.");
			System.out.println("송금 실패");
		}
		try {
			tonyAccount.transfer(5000, steveAccount);
			System.out.println("송금완료");
		} catch (NullPointerException e) {
			System.err.println("해당하는 계좌가 없습니다.");
			System.out.println("송금 실패");
		}catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
//			System.out.println("해당하는 금액을 보낼 수 없습니다.");
			System.out.println("송금 실패");
		}
		try {
			tonyAccount.transfer(2000, null);
			System.out.println("송금 완료");
		} catch (NullPointerException e) {
			System.out.println("해당하는 계좌가 없습니다.");
			System.err.println("송금 실패");
		}catch (IllegalArgumentException e) {
			System.out.println("해당하는 금액을 보낼 수 없습니다.");
			System.err.println("송금 실패");

	}
}
}