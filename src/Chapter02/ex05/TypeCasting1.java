package Chapter02.ex05;

public class TypeCasting1 {

	public static void main(String[] args) {
		// 타입 변환 (캐스팅)
		// 1. 캐스팅 방법 1 
		
			//정수의 기본은 int 형으로 저장됨
		int value1 = (int) 5.3; //value1에는 정수 값만 넣을 수 있다. 
		long value2 = (long)10.0000344; // 정수만 넣읗수 있다.
		// long value2 = 10.0000344L; // 정수만 넣읗수 있다.
		
			//실수의 기본은 double형 
		float value3 = (float) 5.8;
		//float value3 = 5.8F;//
		double value4 = 10.50; //
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
		System.out.println(value4);
		
		System.out.println("================");
		
			//2.캐스팅 ( l, L   / 	f , F ) : long, float
				//long , float의 정의된 변수에 값을 할당 할 때 캐스팅 해서 넣어야한다.
				//정수 : int , 실수 : double
				// 
		long value5 = 10L ; //앞에다 캐스팅 할때 앞에(long)을 붙임 , 뒤에선 앞글자만
		long value6 = 20L ;
		
		float value7 = 5.8f;
		float value8 = 5.8F;
		System.out.println(value5);
		System.out.println(value6);
		System.out.println(value7);
		System.out.println(value8);
	}

}
