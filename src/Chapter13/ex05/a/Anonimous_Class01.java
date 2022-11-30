package Chapter13.ex05.a;

//1. 인터페이스를 구현한 클래스를 생성 후 출력 
//B 클래스의 abc() 메소드 호출 시 C 클래스에 구현된 메소드 출력 

interface A {
	void cry();
	void fly();
}

class B {
	
	void abc() {
	c.cry();
	c.fly();
	}
	
	class C implements A{
		@Override
		public void cry() {
			System.out.println("C 클래스의 A의 인터페이스 상속 cry()");
			
		}
		@Override
		public void fly() {
			System.out.println("C 클래스의 A의 인터페이스 상속 fly()");
			
		}
	}
	
	A c = new C ();
	
}

public class Anonimous_Class01 {

	public static void main(String[] args) {
		B a = new B ();
		a.abc();

	}

}
