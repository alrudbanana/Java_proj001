package chapter07.ex01;

public class InternalCallMethod {
	
	//main : 메소드 <== static 이 붙어있는 메소드
	
	//메소드 이름 앞에 Static 키를 넣으면 객체 생성없이 
	public static void main(String[] args) {
		// 클래스 내부에서 다른 메소드 호출 
			// main 메소드는 메소드 이름 앞에 Public : 다른 패키지에서 호출이 가능 
			// static : 인스턴스화 하지 않고 사용 가능. 객체를 생성하지 않고 사용 가능
			
		//print 메소드 호출 (객체 생성 없이 바로 호출이 가능) 
		print();
		System.out.println("=====================");
		
		//twice (33);
		int ab = twice(33); // twice (int k)
		System.out.println(ab);
		
		System.out.println(twice(22));
		System.out.println("=====================");
		
		//sum  메소드 호출 
		double bc = sum(4 , 5.0);
		System.out.println(bc);
		
		System.out.println(sum ( 8 , 11.5));
		
		//sum2는 바로 호출시 오류가 발생 
		//double de = sum2(20,33.3);	//객체화 하지 않아서 오류 
		
		//sum2 메소드 호출 : 인스턴스 메소드 : 객체화 해야 사용 가능 
		InternalCallMethod p1 = new InternalCallMethod();
		double cd =p1.sum2(33, 44.4 );
		System.out.println(cd);
	}
	public static void print() {
		System.out.println("안녕 ");
	}
	// 정수를 인풋 받아 2배로 생성해서 리턴
	public static int twice(int k) {
		
		return k * 2;
}
	public static double sum ( int m, double n) {
		
		return m+ (int)n;
	}
	
	//static 키 없이 메소드 생성 : 인스턴스 메소드 (객체화 해야 호출이 가능)
	public double sum2 (int m , double n) {
		
		return m + n ; 
	}
}
