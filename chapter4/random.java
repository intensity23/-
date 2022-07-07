package chapter4;

import java.util.Random;

public class random {
	public static void main(String[] args) {
		/*
		 * 이거 시험에 나옴 랜덤 숫자 만들기 1.좋지 않은 방식 int randomNum =(int) (Math.random()*총
		 * 개수)+시작숫자;
		 * 
		 * 2.좋은 방식 Random random = new Random(); 
		 * int randomNum = random.nextInt(총개수)+시작숫자;
		 * 
		 * 3.보안 적용 SecureRandom secureRandom = new SecureRandom(); 
		 * int randomNum =secureRandom.nextInt(총개수) + 시작숫자;
		 * 
		 * SecureRandom random = SecureRandom.getInstanceStrong(); 
		 * int randomNum =random.nextInt(총개수) + 1;
		 */
		Random random = new Random();
	 int[] array = new int[6];
		for (int i = 1; i < array.length; i++) {
for( int j = 1; j < array.length; j++) {
	if( )
}
			int ran = random.nextInt(45) + 1;

			System.out.println(ran);
		}

	}
}
