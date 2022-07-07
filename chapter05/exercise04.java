package chapter5;

public class exercise04 {
	public static void main(String[] args) {
		int[] array = { 5, 1, 3, 8, 2 };
		int max = 0;// Integer.MIN_VALUE; 인트의 최소값
		int min = array[0];
		
		//int max = Integer.MIN_VALUE; 인트의 최소값
		//int min = Integer.MAX_VALUE; 인트의 최대값

		for (int i = 0; i < array.length; i++) {
			if (max < array[i]) {
				max = array[i];
			}
			if (min > array[i]) {
				min = array[i];
			}
		}
		System.out.println("max: " + max);
		System.out.println("min: " + min);

	}
}
