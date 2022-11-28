package Chapter12.ex03;

	interface Animal1 {
		void cry();
	}
	
	interface Animal2 {
		void run();
	}
	
	interface Animal3 {
		void eat();
	}
	//interface extends Interface
	// 앞의 타입과 뒤의 타입이 동일할 때는 extends
	interface K extends Animal1,Animal2,Animal3 {
		
		
	}
	
	
	class G implements K {
		@Override
		public void cry() { }
		@Override
		public void eat() { }
		@Override
		public void run() { }
	}
	
	class Aa {		//일반 클래스 : 모든 메소드는 실행부가 존재해야한다.
		void abc() {System.out.println("Aa의 abc 메서드");}
	}
	
	abstract class Bb {		//추상 클래스 : 추상 메소드가 1개라도 존재하면 
		abstract  void bcd() ;
	}
	// extends키 다음에는 한개의 클래스만 올 수 있다. / 클래스는 하나의 부모만 가진
	//class Cc extends Aa, Bb {
	class Cc extends Bb implements Animal1, Animal2, Animal3{
		
		@Override
		public void cry() { }
		@Override
		public void eat() { }
		@Override
		public void run() { }
		@Override
		void bcd() { }
	}
	public class InterFace_Test2 {
	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
	
		}
	
	}
