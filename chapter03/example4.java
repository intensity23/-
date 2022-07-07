package chapter3;

public class example4 {
	public static void main(String[] args) {
		
		int pencils = 534;
		int students = 30;
		//학생 1명이 갖는 연필 개수
		 int pencilsPerStudent = pencils / students;
		 System.out.println(pencilsPerStudent);
		 //남는 연필 개수 
		 int pencilsLeft = pencils % students;
		 System.out.println(pencilsLeft);
		 
	}

}