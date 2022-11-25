package Chapter11.ex01;

class Aaa {
	int m;
	final int n;
	//생략된 생성자 출력 
	
	Aaa() {
		n = 10;
	}
	Aaa(int n) {
		this.n = 10;
	}
	
	void print() {
		System.out.println("Aaa 클래스의 print() 메소드 입니다.");
	}
	
	//자식 클래스 재정의(오버라이딩 불가) 할 수 없도록 설정한 메소드 : 아주 중요한 메소드 
	final void run () {
		System.out.println("Aaa 클래스의 run() 메소드 입니다. ");
	}
	
}

final class Bbb extends Aaa {		//상속이 불가한 클래스 . 
	
	Bbb () {
		super();
	}
	
	void print() {
		System.out.println("Bbb 클래스에서 오버라이딩 됨");
	}
	//생략된 생성자 출력 
	
	
	
	//@Override
	//void run() { } // 자식 클래스에서 수정 불가 
		
}

//class Ccc extends Bbb {
	//상솓이 불가한 클래스
//}

public class Final_class {

}
