package Chapter16.ex08;
//제너릭 메소드의 타입제한 

class A {
	//Number : Boolean,Charter를 제외한 정수, 실수를 처리함
		//Byte,Short,Integer,Long,Float,Double//
	
	public <T extends Number> void method1(T t) {
		//Object 클래스의 메소드외의 Number의 메소드를 사용가능함.
		System.out.println(t.intValue()); //intValue() : Number의 메소드 
	}
}

//인터페이스
interface Myinterface{
	void print(); 	//public abstract
}


class B {
	
	//T : MyInterface 하위의 구현 클래스가 올 수 있다. , 주의: 타입을 제한 할때는 extends를 사용  
	public <T extends Myinterface> void method1(T t) {
		t.print();
	}
}
public class BounddedTypedOfGenericMethod {

	public static void main(String[] args) {
		A a = new A();
		a.<Double>method1(10.11);
		a.method1(5.8); //Double
		a.<Integer>method1(100);
		a.method1(100);
		
		B b = new B();
		b.<Myinterface> method1(new Myinterface() {
			
			@Override
			public void print() {
				System.out.println("print() 구현됨");
				
			}
		});
		
		
		b.<Myinterface> method1(new Myinterface() {
			
			@Override
			public void print() {
				System.out.println("print() 구현됨 2");
				
			}
		});
	}

}
