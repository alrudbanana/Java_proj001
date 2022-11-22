package chapter09.ex01;

public class A {
	
	public int a = 1; 
	protected int b = 2;
	int c = 3;
	private int d = 4; 

	
	public A () {}
	
	
	public void abc() {		//다른 패키지에서 접근 가능 
		System.out.println("public");
	}
		protected void bcd() { // 다른 패키지에서 접근 가능 , 딘 상속관계
			System.out.println("protected");
		}
		void cde() {  //default: 같은 패키지에서만 가능
			System.out.println("default");
		}
		//private void def() { 	//private: 같은 파일내에서만 접근 가능 
			//System.out.println("private");
		//}
	}


