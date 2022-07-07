package chapter02;

import java.util.Scanner;

public class exercise24 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("원기둥 밑변의 반지름을 입력하시오. (단위: cm)");
		double line1 = scanner.nextDouble();
	    
	    System.out.println("원기둥의 높이를 입력하시오. (단위: cm)");
	    double line2 = scanner.nextDouble();
	    
	  
	    
	    double result1 = Math.PI * line1*line1;
	    double result2 = result1 * line2;
	    
	    System.out.println("원기둥 밑변의 넓이는 " + result1 +"cm²이고, 원기둥의 부피는 " + result2 +"cm² 이다.");
	    
		
	}	
}
