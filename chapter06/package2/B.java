package chapter6.package2;

public class B {
	public B() {
		A a = new A();
		a.field1 = 1; // 가능
		a.field2 = 1; // 가능
		a.field3 = 1; // 불가능  private 필드 접근불가

		a.method1();  //가능
		a.method2();  //가능
		a.method3();  //불가능  private 메소드 접근불가
	}

}
