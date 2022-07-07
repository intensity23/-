package chapter7_상속;

public class SportsCar extends Car{
	
	public void speedUp() {//재정의 가능
		speed+=10;
	}
	
	public void stop() { //stop은 Car에서 final 메소드이기 때문에 재정의(오버로드) 할 수 없다
		System.out.println("스포츠카를 멈춤");
		speed = 0;
	}

}
