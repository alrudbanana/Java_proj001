package Chapter12.ex05;

interface A {
	
	//기존의 와이파이 기능의 메소드만 구현된 상태에서 새로운 기능인 블루투스 기능이 추가됨 
	//2022년에 새로운 기능 추가 
	default void cde() {
		System.out.println("블루투스 기능 추가됨");
	};
	void ABC();	//2000년에 구현된 메소드
	void bcd();	//2005년에 구현된 메소드
	//void cde();	//2010년에 구현된 메소드 
}

//가정 : interface A 를 구현한 클래스가 1000개 존재한다.

class Aa implements A {
	@Override
	public void ABC() {
		System.out.println("와이파이기능구현1");
		
	}
	@Override
	public void bcd() {
		System.out.println("와이파이기능구현2");
		
	}
}

class Aaa implements A {
	 @Override
	public void ABC() {
		 System.out.println("와이파이기능구현3");
	}
	 @Override
	public void bcd() {
		 System.out.println("와이파이기능구현4");
		
	}
}

class Aaaa implements A {
	@Override
	public void ABC() {
		 System.out.println("와이파이기능구현5");
		
	}
	@Override
	public void bcd() {
		 System.out.println("와이파이기능구현6");
		
	} 
	
	//default 메소드도 오버라이딩이 가능하다. 
	@Override
	public void cde() {
		// TODO Auto-generated method stub
		System.out.println("A인터페이스의 default메소드 오버라이딩");
	}
}

public class Default_Interface {

	public static void main(String[] args) {
		//interface : 인터페이스의 모든 필드와 메소드는 public이 생략되어있다. 
				//구현된 클래스에서 메소드를 오버라이딩 할 때 public 
		//- 모든 필드는 : public static final
		//모든 메소드는 추상메소드(public abstract)이여야한다.
	    //예외) 자바 1.8버전 부터 새로운 기능이 추가
	    //default, static 메소드가 추가됨
	    //인터페이스에서 구현부가 있는 메소드. default,static
	
		
	//default : 인터페이스에서 구현부가 있는 메소드 
			//인터페이스를 구현한 모든 클래스에 상속되어 적용
			//오버라이딩도 가능 
			//새로운 기능을 추가 할 때 하위의 구현된 클래스의 오류없이 적용 가능 하도록 함
		
		// 인터페이스를 구현한 클래스를 객체화 해서 타입으로 지정함.
		A a1 = new Aa();
		A a2 = new Aaa();
		A a3 = new Aaaa();
		
		//2. 인터페이스의 메소드 호출 ==> 오버라이딩된 메소드가 호출
		a1.ABC();
		a1.bcd();
		a1.cde();		//default 메소드 
		
		System.out.println("=========================");
		
		a2.ABC();
		a2.bcd();
		a2.cde();
		
		System.out.println("=========================");
		a3.ABC();
		a3.bcd();
		a3.cde();
	}

}
