package Chapter11.ex04;

abstract class Animal {		//추상 클래스, 추상메소드가 1개라도 있으면 추상 클래스
	abstract void eat();
	abstract void run();
	abstract void cry();
}

class Cat extends Animal {	//콘크리트 클래스 : 추상 메소드를 모두 구현한 메소드 
	@Override
	void cry() {
		System.out.println("고양이는 야옹");
		
	}
	
	@Override
		void eat() {
		System.out.println("고양이는 먹는다");
			
		}
	
	@Override
		void run() {
		System.out.println("고양이는 달린다");
			
		}
	
}

abstract class Dog extends Animal {	//콘크리트 클래스 : 추상 메소드를 모두 구현한 메소드 
	@Override
	void cry() {
		System.out.println("개는 멍멍");
		
	}
	
	@Override
		void eat() {
		System.out.println("개는 뼈다구를 먹는다.");
			
	}
	
}

class Dogchild extends Dog { //콘크리트 클래스 , Dog의 메소드 모두 구현

	@Override
	void run() {
		System.out.println("응에");
		
	}
}


public class Abstract_Method {

	public static void main(String[] args) {
		// 추상 클래스는 객체를 생성하지 못 한다. 타입으로 지정은 가능하다.
		// Animal, dog는 추상 클래스 이므로 객체 생성이 안된다.
		
		//1. Animal 객체 생성 
		//Animal a1 = new Animal(); 	//오류 발생 : 추상 클래스는 객체화 하지 못한다.
		
		
		//Cat() 을 객체화 해서 Animal 타입으로 정의 
		//Animal 의 메소드 호출 시 오버라이딩 된 cat의 메소드 호출 
		Animal a2 = new Cat();
		a2.eat();
		a2.run();
		a2.cry();
		
		//Cat 객체화해서 Cat타입으로 지정 
		Cat c2 = new Cat();
		c2.cry();
		c2.run();
		c2.eat();
		
		//DogChild를 객체화 해서 Animal 타입 으로 지정
		//Animal a3 = new Dog(); 객체화 불가 
		
		Animal a3 = new Dogchild(); 
		a3.cry();
		a3.run();
		a3.eat();
		
		Dog d3 = new Dogchild();
		d3.cry();
		d3.eat();
		d3.run();
		
		
		//Dogchild 를 객체화 해서 Dogchild타입으로 지정 
		Dogchild dh1 = new Dogchild();
		dh1.cry();
		dh1.eat();
		dh1.run();
		
	}

}
