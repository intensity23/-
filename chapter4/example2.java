package chapter4;

public class example2 {
	public static void main(String[] args) {
		int sum = 0;
		for (int n = 1; n <= 100; n++) {

			if (n % 3 == 0) {
				sum += n;

			}
		}
		System.out.println("3의 배수 총합은 : " + sum);
	}

}
