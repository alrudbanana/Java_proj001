package chapter10.ex03;

class Fruit {			//Fruit의 메소드를 오버라이딩해서 출력.
						//자식 클래스 : Apple,Banana,Orange
	void Eat() {
		System.out.println("모든 과일은 맛이 있습니다.");
	}
}
		
		class Apple extends Fruit{
			@Override
			void Eat() {
				System.out.println("사과는 맛있습니다.");
			}
		}
		
		class Banana extends Fruit{
			@Override
			void Eat() {
				System.out.println("바나나는 맛있습니다.");
			}
			
		}
		
		class Orange extends Fruit{
			@Override
			void Eat() {
				System.out.println("오렌지는 맛있습니다.");
			}
			
		}
public class Ex01 {

	public static void main(String[] args) {
		Fruit f0 = new Fruit();
		Fruit f1 = new Apple();
		Fruit f2 = new Banana();
		Fruit f3 = new Orange();
		
		f0.Eat();
		f1.Eat();
		f2.Eat();
		f3.Eat();
		
		

	}

}
