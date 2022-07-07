package chapter6;

public class TeacherExample {
	public static void main(String[] args) {
		Teacher t1 = new Teacher();
		t1.salary = 100;
		t1.balance = 200;
		Teacher t2 = new Teacher();
		t2.salary = 200;
		t2.balance = 600;
		Teacher t3 = new Teacher();
		t3.salary = 300;
		t3.balance = 900;  //Teacher에서 balance에 static을 붙여놔서 마지막으로 설정된 t3.balance = 900;이 t1,t2,t3 balance값으로 설정된다.
		System.out.println(t1.salary);
		System.out.println(t1.balance);
	}

}
