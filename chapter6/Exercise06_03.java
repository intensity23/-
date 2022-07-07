package chapter6;

public class Exercise06_03 {
	public static void main(String[] args) {
		/*
		 * Member member = new Member(); member.name = "최하얀"; member.age = 23;
		 */

		Member member = new Member("최하얀", 23);
		System.out.println(member.name);
		System.out.println(member.age);

		Member member2 = new Member("홍길동", "hong");
		System.out.println(member2.name);
		System.out.println(member2.EName);
	}
}
