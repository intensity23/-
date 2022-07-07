package chapter4;

public class example5 {
	public static void main(String[] args) {
		for (int i = 1; i <= 4; i++) {// 줄 4개 생성
			for (int j = 1; j <= i; j++) {// 행의 순서만큼 반복
				System.out.print("*");// println 사용하면 줄이 바뀌므로 print 사용
				if (j == i) {
					System.out.println();// 줄바꿈
				}
			}
		}
	}
}
//*
//**
//***
//****