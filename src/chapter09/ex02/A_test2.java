package chapter09.ex02;

import chapter09.ex01.A;

public class A_test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//A클래스와 다른 패키지에 존재하는 클래스 
		
		A a1 = new A();
		
		System.out.println(a1.a); //public 외부 패키지 에서 접근이 가능 
//		System.out.println(a1.b); //protected: 외부 패키지에서 접근이 가능 ( 단 상속관계 일때 가능)
		//System.out.println(a1.c); //default : 외부 패키지에서 접근 불가 
									//동일한 패키지 내에서만 접근 가능 
//		System.out.println(a1.d); //private: 같은 파일에서만 접근 
		a1.abc();
		//a1.bcd(); //protected, 상속 관계가 설정되어있지 않아서 외부 x, 상속관계일때만 가능 
		//a1.cde(); //default
		///a1.def(); //private , 같은 파일만 가능 
	
	}

}
