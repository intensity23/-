package chapter12_1;


public class Generic {
 
	public static void main(String[] args) {
		/*
		 * Generic(제네릭, 지네릭)
		 * JDK 1.5부터 도입
		 * 표현 방법: <>를 이용 
		 */
//		new MemberValue()
//		IntValue value = new IntValue(10);
//		System.out.println(value.getValue());
//		StringValue value2 = new StringValue("10");
//		System.out.println(value2.getValue());
//		
		Value value3 = new Value("a");
		if (value3.getValue() instanceof Integer) {
			int value4 = (int) value3.getValue();
		}
		
		Value value5 = new Value(100);
		String value6 = (String) value5.getValue();
		
		Box<Integer> box = new Box<Integer>(100);
//		box.setValue(100);
		int integer = box.getValue();
	}
}
