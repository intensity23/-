package chapter5;

import java.util.Scanner;

public class exercise06 {
	public static void main(String[] args) {
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		Scanner scanner = new Scanner(System.in);

		while (run) {
			System.out.println("-----------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("-----------------------------------------------");
			System.out.print("선택> ");

			int selectNo = Integer.parseInt(scanner.nextLine());

			if (selectNo == 1) {
				System.out.print("학생수> ");
				studentNum = Integer.parseInt(scanner.nextLine());// studentNum를 입력값으로 설정
				scores = new int[studentNum];// scores의 배열길이를 studentNum로 설정

			} else if (selectNo == 2) {
				for (int i = 0; i < scores.length; i++) {
					System.out.print("scores[" + i + "]>");
					scores[i] = Integer.parseInt(scanner.nextLine());// 반복문 for로 scores[] 배열들의 값을 정하기(스캐너 입력값)
					// 학생수가 입력값(가변적)이라서 무식하게 많이 쓰는건 안됨

				}

			} else if (selectNo == 3) {
				for (int i = 0; i < scores.length; i++) {
					System.out.println("scores[" + i + "]>" + scores[i]);
				}

			} else if (selectNo == 4) {
				int max = 0;
				int sum = 0;
				int count = 0;
				double avg = 0.0;
				for (int i = 0; i < scores.length; i++) {
					if (max < scores[i]) {
						max = scores[i];
					}
				}
				for (int i = 0; i < scores.length; i++) {
					sum += scores[i];
					count++;
				}
				avg = (double) sum / count;
				System.out.println("최고 점수: " + max);
				System.out.println("평균 점수: " + avg);
			} else if (selectNo == 5) {
				System.out.println("프로그램 종료");
				run = false;
			}
		}

	}

}
