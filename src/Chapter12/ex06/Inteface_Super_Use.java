package Chapter12.ex06;

interface A {
	
	//기존의 와이파이 기능의 메소드만 구현된 상태에서 새로운 기능인 블루투스 기능이 추가됨 
	//2022년에 새로운 기능 추가 
	//default 메소드 : 인터페이스 내에서 구현부가 있는 메소드 
		//모든 자식 클래스에서 상속되어 내려감.
	default void cde() {		//public 
		System.out.println("블루투스 기능 추가됨");
	};
	
	//(추상메소드) : public abstract 가 생략
		//자식 클래스에서는 선언된 메소드를 구현해야될 의무
	void ABC();	//2000년에 구현된 메소드
	void bcd();	//2005년에 구현된 메소드
	//void cde();	//2010년에 구현된 메소드 
}

class B implements A { 	// 생략 , extends Object 가 생략이 되어있다.
	@Override
	public void ABC() {
		System.out.println("와이파이 기능 1");
		
	}
	@Override
	public void bcd() {
		System.out.println("와이파이 기능 2");
		
	}
	public void def() { 	//자식 클래스에서 부모 인터페이스 메소드 호출 : A.super.메소드명
		A.super.cde();		//인터페이스 A의 cde()메소드 호
		//super.cde();		//오브젝트 클래스의 cde메소드 호출 
	}
}

public class Inteface_Super_Use {

	public static void main(String[] args) {
		//1. 객체 생성 
		A a1 = new B();
		a1.ABC();		//A인터페이스에 존재함		//B()에서 오버라이딩됨
		a1.bcd();		//A인터페이스에 존재함		//B()에서 오버라이딩됨
		a1.cde();		//A인터페이스에 존재함		//default메소드 
		
		
		//a1을 B타입으로 다운캐스팅해야 def() 메소드를 호출 할 수 있다. 
		System.out.println("==================");
		B b1 = (B) a1;
		b1.def();
		
	}

}
