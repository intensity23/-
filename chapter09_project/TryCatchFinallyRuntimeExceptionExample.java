package chapter9_project;

import java.util.Scanner;

public class TryCatchFinallyRuntimeExceptionExample {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		while (true) {
			try {

				System.out.print("어떤 수로 나누겠습니까?: ");
				String data1 = scanner.nextLine();
				System.out.print("어떤 수로 나누겠습니까?: ");
				String data2 = scanner.nextLine();
				int value1 = Integer.parseInt(data1);
				int value2 = Integer.parseInt(data2);
				double result = (double) value1 / value2;
				System.out.printf("결과 : %d / %d = %.2f\n", value1, value2, result);
				break;
			} catch (ArithmeticException e) {
				System.out.println("0으로 나눌 수 없습니다.");
			} catch (NumberFormatException e) {
//				 e.printStackTrace();
				System.out.println("잘못된 입력입니다. 다시 입력하세요.");
			}

		}
		scanner.close();
	}

}
