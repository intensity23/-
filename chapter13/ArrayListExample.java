package chapter13;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
	public static void main(String[] args) {
		// 객체에 들어갈 타입을 선언 할 때만 써줘도 됨
		// ArrayList<String> list1 = new ArrayList<>();
		List<String> list = new ArrayList<>();
		list.add("Java");
		list.add("JDBC");
		list.add("Servelt/JSP");
		for (String string : list) {
			System.out.println(string);
		}
		System.out.println();
		
		list.add(2, "Database");// 2번째 자리에 넣고 원래 자료를 한칸씩 뒤로 밈
		list.add("myBatis");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(i + ":" + list.get(i));
		}
		System.out.println();
		
		for (String string : list) {
			System.out.println(string);
		}
		System.out.println();
		
		String skill = list.get(4);
		System.out.println(skill);
		System.out.println();
		
		list.remove(0);// 삭제하면 바로 뒤 인덱스부터 마지막 인덱스 까지 모두 앞으로 1씩 당겨짐
		for (int i = 0; i < list.size(); i++) {
			System.out.println(i + ":" + list.get(i));
		}System.out.println();
		
		list.clear();
		System.out.println(list.size());
		

	}

}
