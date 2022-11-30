package Chapter12.ex07;

interface A {
	//static 메소드 : public이 생략됨, 객체 생성없이 바로 호출해서 사용이 가능 
		//구현 코드가 있는 메소드 
	
	static void abc() {
		System.out.println("인터");
	
	}
}


public class Interface_Static_Method {

	public static void main(String[] args) {
		// interface 블럭에서 구현된 메소드 : default, static 
		//메소드 이름 앞에 static 메소드 : 인터페이스 이름으로 바로 호출이 가능
		
		
		A.abc();
	}

}
