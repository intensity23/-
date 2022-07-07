package chapter5;
import java.util.Random;

public class 로또번호뽑기2 {
	public static void main(String[] args) {
		// 45개 배열 만들고 1~45 숫자 넣기
		// 숫자 자리 섞기(45번)
		// 물컵 비유 
		// 번호 6개씩 잘라서 번호 추출
		int[] numbers = new int[45];
		int temp;
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = i + 1;
			
		}
		for (int i = 0; i < numbers.length; i++) {
			Random random = new Random();
			int ranNum = random.nextInt(44);
			temp = numbers[i];
			numbers[i] = numbers[ranNum];
			numbers[ranNum] = temp;
		}
		for (int i = 0; i < 6; i++) {
			System.out.print(numbers[i] + " ");
		}
	}

}
