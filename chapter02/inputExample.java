package chapter02;

import java.util.Scanner;

public class inputExample {
public static void main(String[] args) {
	//scanner를 이용해서 데이터 입력 받기
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("정수를 입력하세요");
	String nextaInt = scanner.nextLine();
	
	System.out.println("실수를 입력하세요");
	String nextaDouble = scanner.nextLine();
	
	int int1 = Integer.parseInt(nextaInt);
	double double1 = Double.parseDouble(nextaDouble);
	
	double sum = (int1 + double1);
	
	
	System.out.println("두 수의 합은 " + sum + " 입니다.");
	 
}
}
