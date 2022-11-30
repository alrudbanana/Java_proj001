package Chapter13.ex02;


//이너 클래스에서 외부 클래스의 필드와 메소드 접근 


//메소드 오버라이딩 : 1. 반드시 상속관계가 있어야한다. 
//				  2. <인스턴스 메소드>는 오버라이딩된다
//				  3. 인스턴스 필드, 정적 메소드 는 오버라이딩되지 않는다.
class A {		//outer class
	//필드
	int a = 3;
	int b = 4;
	int c = 33;
	int d = 44;
	
	//메소드 
	void abc() {	//오버라이딩되지 않는다
		System.out.println("A클래스의 메소드 abc()");
	}
	
	//이너 클래스 
	class B{
		//이너 클래스의 필드 
		int a = 5;
		int b = 6;
		
		//이너 클래스의 메소드 
		void abc() {
			System.out.println("B클래스의 abc()");	//오버라이딩 x
		}
		
		void bcd() {
			//필드의 값 호출 
			System.out.println(a); 	//this.a : 5 츨력
			System.out.println(b);	//this.b : 6 출력 	
			System.out.println("======================");
			
			//이너 클래스에서 Outer class의 필드 호출 
			System.out.println(A.this.a); //outer class A 의 필드 a
			System.out.println(A.this.b); // Outer class a의 필드 b
			
			//메소드 호출 
			abc();	//this.abc() 자신의 이너 클래스 안에있는 메서드
			
			A.this.abc();	//outer class의 메서드 
			
			//이너 클래스와 아우터 클래스에서 중복되지 않은 필드 
			System.out.println("======================");
			System.out.println(c);	//아우터 클래스의 필드 
			System.out.println(d);
		}
	}
}

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1.외부 객체 생성 
		A a = new A();
		//2. 내부 객체 생성
		A.B b = a.new B();
		
		
		b.abc();
		b.bcd();
		
	}

}
