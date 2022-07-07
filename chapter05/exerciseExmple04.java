package chapter5;
import java.util.Random;

public class exerciseExmple04 {
	public static void main(String[] args) {

		// 주사위를 던져서 각 면이 나오는 횟수를 출력하는 프로그램을 만들어 보자. 주사위를 던지는 동작은 1부터 6까지의 임의로 만들어내는 난수
		// 발생기(Random 객체)가 대신한다. 난수 발생기를 10,000번 호출하여 각 면이 나타나는 횟수를 계산하여 배열에 저장한다. 확률
		// 이론에 의하면 주사위의 각각의 면들이 거의 동일한 횟수로 나와야 한다.
		// 아래 그림과 똑같은 값이 나오지 않고 컴퓨터마다 값이 다르게 나오는 것이 정상이다.
		Random random = new Random();

		System.out.println("-------------");
		System.out.println("면   " + "     빈도");
		System.out.println("-------------");
		int[] count = new int[6];
		int z = 1;
		for (int i = 0; i < 10000; i++) {
			count[random.nextInt(6)]++;
			
			/*
			 * for (int i = 1; i <= 10000; i++) { int ranNum = random.nextInt(6) + 1; if
			 * (ranNum == 1) { count[0]++; } else if (ranNum == 2) { count[1]++; } else if
			 * (ranNum == 3) { count[2]++; } else if (ranNum == 4) { count[3]++; } else if
			 * (ranNum == 5) { count[4]++; } else if (ranNum == 6) { count[5]++; }
			 */
		}
		for (int j = 0; j < 6; j++) {
			System.out.println(z + "       " + count[j]);
			z++;

		}
	}
}
