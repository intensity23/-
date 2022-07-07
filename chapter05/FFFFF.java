package chapter5;

import java.util.Scanner;

public class FFFFF {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("1.이름: ");
		String name = scanner.nextLine();
		
		System.out.print("2.주민번호 앞 6자리: ");
		String num1 = scanner.nextLine();
		
		System.out.print("3.전화번호: ");
		String num2 = scanner.nextLine();

		System.out.println("1.이름: " + name);
		System.out.println("2.주민번호 앞 6자리: " + num1);
		System.out.println("3.전화번호: " + num2);
	}

}
