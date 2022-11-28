package Chapter12.ex01;

abstract class Animal { 	//추상 클래스, 추상메소드를 1개라도 포함이 되면 반드시 추상클래스가 되어야함 
	String name;
	String age;
	
	Animal (){} 
	//추상 메소드 : { } , 실행 블락이 없고 , 선언만 된 메소드 
		//하위 클래스에서 추상메소드를 반드시 구현해야한다. 
	abstract void cry();	// 인풋 () , 만선언되고 , {} 실행부 가 없는 것 => 추상메소드 
	abstract void run();
	
	
	//toString 메소드 재정의 
	// object 클래스의 메소드 : 객체를 출력했을 때 객체의 Heap의 참조 주소 를 출력하지 않고 필드의 값을 출력 
	
	@Override
	public String toString() {
		return "Animal [name=" + name + ", age=" + age + "]";
	}	
}

class Cat extends Animal { // 1. Cat 클래스가 콘크리트 클래스로 만든다. 
						// 2. 추상 클래스가 되어야한다.
	// 생성자를 사용해서 필드의 값 입력 
	
	public Cat(String name, String age) {
		super();
		this.name = name;
		this.age = age;
	}
	public Cat(String name, int i) {
	// TODO Auto-generated constructor stub
}
	@Override
	void cry() {
		System.out.println("고양이는 야옹");
		
	}
	@Override
		void run() {
			System.out.println("고양이가 뜁니다.");
			
		}
	
}

class Dog extends Animal {
	public Dog (String name, String age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	public Dog(String name, int i) {
		// TODO Auto-generated constructor stub
	}

	@Override
	void cry() {
		System.out.println("멍멍");
		
	}
	@Override
	void run() {
		System.out.println("개는 달립니다.");
		
	}
	
	
}

public class Abstract_Class {

	public static void main(String[] args) {
		// 객체 생성 후 값 입력 
		
		Animal a1 = new Cat("고양이",10); 
		Animal a2 = new Dog("고양이",20); //업캐스팅 됨 

		
		//객체를 배열에 저장 
		Animal [] arr = new Animal[] {a1, a2};
		
		//for 문을 사용해서 객체의 정보를 출력 
		for( int i = 0 ; i < arr.length ; i++ ) {
			//객체 자체를 출력 : toString() : 객체의 메모리 정보를 출력 
			System.out.println(arr[i]); // toString() 
			arr[i].cry();
			arr[i].run();
			
			
		}
	}

}
