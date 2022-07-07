package chapter5;
import java.util.Random;
import java.util.Scanner;

public class exerciseExample03 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();

		System.out.print("가위 바위 보를 입력하세요: ");
		String game = scanner.nextLine();

		System.out.println("게이머: " + game);
		int ranNum = random.nextInt(3) + 1;
		switch (ranNum) {
		case 1:
			System.out.println("인공지능 컴퓨터: 가위");
			break;
		case 2:
			System.out.println("인공지능 컴퓨터: 바위");
			break;
		case 3:
			System.out.println("인공지능 컴퓨터: 보");
			break;

		}
		if (game.equals("가위") && ranNum == 1 || (game.equals("바위") && ranNum == 2) || (game.equals("보") && ranNum == 3)) {
			System.out.println("결과: 무승부!");
		} else if (game.equals("가위") && ranNum == 2 || game.equals("바위") && ranNum == 3 || game.equals("보") && ranNum == 1) {
			System.out.println("결과: 컴퓨터 승리!");
		} else if (game.equals("가위") && ranNum == 3 || game.equals("바위") && ranNum == 1 || game.equals("보") && ranNum == 2) {
			System.out.println("결과: 게이머 승리!");
		} else {
			System.out.println("입력값 오류: 게임을 종료합니다.");
		}

	}
}
