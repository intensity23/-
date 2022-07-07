package chapter6.project;

public class Plane {
	// 필드
	private String manufacture;// 제작사
	private String model;// 비행기 모델명
	private int maxNumberOfPassengers;// 최대 승객수
	private static int numberOfPlanes;// 지금까지 생성된 비행기 객체의 수
	// 생성자

	public Plane() {
		numberOfPlanes++;
	}

	public Plane(String manufacture, String model, int maxNumberOfPassengers) {
		this();
		this.manufacture = manufacture;
		this.model = model;
		this.maxNumberOfPassengers = maxNumberOfPassengers;

	}

	// 매서드

	public String getManufacture() {
		return manufacture;
	}

	public void setManufacture(String manufacture) {
		this.manufacture = manufacture;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getMaxNumberOfPassengers() {
		return maxNumberOfPassengers;

	}

	public void setMaxNumberOfPassengers(int maxNumberOfPassengers) {
		if (maxNumberOfPassengers > 0) {
			this.maxNumberOfPassengers = maxNumberOfPassengers;

		}
	}

	static int getNumberOfPlanes() {
		return numberOfPlanes;

	}

	

}
