package Chapter16.ex02;

// 모든 객체는 Object를 상속하고 있다.
// 모든 객체는 Object 타입으로 모두 타입 변환 할 수 있다. 
	//object타입으로 저장된 객체를 가져와서 사용하기 위해서는 매번 다운캐스팅이 필요하다. 
// 모든 객체는 object타입으로 저장할 수 있고,매번 다운캐스팅이 필요하다.

class Apple  {String Apple= "애플";}
class Banana {String Banana= "바나나";}
class Pencil {String Pencil= "연필";}
class Orange {String Orange= "오렌지";}

	//제너릭 클래스 : 다양한 타입을 저장 할 수 있는 클래스 
	//클래스 이름 뒤 <T>
	//객체를 생성할때 <T> 들이는 타입을 지정해서 객체를 생성함. 
	// wrapper class: 기본 자료형을 객체형 자료형으로 만들것 
		// boolean  : Boolean, char: Chrater
		// byte : Byte, short,int : Integer, long : Long
		// float : Float, double : Double

class Goods{

	//Object는 자바의 모든 객체를 담을 수 있는 타입이다. 
	private Object object = new Object();
	//Object는 자바의 모든 객체를 담을 수 있는 타입이다.
	
	
	public Object getObject() {
		return object;
	}
	
	public void setObject(Object object) {	//** 인풋값이 주어지면 위로 값이 전달됨
		this.object = object;
	}

}


public class Using_Object {

	public static void main(String[] args) {
		//1. Goods를 사용해서 Apple객체를 저장 후 가져오기 
		Goods goods1 = new Goods();
		
		goods1.setObject(new Apple()); // <== goods1객체를 만들어서 Apple객체를 생성해 Setter주입
		
		//getter를 사용해서 가져올때는 다운캐스팅해서 가져와야한다.
		Object obj = goods1.getObject();//오브젝트 클래스타입으로 
		Apple app1 = (Apple)obj;	//apple로 다운캐스팅 
		Apple app2 = (Apple)goods1.getObject();
		System.out.println(app2.Apple);
		
		//2. Goods를 사용해서 pencil 객체를 저장후 가져오기 
		goods1.setObject(new Pencil());
		
		Object obj2 = goods1.getObject();
		Pencil pen1 = (Pencil)obj2;
		System.out.println(pen1.Pencil);
	
		//3.
		goods1.setObject(new Banana());
		Banana banana = (Banana)goods1.getObject();
		System.out.println(banana.Banana);
				
				
	}
}
