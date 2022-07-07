package chapter4;

public class continueExample {
	public static void main(String[] args) {
		//i가 짝수인 자연수 10이하로 나타내시오(for문 사용)
		for (int i=1; i<=10; i++) {
			if(i%2 != 0) {
				continue;
			}
			System.out.println(i);
			
			
		}
	}

}
