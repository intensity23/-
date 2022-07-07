package chapter4;

import java.util.Scanner;

public class project1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("삼각형의 첫번째 변의 길이를 입력하세요");
		int num1 = scanner.nextInt();
		System.out.println("삼각형의 두번째 변의 길이를 입력하세요");
		int num2 = scanner.nextInt();
		System.out.println("삼각형의 세번째 변의 길이를 입력하세요");
		int num3 = scanner.nextInt();

		if (num1 <= num2 + num3 && num1 + num2 >= num3 && num1 + num3 >=num2) {

			System.out.println("삼각형을 만들 수 있습니다.");

		} else {
			System.out.println("삼각형을 만들 수 없습니다.");
		}

	}
}
