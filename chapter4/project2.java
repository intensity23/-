package chapter4;

import java.util.Scanner;

public class project2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("월을 입력하세요(1~12):");
		int num1 = scanner.nextInt();
		if((num1 == 12)||(num1==1)||(num1==2)) {
			System.out.println(num1+"월은 겨울입니다.");
		} else if((num1 == 3)||(num1==4)||(num1==5)) {
			System.out.println(num1+"월은 봄입니다.");
		} else if((num1 == 6)||(num1==7)||(num1==8)) {
			System.out.println(num1+"월은 여름입니다.");
		} else if((num1 == 9)||(num1==10)||(num1==11)) {
			System.out.println(num1+"월은 가을입니다.");
		} else {
			System.out.println(num1+"월은 잘못된 입력입니다.");
		
			
	}

}
}

/* switch(num1) {
 * case 12: case 1: case2:
 * system.out.println(num1+"월은 겨울입니다.");
 * break;
 * case 3: case 4: case 5:
 * system.out.println(num1+"월은 봄입니다.");
 * break;
 * case 6: case 7: case 8:
 * system.out.println(num1+"월은 여름입니다.");
 * break;
 * case 9: case 10: case 11:
 * system.out.println(num1+"월은 가을입니다.");
 * break;
 * 
 */

