package chapter02;

class VriableExchangeExample {
public static void main(String[] args) {
	int x = 3;
	int y = 5;
	System.out.println("x: " + x +", y: " + y);
	int z; 
	z = x;  //가득찬 물컵 2개 내용물 바꾸는 법 처럼 생각 - 빈 물컵 이용
	x = y;
	y = z;
	System.out.println("x: " + x +", y: " + y);
}
}
