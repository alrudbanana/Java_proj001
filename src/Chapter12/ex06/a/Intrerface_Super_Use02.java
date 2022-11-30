package Chapter12.ex06.a;

//자식 클래스에서 인터페이스의 메소드 호출 
	

interface A {		//인터페이스 : 추상메소드만 존재해야함 ( 예외: default, static 메소드)
	default void abc() {
		System.out.println("A 인터페이스의 default 메소드");
	}
}
interface B {
	default void bcd() {
		System.out.println("B인터페이스의 default 메소드");
	}
}

class C {	//일반 클래스 : 추상메소드 + 일반 메소드 + 일반필드
	C () {}
	void cde() {
		System.out.println("일반클래스의 일반 메소드");
	}
}

//Class D는 C클래스를 상속하고 있고 A,B인터페이스를 구현하고 있다. 
	//extends 다음에 하나의 부모만 올 수 있다.

class D  extends C implements A,B {
	// A인터페이스와 B인터페이스의 메소드 이름이동일해서 오류가 발생
	
		//부모의 메소드 호출 
			//super : 클래스의 부모 메소드 호출 
			//A.Super : 인터페이스의 부모의 메소드 호출 
	
				void hij() {
					super.cde();		//C클래스의 cde() 메소드 호출 
				}
				void lmn() {
					A.super.abc();		//인터페이스의 메소드 호출 
					B.super.bcd();
				}
	void def() {
		A.super.abc();
	}
}

public class Intrerface_Super_Use02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
