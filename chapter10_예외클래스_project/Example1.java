package chapter10_예외클래스_project;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Example1 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		while (true) {

			try {
				// 'a b' 가 입력되었을 때
				// next() : 공백 또는 엔터 'a'
				// nextLine() : 엔터만 'a b' 공백도 받아드림.

				// int number = Integer.parseInt(scanner.nextLine());

				System.out.print("어떤 수로 나누시겠습니까?>> ");
				int number1 = scanner.nextInt();
				System.out.print("어떤 수로 나누시겠습니까?>> ");
				int number2 = scanner.nextInt();
				int result = number1 / number2;
				System.out.println("결과 : " + number1 + "/" + number2 + "=" + result);
				break;
			} catch (ArithmeticException e) {
//			e.printStackTrace();
				System.out.println("0으로 나눌 수 없습니다. 다시 입력해 주세요");
			} catch (InputMismatchException e) {
				System.out.println("잘못된 입력입니다. 다시 입력해 주세요.");
				scanner.next();
			} //catch (NumberFormatException e) {
				//System.out.println("잘못된 입력입니다. 다시 입력해 주세요.");
		}

	}

}
