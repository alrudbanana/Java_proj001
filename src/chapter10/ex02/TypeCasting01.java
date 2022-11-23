package chapter10.ex02;

class Animal {
	String name;
	int age;
	
	void eat() {
		System.out.println("모든 동물은 먹습니다. ");
	}
}
class Tiger extends Animal{
	String tigersound;
	void tigerEat() {
		System.out.println("호랑이는 고기를 먹습니다");
	}
}
class TigerChild extends Tiger{
	
	String tigerchildSound;
	void tigerchildEat() {
		System.out.println("새끼호랑이는 젖을 먹습니다");
	}
}
public class TypeCasting01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1. 업캐스팅 : Tiger (자식) 객체 ==> Animal (부모) 
		
		//업캐스팅 : 자식 객체를 생성해서 부모 타입으로 정의 , 자동으로 일어난ㅁ
		// a1: Tiger 필드, 메소드 + Animal 필드와 메소드도 포함 
		// Animal 의 필드와 메소드만 사용가능
		Animal a1 = new Tiger();    // Tiger 객체를 생성해서 Animal 타입으로 지정 
	
		//a1은 Animal 타입의 필드와 메소드만 사용이 가능 
		a1.name = " 호랑이 ";
		a1.age =10;
		System.out.println(a1.name);
		System.out.println(a1.age);
		
		a1.eat();
		
		System.out.println("========== 다운 캐스팅 ===========");
		//2. 다운 캐스팅 : Animal (부모 타입) --> Tiger (자식 타입), 수동으로 명시 
			//a1 : Tiger 필드, 메소드 + Animal 필드와 메소드도 포함
			//a1 : Animal 타입 --> t2(Tiger)타입으로 다운케스팅 
			Tiger t2 = (Tiger)a1;
			//t2는 Animal, Tiger 의 필드와 메소드를 모두 접근 가능 
			
			//Animal 의 필드와 메소드 
			t2.name = "호랑이";
			t2.age = 6;
			System.out.println(t2.name);
			System.out.println(t2.age);
			t2.eat();
			//tiger 의 필드와 메소드 
			t2.tigersound ="어흥";
			System.out.println(t2.tigersound);
			t2.tigerEat();
			System.out.println("==========================");
			
			//2. Tiger 타입으로 객체 생성 : Animal , tiger의 필드와 메소드 모두 접근 
			//t3 : Animal, Tiger 모두 내포
			Tiger t3 = new Tiger();
			
			//다운 캐스팅 : 실행 시 오류 발생, t3에는 TigerChild는 내포하고 있지 않기 때문에 
			//다운캐스팅 실행 시 오류 발생 
			System.out.println("= instanceof출력 =");
			System.out.println(t3 instanceof Animal);
			System.out.println(t3 instanceof Tiger);
			System.out.println(t3 instanceof TigerChild);
			
			//다운캐스팅 할때는 반드시 instanceof를 사용해야한다.
			if(t3 instanceof TigerChild) {
				TigerChild t4 = (TigerChild) t3;
			}
			System.out.println("==========");
			
			//1. 업캐스팅 
			//Animal 타입의 필드와 메소드만 접근이 가능 
			Animal a3 = new TigerChild();
			System.out.println(a3 instanceof Animal);
			System.out.println(a3 instanceof Tiger);
			System.out.println(a3 instanceof TigerChild);
			
			//a3 : Animal 의 필드와 메소드만 접근 
			a3.name ="호랑이";
			a3.age=7;
			a3.eat();
			
			//a3를 Tiger타입으로 다운 캐스팅 
			Tiger t5 =  null;		//블락 밖에서 캐스팅할 변수 선언 , 객체 초기화
			
			if(a3 instanceof Tiger) {
			t5 = (Tiger)a3;
			}
			t5.age = 10;
			System.out.println(t5.age);
			t5.name ="호랑이5";
			System.out.println(t5.name);
			
			t5.tigersound="어흥";
			System.out.println(t5.tigersound);
			
			//3. a3를 TigerChild로 다운캐스팅 
			TigerChild t6 =null;
			if(t3 instanceof TigerChild) {
				t6 = (TigerChild) t3;
			}
			
			//t6 : TigerChild 타입 ( Animal, TigerChild 의 필드와 메소드를 모두 접근이 가능)
			t6.age = 2;
			t6.tigersound = "어흥어흥";
			t6.tigerchildSound = "어흥";
			
			//t6(TigerChild) ---> Animal
			
			Animal t7 = t6; // t7 : Animal ,Tiger, Tigerchild
			Tiger t8 = t6; // t8 : Animal , Tiger 
	}

}
