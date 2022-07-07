package chapter6;

public class CarExample1 {
	public static void main(String[] args) {
		Car1 car1 = new Car1();
		car1.setGas(5);
		; // Car1의 setGas 메소드 호출

		boolean gasState = car1.isLeftGas();// Car1의 isLeftGas()메소드 호출
		if (gasState) {
			System.out.println("출발합니다.");
			car1.run(); // car1의 run()메소드 호출
		}

		if (car1.isLeftGas()) {
			System.out.println("gas를 주입할 필요가 없습니다.");

		} else {
			System.out.println("gas를 주입하세요.");
		}
	}

}
