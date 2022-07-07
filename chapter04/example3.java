package chapter4;

import java.util.Random;

public class example3 {

	public static void main(String[] args) {
		// while쓰기

		Random random = new Random();

		while (true) {
			int num1 = random.nextInt(6) + 1;
			int num2 = random.nextInt(6) + 1;
			System.out.println("(" + num1 + "," + num2 + ")");
			if (num1 + num2 == 5) {
				break;

			}
		}

	}

}
