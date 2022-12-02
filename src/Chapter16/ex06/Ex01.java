package Chapter16.ex06;

//getter/setter통해서 인풋 
// print 메소드  오버라이딩 헤서 필드의 정보를 출력 

abstract  class Fruit {		//추상 메소드,객체의 필드 정보를 출력
	abstract void print();
}

class Apple extends Fruit{
	
	private String name;
	private int price;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	void print() {
		System.out.println("상품이름은 : "+ name + " 이고, "+ "가격은 : " + price + " 원 "+"입니다.");
		
	}
}
class Banana extends Fruit{
	private String name;
	private int price;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	void print() {
		System.out.println("상품이름은 : "+ name + " 이고, "+ "가격은 : " + price + " 원 "+"입니다.");
		
	}
}

//Fruit을 상속하지 않았기 때문에 제너릭 타입으로 저장이 불가 
//class Pencil{
	//private String name;
	//private int price;
//}

//제너릭 클래스 : Fruit을 상속하는 클래스만 저장할 수 있는 제너릭 클래스 
class GenericClass<T extends Fruit>{ //* Genericclass의 T에 올수있는 타입을 지정해줌>>
	private T t;

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}
	
}

public class Ex01 {
	public static void main(String[] args) {
		
		Apple a1 = new Apple();
		//필드에 값넣기 
		a1.setName("애플");
		a1.setPrice(1000);
		a1.print();
		
		
		GenericClass <Apple> apple = new GenericClass<>();
		apple.setT(a1);
		apple.getT().print();
	}

}
