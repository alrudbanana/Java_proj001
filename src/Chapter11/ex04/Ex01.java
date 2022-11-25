package Chapter11.ex04;

abstract class Car{ 	//트럭, 자가용, 굴삭기 <== 추상 메소드를 구현한 클래스 생성 
	abstract void run() ;
	abstract void eat() ;
}

class Truck extends Car {
	@Override
	void run() {
		System.out.println("트럭이 차보다 느림");
		
	}
	@Override
	void eat() {
		System.out.println("트럭은 휘발유");
		
	}
}
abstract class My_car extends Car {
	@Override
	void run() {
		System.out.println("자가용은 벤츠로 달림");
		
	}
	@Override
	void eat() {
		System.out.println("경유 비쌈");
		
	}
}

class Gul extends Truck {
	@Override
	void eat() {
		System.out.println("굴삭기 좋다");
		super.eat();
	}
	@Override
	void run() {
		System.out.println("느리다.");
		super.run();
	}
}


public class Ex01 {

	public static void main(String[] args) {
		
		
		//Car car = new Car();
		Car car = new Truck();
		car.eat();
		car.run();
		System.out.println("========");
		
		Car car1 = new Gul();
		car1.eat();
		car1.run();
		
		System.out.println("========");
		Truck truck = new Truck();
		truck.eat();
		
	}

}
