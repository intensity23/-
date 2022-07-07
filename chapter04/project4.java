package chapter4;

import java.util.Scanner;

public class project4 {
	// ☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆시험 문제 2번 나옴☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆
	// 한번은 아래 코드대로 한번은 조건 다 쓰기
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("가위 바위 보 게임");

		System.out.print("철수: ");
		String str1 = scanner.next();
		System.out.print("영희: ");
		String str2 = scanner.next();
		String result = "";

		if (str1.equals("가위") && str2.equals("보") || str1.equals("보") && str2.equals("바위")
				|| str1.equals("바위") && str2.equals("가위")) {
			result = "철수 승리!";

		} else if (str1.equals(str2)) {
			result = "비겼습니다.";
		} else if (str2.equals("가위") && str1.equals("보") || str2.equals("보") && str1.equals("바위")
				|| str2.equals("바위") && str1.equals("가위")) {
			result = "영희 승리!";
		} else {
			System.out.println("입력값이 잘못되었습니다.");
			result = "오류";

		}
		System.out.println("결과: " + result);

	}
}
