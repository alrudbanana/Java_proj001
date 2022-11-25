package chapter10.ex04;

class A {
	void abc() {} //메소드의 접근 지정자 : protected 
	
}
class B extends A {
	@Override
	public void abc() {}	//public 은 부모 메소드의 접근지정자 protected보다 넓다. 
							//부모보다 접근지정자의 범위가 넓은건 상관없으나 좁으면 안됨
}

class B2 extends A{
	@Override 
	protected void abc() {}
	
}

class B3 extends A{
	void abc() {} 	//default
}

class B4 extends A{
	//private void abc() {} 		//private 
	
}

public class MethodOverriding04 {

	public static void main(String[] args) {
		// 메소드 오버라이딩과 접근 지정자와의 관계 
			// -부모의 메소드를 자식에서 재 정의해서 사용 
			// -부모의 메소드 이름과 동일, 시그니처도 동일
			// -부모의 접근지정자 보다 오버라이딩할 자식 메소드는 접근 지정자가 부모와 같거나 넓어야한다. 
			// -public, protected, default, private
		
	}

}
