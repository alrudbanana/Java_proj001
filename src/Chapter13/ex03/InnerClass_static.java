package Chapter13.ex03;


/*
 Static Inner Class: 외부 클래스에서 인스턴스 필드, 인스턴스 메소드는 Static Inner Class 블락에 올수 없다 
 			//외부 클래스의 정적필드, 정적 메소드만 static Inner Class 블락에 올 수 있다.
 
  		인스턴스 필드, 인스턴스 메소드는 객체 생성 후 사용 가능 
  		정적 필드,정적 메소드는 객체 생성 없이 사용가능 , 객체 생성 이후에도 사용가능 
 
 */

class A {	//outer Class 
		//외부 클래스에서 필드 선언 
	int a = 3; 
	static int b = 4; //정적 필드 
	
	//외부 클래스에서 메소드 선언 
	void method1() {
		System.out.println("Istance Method");
	}
	static void method2 () {
		System.out.println("Static Method");
	}
	
		static class B{	//static 이너 클래스 : Static필드, Static메소드만 포함할 수 있다.
			void bcd() {
				//1. 외부 클래스의 인스턴스 필드, 메소드 : 접근 불가 
				System.out.println(b);
				
				//method1();		//인스턴스 메소드 : 접근 불가 
				method2();		//정적 메소드 : 접근가능
			}
		}
	}


public class InnerClass_static {

	public static void main(String[] args) {
		// Static 이너 클래스의 객체 생성 : 외부 클래스를 생성하지 않고도 바로 객체 생성이 가능 
		
		//1. static이너 클래스의 객체 생성 
		A.B b = new A.B();
		b.bcd();
	}

}
