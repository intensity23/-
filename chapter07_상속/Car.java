package chapter7_상속;

public class Car {
	public int speed;
	
	public void speedUp() {
		speed+= 1;
	}
	
	public final void stop() {//final 메서드
		System.out.println("차를 멈춤");
		speed = 0;
	}

}
