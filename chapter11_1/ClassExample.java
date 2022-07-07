package chapter11_1;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ClassExample {
	public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InvocationTargetException {
		// Reflection(반사, 투영, 거울)
		Class class1 = Member.class;
		Class class2 = Class.forName("chapter11_1.Member");
		Member member = new Member("a001", 100, "김은대");

		Class class3 = member.getClass();

		Field[] fields = class3.getDeclaredFields();
		for (Field field : fields) {
			System.out.println(field.getName());
		}
		Method[] methods = class3.getDeclaredMethods();
		System.out.println(methods.length);
		methods[0].setAccessible(true);
		methods[0].invoke(member, "홍길동");
	}

}
