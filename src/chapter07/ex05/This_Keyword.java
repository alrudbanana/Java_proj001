package chapter07.ex05;

class A {
	int m;
	int n; 
	
	//메소드 : 정수값 2개를 받음, 정수값 2개 받음 , this 키를 생략한 경우
	void init( int m, int b ) {		//메소드 내의 : a, b, c <== 지역변수 
		int c;
	this.m  = m; 	//this.m : 기본적으로 this키가 생략되어 있다. 
		n = b;		//this.n : 
	}
	
	//메소드 :  
	void work() {
		this.init (2,3); // this:자신의 객체의 필드나 메소드 호출 
		System.out.println(m + " "+ n + " ");
	}
	//this 키를 명시해야함 
	void init2 (int m, int n) {
		m = m;
		n = n;
	}
}

public class This_Keyword {

	public static void main(String[] args) {
		// this : 자기 자신 객체의 필드나 메소드 
		// this() : 생성자에서 다른 생성자 호출할때 사용 
		// super : 상속에서 부모의 객체의 필드나 메소드를 사용. <
		// super() : 부모 클래스의 생성자 호출 할 때 사용
		
		//A a = work

	}

}
