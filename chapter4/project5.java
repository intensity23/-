package chapter4;

import java.util.Random;
import java.util.Scanner;

public class project5 { // 몇 번만에 맞췄는지 출력
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		int randomNum = random.nextInt(100) + 1;
		boolean b = true;
		int c = 1;
		int sum = 1;
		//int cnt = 0;
		while (b) {
			//cnt++; 이렇게 해줘도 몇 번만에 맞췄는지 세줌
			System.out.println("1부터 100사이의 정수 중 하나를 선택하세요");
			int a = scanner.nextInt();
			if (a > randomNum) {
				sum += c;
				System.out.println("정답은 더 작은 수입니다.");
			} else if (a < randomNum) {
				System.out.println("정답은 더 큰 수입니다.");
				sum += c;
			} else if (a == randomNum) {
				System.out.println("정답입니다. " + sum + "번 만에 정답을 맞췄습니다.");
				System.out.println("게임을 종료합니다.");
				b = false;
			}

		}
	}

}
