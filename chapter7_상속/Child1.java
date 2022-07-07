package chapter7_상속;

public class Child1 extends Parent1 {
	private String name;

	public Child1() {
		this("홍길동");
		System.out.println("Child1() call");

	}

	public Child1(String name) {
		//super(); 가 생략되어있음 -- 생성자 호출 this가 있으면 super없음. (생성자가 여러개여도 super는 그 중에 하나에 있음?)
		this.name = name;
		System.out.println("Child1(String name) call");
	}

}
