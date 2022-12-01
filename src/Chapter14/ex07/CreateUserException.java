package Chapter14.ex07;

//1. 사용자 정의 실행예외 (Unchecked Exception, RunTime Exception)

class MyException extends Exception {		
	
	
	
	
	public MyException() {		//기본생성자 	
								//Exception 하위 클래스 : 일반예외 
		super();			
	}
	
	public MyException(String message) {			
		super(message);			
	}
}
class MyRTException extends Exception{
	
	
	
}
//사용자 정의 예외를 테스트 하는 클래스 
class A {
	//1.사용자 정의 예외 객체 생성 
	MyException me1 = new MyException() ;
	MyException me2 = new MyException("예외 메세지 : MyException") ;
	
	MyRTException mre1 = new MyRTException();
	MyRTException mre2 = new MyRTException("예외 메세지 : MyException");
	
	//예외 던지기 (throw) : 던진 시점에서 예외발생 
			//throws : 예외를 전가 
			//throw :예외를 발생시킴.
	//예외를 내가 직접 처리 : try ~ catch 
	
	void abc_1(int num) {
		try {
			if(num>70) {
				System.out.println("정상 작동");
			}else {
				throw me1; //예외를 강제로 발생시킴
			}
		} catch (MyException e) {
			System.out.println("사용자 정의 예외가 처리됨");
			System.out.println(e.getMessage());
		}
	}
	void bcd_1() {
		abc_1(65);
	}
	//2. 예외전가 
	void abc_2 (int num) {
		if(num>70) {
			System.out.println("정상작동");
		} else {
			//throw me1;	//예외를 강제로 발생시킴
			throw me2;
		}
	}
	
}

//2. 사용자 정의 실행예외 (Unchecked Exception, RunTime Exception)
	//RunTimeException 을 상속해서 실행예외를 만듬 

class MyRTException extends RuntimeException{
	public MyRTException () {
		super();
	}
}


public class CreateUserException {

	public static void main(String[] args) {
		// 

	}

}
