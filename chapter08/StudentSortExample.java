package chapter8;

public class StudentSortExample {
	
	

	public static void main(String[] args) {
		Student[] students = { new Student("이승연", 20)
				, new Student("김연수", 26)
				, new Student("허지현", 30)
				, new Student("이준혁", 16)
				, new Student("김강산", 27)
				, new Student("윤다영", 34) };

Arrays.sort(students);
for (int i = 0; i<students.length;i++) {
	
}
	}
}
