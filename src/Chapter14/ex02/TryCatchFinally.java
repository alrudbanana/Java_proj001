package Chapter14.ex02;

public class TryCatchFinally {

	public static void main(String[] args) {
		/* 예외를 처리하는 방법 
		 * 1. 자신이 직접 예외를 처리 : try catch finally를 사용해서 처리
		 * 2. 예외를 전가 : throws, 메소드 뒤에 예외 객체
		 * 			//메소드를 호출하는 곳에서 에외를 처리 
		 * 
		 */
		
		//1. try ~ catch 
		try {
			System.out.println(3/0);
		} catch (ArithmeticException e) {
			//try블락에서 ArithmeticException 이 발생이 되었을때 작동 
			
			System.out.println("try블락에서 오류가 발생되었습니다.");
		}
		System.out.println("=======try ~ catch ~ finally========");
		
		//2. try ~ catch ~ finally
				//finally 블락은 오류와 상관없이 실행되는 블락
		try {
			System.out.println(3/0);
			System.out.println("try블락에 생성된 구문");
		}catch(ArithmeticException e) {	// try에서 발생되는 Exception
			//try블락에서 Exception이 발생이 되었을때 실행 
			System.out.println("숫자 0으로 나눌수 없습니다");
		} finally {
			//try블락에서 Exception 발생 유무와 상관없이 반드시 실행 
			System.out.println("finally 블락 : 반드시 실행되는 블락");
		}
		
		
		System.out.println("프로그램의 마지막 입니다.");
		
		
	}

}
