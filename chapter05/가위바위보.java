package chapter5;


import java.util.Random;
import java.util.Scanner;

import chapter4.random;

public class 가위바위보 {
	// ☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆시험 문제 2번 나옴☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆
	// 한번은 아래 코드대로 한번은 조건 다 쓰기
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();

		System.out.println("가위 바위 보 게임");

		System.out.print("player: ");
		//입력
		String player = scanner.next();
		String[] computerArr = {"가위", "바위", "보"};
		
		int ranNum = random.nextInt(3);
		String computer = computerArr[ranNum];
		
		System.out.println("컴퓨터: "+ computerArr[ranNum]);
		//처리
		String result = "";
		if (player.equals("가위") && computer.equals("보") || player.equals("보") && computer.equals("바위")
				|| player.equals("바위") && computer.equals("가위")) {
			result = "철수 승리!";

		} else if (player.equals(computer)) {
			result = "비겼습니다.";
		} else if (computer.equals("가위") && player.equals("보") || computer.equals("보") && player.equals("바위")
				|| computer.equals("바위") && player.equals("가위")) {
			result = "영희 승리!";
		} else {
			System.out.println("입력값이 잘못되었습니다.");
			result = "오류";

		}
		//출력
		System.out.println("결과: " + result);

	}
}
