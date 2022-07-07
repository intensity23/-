package chapter02;

import java.util.Scanner;

public class exercise25 {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("500원짜리 동전의 갯수: ");
	int coin1 = scanner.nextInt();
	
	System.out.println("100원짜리 동전의 갯수: ");
	int coin2 = scanner.nextInt();
	
	System.out.println("50원짜리 동전의 갯수: ");
	int coin3 = scanner.nextInt();
	
	System.out.println("10원짜리 동전의 갯수: ");
	int coin4 = scanner.nextInt();
	
	
	
	int result = coin1*500 + coin2*100 + coin3*50 + coin4*10;
	System.out.println("저금통 안의 동전의 총 액수: "+ result);
	
	
	
}
}
