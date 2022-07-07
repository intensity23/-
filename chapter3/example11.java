package chapter3;

import java.util.Scanner;

public class example11 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("아이디:");
		String name = scanner.nextLine();
		
		System.out.println("패스워드:");
		String strpassword = scanner.nextLine();
		int password = Integer.parseInt(strpassword);
	
		if(name.equals("java")) { //문자열을 비교할 때는  equals 사용.   비교연산자는 기본형에만 사용 가능, 참조형에는 사용 불가.
			if(password == 12345) {
				System.out.println("로그인 성공");
			}else {
				System.out.println("로그인 실패:패스워드가 틀림");
			}
		    }else { 
				System.out.println("로그인 실패:아이디 존재하지 않음");
			}
		
		scanner.close();
	  }			
	}


