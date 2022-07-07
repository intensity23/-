package chapter5;
import java.util.Random;

import chapter4.random;

public class exerciseExample02 {
	public static void main(String[] args) {
		Random random = new Random();
		int[] array = new int[6];

		for (int i = 0; i < array.length; i++) {
			array[i] = random.nextInt(45) + 1;

			for (int j = 0; j < i; j++) {
				if (array[i] == array[j]) {
					i--;
				}

			}
		}
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}

}
