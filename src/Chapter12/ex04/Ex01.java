package Chapter12.ex04;
	//배열에 넣어서 오버라이딩된 메소드  출력

	//instanceof를 사용해서 객체 내부에 Cat, Tiger 타입이 존재하면 cry(), run()
	//instanceof를 사용해서 객체 내부에 Dog, Lion 타입이 존재하면 eat(), run()
	//instanceof를 사용해서 객체 내부에 Eagle타입이 존재하면 eat(), run(), cry()
	//Cat, tiger < == cry, run()
	//Dog, Lion <== run() , eat()
	//Eagle <== cry,run, eat()
	interface Animal {
		
	}

	interface Animal1 extends Animal {
		void cry();
	}
	interface Animal2 extends Animal {
		void run();
	}
	interface Animal3 extends Animal {
		void eat();
	}
	
	class Cat implements Animal1, Animal2{
		@Override
		public void cry() {
			System.out.println("야옹");
			
		}
		@Override
		public void run() {
			System.out.println("고양이는 달려용"); }
	}
	
	class Tiger implements Animal1,Animal2{
		@Override
		public void cry() {
			System.out.println("어흥");
			
		}
		@Override
		public void run() {
			System.out.println("호랑이는 달려요");
			
		}
	}

	class Dog implements Animal2,Animal3{
		@Override
		public void eat() {
			System.out.println("냠냠");
			
		}
		@Override
		public void run() {
			System.out.println("강아지는 달려요");
			
		}
	}
	
	class Lion implements Animal2,Animal3{
		@Override
		public void eat() {
			System.out.println("짭짭");
			
		}
		@Override
		public void run() {
			System.out.println("사자는 달려요");
			
		}
	}
	
	class Eagle implements Animal1,Animal2,Animal3{
		@Override
		public void cry() {
			System.out.println("끼오오");
			
		}
		@Override
		public void eat() {
			System.out.println("휘잉");
			
		}
		@Override
		public void run() {
			System.out.println("독수리는 날아요");
			
		}
	}
public class Ex01 {

	public static void main(String[] args) {
		//1.객체 생성 후 배열에 저장해야함 
		Animal a1 = new Cat();
		Animal a2 = new Tiger();
		Animal a3 = new Dog();
		Animal a4 = new Lion();
		Animal a5 = new Eagle();
		

		Animal[]arr = new Animal[] {a1,a2,a3,a4,a5};
		
		for(int i = 0 ; i < arr.length; i ++) {
			if(arr[i] instanceof Cat || arr[i]instanceof Tiger) {
				((Animal1)arr[i]).cry();
				((Animal2)arr[i]).run();
			}
		}
		for(int i = 0 ; i < arr.length; i ++) {
			if(arr[i] instanceof Dog || arr[i]instanceof Lion) {
				((Animal3)arr[i]).eat();
				((Animal2)arr[i]).run();
			}
		}
		for(int i = 0 ; i < arr.length; i ++) {
			if(arr[i] instanceof Eagle) {
				((Animal1)arr[i]).cry();
				((Animal2)arr[i]).run();
				((Animal3)arr[i]).eat();
				}
		}
		
		System.out.println("============================");
		if(arr[0] instanceof Cat) {
			Cat a=(Cat)arr[0];
			a.cry();
			a.run();
		}
		else{
			System.out.println("fail");
		}
		
		if(arr[1] instanceof Tiger) {
			Tiger t = (Tiger)arr[1];
			t.cry();
			t.run();
		}else {
			System.out.println("fail");
		}
		
		if (arr[2]instanceof Dog) {
			Dog d = (Dog)arr[2];
			d.eat();
			d.run();
		}else {
			System.out.println("fail");
		}
		if (arr[3]instanceof Lion) {
			Lion l = (Lion)arr[3];
			l.eat();
			l.run();
			
		}else {
			System.out.println("fail");
			
		}if (arr[4]instanceof Eagle) {
			Eagle e = (Eagle)arr[4];
			e.cry();
			e.run();
			e.eat();
		}else {
			System.out.println("fail");
		}
	}

}
