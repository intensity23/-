package chapter3;

import java.util.Scanner;

public class exercise31 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("첫 번째 숫자를 입력하세요:");
		int num1 = scanner.nextInt();
		
		System.out.println("두 번째 숫자를 입력하세요:");
		int num2 = scanner.nextInt();
		
		int bignum = ((num1+num2)+Math.abs(num1-num2))/2;
		int smallnum = ((num1+num2)-Math.abs(num1-num2))/2;
		
		int division = bignum / smallnum;
		int left = bignum % smallnum;
		
		System.out.println("큰 수를 작은 수로 나눈 몫은 "+division + "이고, 나머지는" + left+"이다.");
		
		
		scanner.close();
			
		
		
	}

}
