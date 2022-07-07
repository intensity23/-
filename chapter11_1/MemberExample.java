package chapter11_1;

public class MemberExample {
	public static void main(String[] args) {
		Member member1 = new Member("a001", 1000, "김은대");
		Member member2 = new Member("b001", 1000, "이쁜이");
		Member member3 = new Member("c001", 1000, "신용환");
		
		Member member4 = new Member("b001", 1000, "이쁜이");
		
		
		System.out.println(member1.equals(member4));
		System.out.println(member2.equals(member4));
		System.out.println(member2.equals(member3));
		
	}

}
