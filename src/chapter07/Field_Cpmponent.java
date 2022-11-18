package chapter07;

class A { //A클래스 : 객체를 생성하기 위한 틀 
	
	//필드 : 객체를 생성시, Heap 영역에 필드의 값이 저장됨,
		//Heap 변수[필드] 의 값이 비어있을 때 강제 초기화 
	int a;
	boolean b;
	double c;
	String d;
	
	//생성자 A (){} : 기본 생성자 생략
	
	//필드의 기본 값을 출력하는 메소드 
	void defaultvalue () {
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}
}

class B{
	
	
	//필드 선언 : Heap
	int m = 3;
	int n = 4;
	
	//기본 생성자 생략 : B() {}
	
	//메소드 선언 
	void work1() {
		int k =5;  //메소드 내부에서 선언된 지역변수 : stack 영역에 저장 
		System.out.println(k);
		work2(3);
	}
	
	void work2(int i) {
		int j = 4;
		System.out.println(i + j);
		
	}
}


public class Field_Cpmponent {

	public static void main(String[] args) {
		// 클래스 내부 구성요소
		// - field : 필드
		// - method : 메소드
		// - constructor : 생성자 
		
		
		//메소드 내부에서 선언된 변수의 값은 Stack
		int e; //메소드 내부에서 선언된 변수는 Stack에 변수와 값이 저장됨.
		
		//1. 객체 생성 
		A abc = new A(); //new Heap영역에 저장해라 , new () <- 기본생성자 호출 
		abc.defaultvalue(); //메소드 호출 
		
		System.out.println("====================");
		
		A bcd = new A(); //하나의 클래스는 다른 객체를 만들수 있음 
		bcd.defaultvalue();
		
		System.out.println("=====================");
		B b = new B();
		b.work1();
		
	}

}
