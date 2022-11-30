package Chapter13.ex07;

//3. 매개변수로 받아서 처리 : 인터페이스를 구현한 클래스 (x), 메소드의 인풋 매개변수로 인터페이스를 전송

//인터페이스 
interface A {
	void abc();
}

class C {
	//메소드의 인풋 매개변수의 타입이 : 인터페이스 A
	void cde(A a) {
		a.abc();
	}
}


public class Annonymous_Class03 {
	public static void main(String[] args) {
		//3. 참조변수 생성 : 인터페이스를 구현한 클래스를 생성
		C c = new C();
		
		A a = new A() {
			@Override
			public void abc() {
				System.out.println("3. 참조변수를 사용해서 메소드 매개 변수로 입력 후 출력");
				
			}
		};
		
		//c 객체의 cde 객체의 매개변수로 A타입의 a 객체를 매개변수로 던짐
		c.cde(a);
		
		
		//제일 많이 사용됨.
		//4. 인터페이스를 구현한 클래스 (x),참조 변수 생성도 (x)
		c.cde(	new A() {
			@Override
			public void abc() {
				System.out.println("3. 참조변수를 사용해서 메소드 매개 변수로 입력 후 출력");
				
			}
		} );
		

		
		
	}

}
