package chapter09.ex03;

class C {
	int a = 10;				//메모리의 Heap 공간에 변수와 값을 저장 
	static int b =20;			//메모리의 클래스 영역에 변수의 값을 저장 Heap
								//영역에는 클래스 영역에 저장된 주소값만 저장 , 값을 저장 하지 않아서 
	
	void print() {
		System.out.println(a+ " "+b);
	}
	static void print2() {	//static 메소드는 인스턴스 필드가 올수 없다. a
		//a: 인스턴스 필드 , static 메소드에는 static만 옴 
		System.out.println(b);
	}
}

public class Instance_Vs_Static02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C c1 = new C () ; // 객체 생성 
		
		//객체 필드의 값 수정 
		c1.a = 100;
		c1.b = 777;
		
		System.out.println(c1.a);
		System.out.println(c1.b);
		
		C c2 = new C();
		System.out.println(c2.a);
		System.out.println(c2.b);
		
		c1.a =888;
		c2.a =999; //a; 그 객체에만 적용되는 고유한 값
		c1.b =111; //모든 객체에서 공유되는 블락  
		
		System.out.println("==============");
		C c3 = new C();
		System.out.println(c1.a);
		System.out.println(c1.b);
		System.out.println(c3.a);
		System.out.println(c3.b);
		System.out.println(c2.a);
		System.out.println(c2.b);
		
		System.out.println("==============");
		
		
	}

}
