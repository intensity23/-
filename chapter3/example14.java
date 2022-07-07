package chapter3;

public class example14 {
	public static void main(String[] args) {
		int score = 85;
		String result = (!(score>90) ? "가" : "나");  // !가 붙어 있어서 "가"가 출력된다.
		
		System.out.println(result);
		
	}

}
