package chapter10_예외클래스;

import java.util.Scanner;

public class TryCatchFinallyRuntimeExceptionExample {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			try {
				System.out.print("첫번째 숫자를 입력하세요: ");
				String data1 = scanner.nextLine();
				System.out.print("두번째 숫자를 입력하세요: ");
				String data2 = scanner.nextLine();
				int value1 = Integer.parseInt(data1);
				int value2 = Integer.parseInt(data2);
				int result = value1 + value2;
				System.out.printf("결과 : %d+%d=%d\n", value1, value2, result);
				break;
			} catch (NumberFormatException e) {
				// e.printStackTrace();
				System.out.println("숫자를 입력하세요");

			}
		}
		scanner.close();
	}

}
