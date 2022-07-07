package chapter6;

public class Car1 {
	// 필드
	int gas;

	// 메소드
	void setGas(int gas) {// 리턴값이 없는 메소드로 매개값을 받아서 gas필드값 변경
		this.gas = gas;
	}

	boolean isLeftGas() {// 리턴값이 boolean인 메소드로 gas필드값이 0이면 false를, 0이 아니면 true를 리턴
		if (gas == 0) {
			System.out.println("gas가 없습니다.");
			return false;// false를 리턴
		}
		System.out.println("gsa가 있습니다.");
		return true;// true를 리턴

	}

	void run() { // 리턴값이 없는 메소드로 gas필드값이 0이면 return문으로 메소드를 강제종료
		while (true) {
			if (gas > 0) {
				System.out.println("달립니다.(gas잔량:" + gas + ")");
				gas -= 1;

			} else {
				System.out.println("멈춥니다.(gas잔량:" + gas + ")");
				return;// 메소드 실행종료
			}
		}
	}
}
