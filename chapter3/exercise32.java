package chapter3;

import java.util.Scanner;

public class exercise32 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("수도입니까?(수도: 1, 수도아님: 0)");
		int capital = scanner.nextInt();
				
		System.out.println("총 인구는?(단위: 만)");
		int population = scanner.nextInt();
		
		System.out.println("연소득이 1억 이상인 인구는?(단위: 만)");
		int income = scanner.nextInt();
		
		System.out.println((capital == 1 && population >= 100)||(income >= 50)? "이 도시는 메트로폴리스 입니다." : "이 도시는 메트로폴리스가 아닙니다.");
			
		scanner.close();
		
	}

}
