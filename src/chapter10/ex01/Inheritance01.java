package chapter10.ex01;

class Human {	//부모 클래스 (super class) : 자식 클래스의 공통된 특징을 저장 (필드,메소드)
	//필드(속성)
	String name; // 사람 이름 
	int age; // 사람의 나이 
	
	//메소드 : 프로그래밍의 기능 구현 
	void eat() {
		System.out.println("모든 사람은 먹습니다.");
	}
	void sleep() {
		System.out.println("모든 사람은 잠을 잡니다.");
	}

}

//자식 클래스 : 부모 클래스의 모든 필드와 메소드를 물려받는다.
class Student extends Human {
	// Human : 부모 클래스 , Student : 자식 클래스 <== 부모클래스의 필드와 메소드를 물려 받는다.
	
	//1. 부모 클래스의 모든 필드와 메소드를 그대로 자식 클래스 내부에 들어와 있다.
	//2. 자식 클래스에서만 적용되는 필드와 메소드를 추가적으로 등록해서 사용
	
	int studentID;
	
	void goToSchool() {
		System.out.println("학생은 학교에 다닙니다.");
	}
}

class Professor extends Human{
	int professorID;
	void gotoTeacher() {
		System.out.println("교수님은 가르치러갑니당");
	}
}

class Student2 extends Student{
		//Student2 ==> Student ==> Human 
		//Human의 모든 필드와 메소드 상속
		//Student의 모든 필드와 메소드 상속 
	
	int student2ID;
	void student2() {
		System.out.println("학생 2 입니다.");
	}
}

class Worker extends Human{
	int workerID;
	
	void gotoWork() {
		System.out.println("근로자는 일을 하러 일터로 갑니다.");
	}
}
public class Inheritance01 {

	public static void main(String[] args) {
		// 상속  ( Inheritance) : 부모 클래스의 필드(속성)와 메소드(기능) 를 자식클래스에서 물려받아서 사용 
			//객체 지향 언어의 꽃 , 제일 증요 
			//중복된 코드를 방지 
			//다형서이 부모 클래스를 상속받아서 다양한 형태로 출력 
			// 배열이나 컬렉션에 부모 클래스 이름으로 (업캐스팅) 저장 해서 출력 

		//1. 학생 객체 생성  : 부모의 필드와 메소드 + 자식의 필드와 메소드 모두 사용 가능 
		Student s1 = new Student();
		
		//부모의 필드와 메소드 
			//필드 출력
		
		System.out.println(s1.age);
		System.out.println(s1.name);
		
			//메소드 출력
		s1.eat();
		s1.sleep();
		
		System.out.println("========== 자식의 필드와 메소드 출력  ==========");
		
		s1.name= "홍길동";
		s1.age = 30;
		
		//자식의 필드와 메소드 출력 
		System.out.println(s1.studentID);
		s1.goToSchool();
		
		System.out.println("========== Worker 클래스 객체 생성 ==========");
		Worker w1 = new Worker();
		w1.age=30;
		System.out.println(w1.age);
		System.out.println(w1.name);
		System.out.println(w1.name);
		
		
		System.out.println("==============Student 2--> Student --> Human===============");
		
		Student2 s2 = new Student2();
		
		//Human의 필드와 메소드 출력 
		s2.age =27;
		s2.name="신사임당";
		System.out.println(s2.age);
		System.out.println(s2.name);
		
		s2.eat();
		s2.sleep();
		System.out.println("====================");
		
		//Student 의 필드와 메소드 호출 
		s2.studentID = 1234;
		s2.goToSchool();
		System.out.println(s2.studentID);
		//Student2 의 필드와 메소드 호출 
		s2.student2ID=5678;
		
	}

}
