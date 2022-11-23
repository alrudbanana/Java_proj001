package chapter10.ex01;

class Animal {			//Animal 클래스를 상속 해서 Tiger, Eagle, Lion 를 생성 
							//자식 클래스에서는 필드 1 , 메소드 1 정의 
						//LionChild 클래스는 Lion 클래스를 상속해서 필드 1, 메소드1
	String name;
	int age;
	String color;
	
	void eat() {
		System.out.println("모든 동물은 먹습니다.");
	}
	void sleep() {
		System.out.println("모든 동물은 잠을 잡니다.");
	}
}

class  Tiger extends Animal{
	int weight;
	
	void type() {
		System.out.println("야생동물입니다.");
	}
}

class Eagle extends Animal{
	String fly;
	
	void fly_type () {
		System.out.println("날라다닙니다");
	}
}

class Lion extends Animal{
	int speed;
	
	void howspeed(){
		System.out.println("매우 빠릅니다");
	}
	
}

class LionChild extends Lion{
	int birth;
	
	void whenbirth () {
		System.out.println("태어났습니다.");
	}
}
public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("== Animal 출력 ==");
		Animal a = new Animal();
		a.name = "동물";
		a.age = 10;
		a.color = "색";
		System.out.print(a.name + " "+a.age +" "+ a.color);
		System.out.println();
		a.eat();
		a.sleep();
		System.out.println("===========================");
		
		System.out.println("== Tiger 출력 ==");
		Tiger t = new Tiger();
		t.name = "사자";
		t.age = 3;
		t.color = "갈색";
		t.weight = 50;
		System.out.print(" 이름은 "+t.name + " 나이는 "+ t.age + " 색은 "+t.color + " 몸무게는 "+ t.weight + "kg 입니다.");
		System.out.println();
		t.eat();
		t.sleep();
		t.type();
		
		System.out.println("===========================");
		
		System.out.println("== Eagle 출력 ==");
		Eagle e = new Eagle();
		e.name = "독수리";
		e.age = 10;
		e.color = "흰색";
		e.fly ="난다";
		System.out.print("이름은 "+e.name+" 나이는 "+e.age+" 색은 "+e.color+" 하늘에서 "+e.fly);
		System.out.println();
		e.eat();
		e.sleep();
		e.fly_type();
		System.out.println("===========================");
		
		System.out.println("== Lion 출력 ==");
		Lion l = new Lion ();
		l.name ="호랑이";
		l.age = 50;
		l.color = "줄무늬";
		l.speed = 500;
		System.out.print("이름은 "+l.name + " 나이는 "+l.age +" 색은 " +l.color + " 속도는 "+ l.speed);
		System.out.println();
		l.eat();
		l.sleep();
		l.howspeed();
		
		System.out.println("== LionChild 출력 ==");
		LionChild lc = new LionChild();
		lc.speed =5;
		lc.age = 0;
		lc.color = "흰색";
		lc.name = "호랑이 새끼";
		lc.birth = 10;
		System.out.print("이름은 "+lc.name + " 나이는 "+lc.age +" 색은 " +lc.color + " 속도는 "+" "+ lc.speed+" "+ lc.birth+"월 에 태어났습니다.");
		System.out.println();
		lc.eat();
		lc.sleep();
		lc.howspeed();
		lc.whenbirth();
	}

}
