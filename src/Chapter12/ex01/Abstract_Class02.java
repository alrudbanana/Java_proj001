package Chapter12.ex01;

//추상 메소드를 구현하는 방법  2
	//1.자식 클래스에서 구현한 클래스를 생성하고 출력
	//2.익명클레스를 생성해서 출력 ; 한번 사용하고 버릴 경우, 안드로이드 폰 개발, 이벤트 처리 할 때 사용

//1. 첫번째 방법 : 추상 클래스(A) <== 구현한 클래스 (B)
abstract class A { //추상클래스 
	abstract void cry();
	
}
// 구현 클래스를 생성 : << 구현한 클래스 (B)

class B extends A {		// 1. 자식 클래스에서 추상클래스의 메소드를 구현한 클래스를 생성 
	@Override
	void cry() {
		// TODO Auto-generated method stub
		System.out.println("모든 동물은 웁니다. (자식 클래스에서 추상 메소드를 완성함)");
	}
}

abstract class C  {
	abstract void run ();
}

//두번째 방법 : 추상 클래스를 구현한 클래스 없이 바로 출력 . 
public class Abstract_Class02 {

	public static void main(String[] args) {
		//추상 클래스는 객체화 할 수 없다. 타입으로 지정은 가능
		 //A a = new A () ;	//객체 생성 불가 
		//첫번째 방법 
		A a1 = new B();
		a1.cry();
		
		A a2 = new B();
		a2.cry();
		
		//두번쩨 방법  : 구현한 클래스 없이 바로 출력 (익명 클래스 사용 ) C : 추상 클래스 (객체화 불가능)
			//익명 클래스 : 
		C c1 = new C () {
			//C : 추상 클래스와 구현되지 않는 메소드를 구현함 
			@Override
			void run() {
				// TODO Auto-generated method stub
				System.out.println("미완성 == > 완성 ");
			}
		};
		c1.run();
		
		C c2 = new C () {
			@Override
			void run() {
				System.out.println("미완성2 ==> 완성 ");
				
			}
		};
		c2.run();
	}

}
