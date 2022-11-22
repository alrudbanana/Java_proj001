package chapter07.ex04;

class A {
	//필드 : -인스턴스 필드 : 객체를 생성해야 호출, Static필드: 클래스 명으로 호출 
	int m;
	//가본 생성자 생략 : 다른 생성자가 없을 시 생략 가능 
	//A(매개변수){실행블락} => 생략가능
	
	
	//메소드
	void work() {
		System.out.println(m);	//기본 값으로 : int : 0 
	}
}
class B{
	int m;
	B(){} //기본 생성자 : 명시
	void work() {
		System.out.println(m); //기본값 int 0
	}
}
class C {
	int n;
	//기본 생성자 생략됨
	//기본 생성자 생략됨: 인풋값이 없는 상태
	//C() {}
	C(int n){	//매개변수가 있는 생성자 , 인풋값을 1개를 받는 생성자 
		this.n = n ; 	//인풋 매개변수 ==> 실행블락의 변수 ==> 필드의 변수 이름이 모두 동일할 경우
	}	//3개가 동일할때 사용, this 자기 자신 객체 
	
	void work() {
		System.out.println(n);
		
	}
}
public class DefaultConstructor {

	public static void main(String[] args) {
			//인스턴스 변수의 초기화 작업에 사용됨
		// 생성자 (constructor) : 객체를 생성할때 호출
			//생성자의 이름은 클래스의 이름과 같아야함 
			//리턴이 없고 클래스 이름과 동일한 메소드
			//기본 생성자는 생략 가능 
			//하나의 클래스에서 여러개의 생성자가 존재할 수 있다.
		
		//1. A클래스의 객체를 생성하고 메소드 호출 : 기본생성자가 생략
		A a = new A();	//new A(); 매개변수 없는 값으로 호출 ,, 기본생성자 호출 : 생략됨
		a.work();
		
		
		//2. B클래스 : 기본 생성자가 명시
		B b = new B();
		b.work();
		
		//3. C클래스 : 기본 생성자가 생략. 인풋값을 1개 받는 생성자가 존재 
//		C c = new C(); //오류 발생 : 클래스 내의 다른 생성자가 존재 할 시 기본 생성자는 명시해줘야함 
		C c1 = new C(3);
		c1.work();
	}

}
