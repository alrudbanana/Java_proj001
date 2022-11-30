package Chapter13.ex04.a;

class A {
	int a = 3; 
	
	//지역 이너 클래스는 메소드 내부에서 객체 생성하고, 객체의 내부 메소드 호출 
	void abc() {
		int b = 5; //지역 변수, 메소드 실행시 만들어지고 메소드가 끝나면 없어짐 
			//메소드 내부의 지역변수가 지역 이너 클래스에서 사용될 경우, 상수로 바뀐다. final 
		
		//지역 이너 클래스: 메소드 내부에 존재하는 클래스 
		class B{	//메소드 클래스 
			void cde() {
				System.out.println(a);		//3
				System.out.println(b);		//5, 메소드의 것 ; 메소드 내 지역변수를 상수로 변경 
	
			}
		}
		
		B b1 = new B();
		b1.cde();
	}
}


public class InnerClass_Anonimous {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. 객체 생성 후 지역 이너 클래스 출력 
		A a = new A();
		a.abc(); 	//메소드 호출 시 객체 생성/ 객체의 메소드 호출 
	}

}
