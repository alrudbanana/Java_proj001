package Chapter13.ex08;



//인터페이스를 사용해서 4가지 형태로 출력 
//1. Animal 을 구현한 Inner클래스를 생성후 출력 
//2. Animal 을 익명 클래스로 생성해서 출력 
//3. 객체 메소드의 인풋 매개 변수로 Animal 타입을 인풋 받아서 출력 : 참조 변수를 만들고 
//4. 객체 메소드의 인풋 매개 변수로 Animal 타입을 인풋 받아서 출력 : 참조변수 없이 



interface Animal {
	void cry();
	void fly();
}

class C {
	void bcd(Animal a3) {
		a3.cry();
		a3.fly();
	}
}
//1. Animal 을 구현한 Inner클래스를 생성후 출력 
class Cat {
	Animal a = new B();
	
	void abc() {
	a.cry();
	a.fly();
	}
		class B implements Animal{
			@Override
			public void cry() {
				System.out.println("야옹~");
				
			}
			
			@Override
			public void fly() {
				System.out.println("고양이는 빠르다.");
				
			}

		}
		
}



public class Ex01 {

	public static void main(String[] args) {
		//1번 inner class 생성 후 출력 
		Cat c = new Cat();
		c.abc();
		
		//2번 익명 클래스 
		Animal a1 = new Animal (){
			@Override
			public void cry() {
				System.out.println("야옹");
				
			}
			@Override
			public void fly() {
				System.out.println("고양이는 날라다닌다.");
				
			}
		};
		a1.cry();
		a1.fly();
		
		//3번
		C cc = new C();
		Animal a3 = new Animal() {
		@Override
		public void cry() {
			System.out.println("멍멍");
			
		}
		@Override
			public void fly() {
				System.out.println("고양이가 강아지처럼 달린다.");
				
			}
		
	};
	cc.bcd(a3);
	
	
	cc.bcd(new Animal() {
		@Override
		public void cry() {
			System.out.println("호랑이 어흥");
			
		}
		@Override
		public void fly() {
			System.out.println("고양이가 호랑이처럼 달린다.");
			
		}
	});
}
}