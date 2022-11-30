package Chapter14.ex01;

	//부모클래스
//class B extends A {}	//자식클래스

public class UncheckedException {

	public static void main(String[] args) {
		//실행예외: 컴파일 단계에서 페크하지 않는다. 실행시 예외가 발생함 
			//Unchecked Exception, RunTimeException
		
		//1. ArithmeticExcetion : 정수를 0으로 나누었을때 발생하는 Exception
			//모든 프로그램에서 숫자를 0으로 나누면 오류 발생, 
		System.out.println(3/0);
		
		//2. ClassCastException : 다운 캐스팅 타입이 존재하지 않는 경우 발생 
		//A a = new A();	//부모 클래스를 객체화함 
		//B b = (B)a; //a객체는 B타입을 포함하지 않는다. 실행시 문제 발생 
		
		//3. ArrayIndexOfBoundException : 배열의 방 번호를 넘겼을때 발생하는 예외
		int[] arr = new int[] {1,2,3};
		System.out.println(arr[3]);
		
		//4. NumberformatException : 문자타입의 값을 정수(int),상수(double)변환예외
		//int num = Integer.parseInt("10!");
		//double num2 =Double.parseDouble("10.22!");
		
		//제일 많이 발생되는 예외
		//5.NullPointException: 잠조주소의 값이 null. 메소드를 호출하는 경우 
		//String str = null;
		//System.out.println(str.charAt(2)); //2번 방의 문자열로 출력 
		
	}

}
