package Chapter16.ex03;

//제너릭 클래스: 다양한 타입의 저장 할 수 있는 클래스 
class Apple { String apple = "애플";}
class pencil { String pencil = "연필";}
class Banana { String banana = "바나나";}

class Myclass<T>{
	private T t;
	
	public T get() {
		return t;
	}
	public void set(T t) {
		this.t = t;
	}
}
public class SingleGenericArgument {

	public static void main(String[] args) {
		//1. 제너릭 타입의 객체 생성하기 
		Myclass<Apple> app1  = new Myclass<Apple>();
		//Apple객체를 setter를 사용해서 주입 하고 값 가져오기
		app1.set(new Apple());
		//* app1에 apple을 가져와서 넣어줌 
		System.out.println(app1.get().apple);
		
		
		//Pencil 객체를 setter사용해서 주입하고 값 가져오기 
		// * Myclass의 t값이 pencil로 바뀜
		Myclass<pencil> pen1 = new Myclass<> ();
		pen1.set(new pencil());		//setter를 사용해서 Pencil 객체를 주입 
		System.out.println(pen1.get().pencil);	//getter를 사용해서 Pencil 필드를 가져옴 
		
		
		//Banana 객체를 setter로 주입하고 값 가져오기 
		Myclass<Banana> ba1 = new Myclass<>();
		ba1.set(new Banana());
		System.out.println(ba1.get().banana);
		
		System.out.println("==============================================");
		
		//String 값을 넣고 출력하기 
		Myclass<String> str1 = new Myclass<>();
		str1.set("안녕하세요");
		System.out.println(str1.get());
		
		//int 값을 넣고 출력하기 : Integer 객체 
		Myclass <Integer> int1 = new Myclass<>();
		int1.set(10);
		System.out.println(int1.get());
		
		//double 값을 넣고 출력하기 : Double객체 
		Myclass <Double> do1 = new Myclass <>();
		do1.set(10.11);
		System.out.println(do1.get());
	}

}
