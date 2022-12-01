package Chapter16.ex04;

class GenericMethods{
	
	//제너릭 메소드 	: 일반 클래스 내부에 제너릭 타입의 메소드
	//접근 제어자 <외부에서 타입지정> 리턴타입 메소드명 (타입 변수)
	//메소드 내부에 꺽새가 있다.
	
	//다양한 타입의 값을 리턴으로 되돌려주는 메소드 
	public <T> T method1 (T t) {
		return t;
	}
	
	//
	public<T> boolean method2 (T t1, T t2) {
		return t1.equals(t2);
	}
	
	public <K, V> void method3 (K k, V v) {
		System.out.println(k + ":" + v);
	}
}

public class GenericMethod {

	public static void main(String[] args) {
		// 제너릭 메소드 사용하기 
		
		// 일반 클래스의 객체 생성 
		GenericMethods gm = new GenericMethods();
	System.out.println("===============================");
	
		//1. 메소드 호출시 타입 지정
		
		gm.<String> method1("안녕");
		//2. 메소드 호출시 타입 생략
		String  str1 = gm.<String>method1("안녕");
		
		String 	str2 = gm.method1("하세요");	//뒤의 인풋 값으로 타입을 유추할 수 있는 경우
											//생략이 가능 
		System.out.println(str1);
		System.out.println(str2);
		
		Integer int1 = gm.<Integer>method1(100);
		Integer int2 = gm.method1(200);
		
		System.out.println(int1);
		System.out.println(int2);
		
		System.out.println(gm.<Double>method1(100.11));
		System.out.println(gm.method1(200.22));
		
		System.out.println("============================");
		
		//2. method2 호출 
	System.out.println("2번 boolean ");
		//리턴타입은 일반 타입 
		boolean bool1 = gm.<Double>method2(2.5,2.5);
		boolean bool2 = gm.method2(2.5,2.5);
		
		System.out.println(bool1);
		System.out.println(bool2);
		
		System.out.println(gm.<String> method2 ("안녕","안녕"));
		System.out.println(gm.method2("안녕","하세요"));
		
		System.out.println("===================================");
		
		//method3출력 
		gm.<String,Integer> method3("국어",80);
		gm.method3("영어", 30);
		
		
		System.out.println("==========================");
		gm.method3("아바타", "메가박스");
		gm.method3("", null);
		
	}

}
