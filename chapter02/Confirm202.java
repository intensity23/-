package chapter02;

import java.util.Scanner;

public class Confirm202 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//입력
		System.out.println("첫번째 수: ");
		String strNum1 = scanner.nextLine();
		System.out.println("두번째 수: ");
		String strNum2 = scanner.nextLine();
		//처리
		int num1 = Integer.parseInt(strNum1);
		int num2 = Integer.parseInt(strNum2);
		int result = num1 + num2;
		//출력
		System.out.println(result);
		
	}

}
