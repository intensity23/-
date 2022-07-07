package chapter6.package1;

import chapter6.package2.A;

public class C {

	public C() {
		A a = new A();
		a.field1 = 1; //가능
		a.field2 = 1; //불가 default 필드 접근불가
		a.field3 = 1; //불가 private 필드 접근불가

		a.method1(); //가능
		a.method2(); //불가 default 메소드 접근불가
		a.method3(); //불가 private 메소드 접근불가
	}

}
