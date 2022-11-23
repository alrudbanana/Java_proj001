package chapter10.ex02;

//클래스의 상속관계에서 업캐스팅 및 다운 캐스팅 
class A{}
class B extends A{}
class C extends B{}
class D extends B{}
public class Type_Casting02 {

	public static void main(String[] args) {
		// 1. 업캐스팅 (자동으로 변환) : 생략시 컴파일러가 자동으로 추가 , 자식 클래스 객체 생성 ==> 타입을 부모 
		// ac: A,B,C를 모두 내포하고 있고 A타입으로 정의 <<A만 접근>>
		A ac = (A) new C();
			System.out.println(ac instanceof A);
			System.out.println(ac instanceof B);
			System.out.println(ac instanceof C);
			System.out.println(ac instanceof D);
		
		//bc : A,b,C를 모두 내포하고 있지만 	a,b접근 
		B bc = new C();
		
		A a =bc; // bc는 B타입으로 정의 A타입으로 업 캐스팅 
		
		//2. 다운 캐스팅 (수동으로 명시) : 캐스팅이 불가능해도 컴파일러가 체크하지 않는다. 실행시 예외가 발생
		//aa는 A만 내포하고 있다.
		A aa = new A(); // aa는 A객체만 
			System.out.println(aa instanceof A);
			System.out.println(aa instanceof B);
			System.out.println(aa instanceof C);
			System.out.println(aa instanceof D);
		
		if (aa instanceof B) {
			B ba = (B)aa ; //오류가 없다, 실행시 오류 발생 
		}else {
			System.out.println("aa는 B를 내포하고있지 않아서 다운캐스팅이 불가합니다.");
		}
		System.out.println("=======================");
		// bd : A,B,D를 내포하고 있고 B타입으로 지정 <<A,B>>
		// 
		
		B bd = new D();
		//D를 B타입 지정 
	}

}
