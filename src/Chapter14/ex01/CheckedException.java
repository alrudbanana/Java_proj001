package Chapter14.ex01;



class A {	// A객체를 복사, throws :예외를 전가함. 메소드를 호출하는 곳에서 예외를 처리하라
			//throws CloneNotSupportedException : 예외에 대한 전가 
	protected Object clone () throws CloneNotSupportedException{
		return super.clone();
	}
	
}

public class CheckedException {

	public static void main(String[] args) {
		// 예외(Exception) : 프로그램 작성시 문제가 발생이 되었을때, 프로그램이 종료되지 
		//않도록 처리
		
		// 1.일반 예외 (Checked Exception)
		// 2.실행 예외 (Unchecked Exception, RunTime Exception)

		
		//일반예외 : 컴파일 단계에서 예외처리 하라고 알려줌 
		//1. InterruptedException:인터럽트가 발생 했을때 예외처리 
//		Thread.sleep(1000);

		//2. ClassNotFoundException :클래스를 찾지 못했을때 발생하는 Exception
//		Class cls = Class.forName("Java.long.object");
		
		//3. IOException : Input, Output 시 발생되는 예외
		//객체의 참조 변수 선언 
//		InputStreamReader in = new InputStreamReader(System.in);
		//예외 발생 
//		in.read();
		
		//4.FileNotFounException : 파일을 찾을 수 없을때 발생되는 예외 
///		FileInputStream fis = new FileInputStream("test.txt");
		
		//5.CloneNotSupportException :
//		A a1 = new A();
//	A a2 = (A)a1.clone();	//a1객체를 복사해서 a2객체로 생성 
	}

}
