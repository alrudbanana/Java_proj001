package Chapter17.ex04;

import java.util.ArrayList;

class Car {
	String company;
	String carModel;
	String color;
	int maxSpeed;
	
	
	public Car (String company,String carModel,String color,int maxSpeed) {
		this.company = company;
		this.carModel =carModel;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}


	@Override
	public String toString() {
		return "Car [company=" + company + ", carModel=" + carModel + ", color=" + color + ", maxSpeed=" + maxSpeed
				+ "]";
	}
	
}
public class Ex01 {
	public static void main(String[] args) {
		ArrayList <Car> a1 = new ArrayList();
		Car car1 = new Car("현대자동차","그렌져","검은색",200);
		Car car2 = new Car("현대자동차","그렌져","검은색",200);
		Car car3 = new Car("현대자동차","그렌져","검은색",200);
		
		a1.add(car3);
		a1.add(car1);
		a1.add(car2);
		
		for(int i = 0; i<a1.size();i++) {
			Car car = a1.get(i);
			System.out.println(car);
		}
		for(Car k : a1) {
			System.out.println(k);
		}
		System.out.println(a1);

	}
	
	
	

}
