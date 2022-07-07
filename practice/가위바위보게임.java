package practice;

import java.util.Scanner;

public class 가위바위보게임 {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("가위 바위 보 게임");
	System.out.print("철수: ");
	String str1 = scanner.nextLine();
	System.out.print("영희: ");
	String str2 = scanner.nextLine();
	String result = "";
	
	if(str1.equals("가위")&&str2.equals("보")||str1.equals("바위")&&str2.equals("가위")||str1.equals("보")&&str2.equals("바위")) {
		result = "철수 승리";
		
	}else if (str2.equals(str1)) {
		result = "비겼습니다.";
	}else {
		result = "영희 승리";
	}
	System.out.println("결과: "+result);
}
}
