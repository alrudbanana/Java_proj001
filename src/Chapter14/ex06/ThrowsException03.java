package Chapter14.ex06;

//1. 사용자 정의 

class Aaaa  {
	void abc() throws ClassNotFoundException {
		bcd();
	}
	void bcd() throws ClassNotFoundException {
		cde();
	}
	void cde() throws ClassNotFoundException {
		//해당 클래스에 클래스가 존재하지 않는다. 일반예외
		Class cls2 = Class.forName("java.lang.Object2");
	}
	
}
public class ThrowsException03 {

	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub
		
		Aaaa a1 = new Aaaa();
		
		a1.abc();
		
		try {
			a1.abc();
		}catch(ClassNotFoundException e){
			//e.printStackTrace(); // => 오류가 아니라 Exception된걸 보여줌 
		}
		
	//Class cls = Class.forName("java.lang.Object");	//패키지 내의 클래스가 존재하므로 오류가 발생되지 않음 
	//Class cls2 = Class.forName("java.lang.Object2");	//패키지 내의 클래스가 존재하므로 오류가 발생되지 않음 
		
		
		
		
		System.out.println("프로그램 종료 ");
		
	}

}
