package chapter4;

import java.util.Scanner;

public class project3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("점수를 입력하세요.");
		System.out.println("프로그래밍 기초:");
		int num1 = scanner.nextInt();
		System.out.println("데이터베이스:");
		int num2 = scanner.nextInt();
		System.out.println("화면 구현:");
		int num3 = scanner.nextInt();
		System.out.println("애플리케이션 구현:");
		int num4 = scanner.nextInt();
		System.out.println("머신러닝:");
		int num5 = scanner.nextInt();

		int num6 = (num1 + num2 + num3 + num4 + num5);
		double num7 = (double) num6 / 5;
		System.out.println("총점: " + num6);
		System.out.printf("평균%.2f :", num7); // %.2f, d <--소수점 2자리 까지 표시.  sys.o.printf 써야됨
		if (num7 >= 90) {
			System.out.println("학점: " + "A");
		} else if (num7 >= 80 && num7 < 90) {
			System.out.println("학점: " + "B");

		} else if (num7 >= 70 && num7 < 80) {
			System.out.println("학점: " + "C");
		} else if (num7 >= 60 && num7 < 70) {
			System.out.println("학점: " + "D");
		} else {
			System.out.println("학점: " + "F");
		}

	}

}
