package chapter6;

public class Member {
	String name; // 이름
	String id; // 아이디
	String password; // 패스워드
	String EName;
	int age; // 나이
	
	Member(String name, int age) {
		this.name = name; // this. 은 필드 name과 매개변수 name을 구별하기 위해 써줌. 메모리에 위치한 객체 자신을 가리킨다.
		this.age = age;
	}
	Member(String name, String EName) {
		 this.name = name;
		 this.EName = EName;

}
}