package chapter09.ex02;

import chapter09.ex01.A;

//외부 클래스, 상속관계가 설정된 클래스 
public class A_test3 extends A {
	
	int k = a;	//a : public
	int l = b;	//b : protected
	//int m = c;	
	//int n = d;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		A_test3 b1 = new A_test3();
		System.out.println(b1.a); //public
		System.out.println(b1.b); //protected
		//System.out.println(b1.c); //default
		//System.out.println(b1.d);private
		
		b1.abc();//public 
		b1.bcd();//protected
		//b1.cde(); //defult
		//b1.def(); //private
	}

}
