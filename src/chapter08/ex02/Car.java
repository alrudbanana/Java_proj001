package chapter08.ex02;

public class Car {	 	//public : 클래스 이름, 필드명, 생성자명, 메소드명 앞
	public String carName;
	public String carColor;
	public int maxSpeed;
	
	//생성자 
	public Car(){}
	public Car(String carName,String carColor, int maxSpeed){
		this.carName = carName;
		this.carColor = carColor;
		this.maxSpeed=maxSpeed;
	}
	public void print() {
		System.out.println("자동차 명 : " + carName);
		System.out.println("자동차 명 : " + carColor);
		System.out.println("자동차 명 : " + maxSpeed);
	}
	public static void main(String[] args) {
		
		
	}

}