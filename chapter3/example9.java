package chapter3;

import java.util.Scanner;

public class example9 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("첫 번째 수: ");
		double num1 = scanner.nextDouble();
		
		System.out.println("두 번째 수: ");
		double num2 = scanner.nextDouble();
		
		System.out.println("--------------");
		 
		double result = num1/num2;
		
		
		if(num2!=0.0) {  //num2가 0.0이 아니면 result, 맞으면 무한대
			//삼항연산자로도 해보기 num2= ((0||0.0)? "무한대" : result + "");
			System.out.println("결과: "+result);}
		else {
			System.out.println("결과: 무한대");
			}
		scanner.close();
		
	}

}
