package chapter10.ex03;

class Animal {
	void animalSound() {
		System.out.println("모든 동물은 소리내어 웁니다. ");
	}
}

class Tiger extends Animal  {
	@Override
	void animalSound() {
		System.out.println("호랑이는 어흥 하고 웁니다.");
	}
}

class Eagle extends Animal {
	@Override 
	void animalSound() {
		System.out.println("독수리는 끼이오 하고 웁니다.");
	}
}

class Lion extends Animal {
	@Override
	void animalSound() {
		System.out.println("사자는 어흥어흥하고 웁니당");
	}
}
public class Method_Overriding02 {

	public static void main(String[] args) {
		// 객체 생성 
		Animal t1 = new Tiger(); //t1, Animal 타입 (Animal, Tiger)
		Animal t2 = new Lion();	//t2 , Animal 타입 (Animal, Lion)
		Animal t3 = new Eagle(); //t3, Animal 타입 (Animal, Eagle)
		
		//메소드 오버라이딩 (상속관계일때만 사용)
		t1.animalSound(); 	//Animal의 animalsound 호출 시, Tiger의 animalSound 가 출력
		t2.animalSound(); 	//Lion 의 animalSound 가 출력
		t3.animalSound();	//Eagle의 animalSound가 출력 
		
		System.out.println("============================");
		
		//1.배열에 객체를 저장 
		
		//arr1에 Animal 객체를 저장함.
		Animal[] arr1 = new Animal[3];
		
		//arr1 배열의 각 방에 Animal 객체 저장 
		arr1[0] = t1; //Animal 집의 0방에 Lion
		arr1[1] = t2; //tiger
		arr1[2] = t3; // ealge
		
		//2. arr1 배열에 Animal 타입의 객체가 저장이 되어 있음.
			//배열의 각방의 값을 가지고 오기 
		Animal a1 = arr1[0];
		Animal a2 = arr1[1];
		Animal a3 = arr1[2];
			
		//3. Animal 타입의 객체를 추력 
		System.out.println("=============");
		a1.animalSound();
		a2.animalSound();
		a3.animalSound();

	}                                                                                                                                                                                                                             

}
