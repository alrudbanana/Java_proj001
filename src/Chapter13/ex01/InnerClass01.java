package Chapter13.ex01;

/*
 	이너클래스 : 클래스 내부의 클래스 
 */

class A {		//outer class : 필드. 메소드에 접근 제어가 붙어있고
				//Inner Class를 생성하면 Outer class 의 접근제어자 상관없이 접근 
	public int a = 3;		//public 다른 패키지에서 접근 가능 , 같은 패키지 내에서도 접근 가능 
	protected int b = 4;	//
	int c = 5;
	private int d = 6;
	
	void abc() {
		System.out.println("A클래스의 메소드 abc()입니다.");
	}
	
	class B{
		void bcd() {
			//1. Outer class 의 필드 접근 : 접근제어자와 상관없이 모든 필드 접근 
			System.out.println(a);
			System.out.println(b);
			System.out.println(c);
			System.out.println(d);
			
			//2. Outer class의 모든 메소드 접근 가능 : 접근제어자 상관없이 접근 
			abc();
		}
	}
	
	
	
	
}

//이너 클래스 : 인스턴스 이너클래스 , 1. 아우터 클래스의 접근 제어자와 상관없이 접근 ,
		//2. 기능 구현을 외부의 객체 생성 없이 내부에서 바로 처리 

public class InnerClass01 {

	public static void main(String[] args) {
		// 이너 클래스를 사용하기 위해서는 Outer 클래스의 객체를 먼저 생성해야한다.
		A a = new A(); 
		
		A.B b = a.new B();
		

	}

}
