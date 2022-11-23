package chapter08.ex01;

import chapter08.ex02.Student;
import chapter07.* ; //주의 : 하위 패키지는 적용이 안된다.
import chapter07.ex01.*;
//다른 패키지에 존재하는 클래스는 import


public class Package {

	public static void main(String[] args) {
		// 클래스 외부 구성요소 
			//1.패키지 2.임포트 3. 외부클래스
		//1.패키지(Package) : 클래스를 조직화해서 관리하는 폴더 
			//한 패키지 내에 동일한 이름의 클래스는 올 수 없다. 
			//외부에서 클래스를 가지고 오는 경우 
		//2. 임포트 : 다른 패키지의 클래스를 사용하혀는 경우 
		//public : 다른 패키지에서 접근하려면, 클래스 이름, 필드명, 생성자명, 메소드명 앞
		
		//Student 클래스 객체의 생성: 다른 패키지에 존재하는 클래스
			//chapter08.ex02.Student
		//기본 생성자 호출 
		Student s1 = new Student ();
		s1.print();
		
		System.out.println("==============");
		//매개변수 4개인 생성자 호출 
		Student s2 =new Student("이미경","20183350",2,"서울");
		s2.print();
		
		System.out.println("==============");
		
		//car 클래스 import없이 전체의 이름으로 사용
		chapter08.ex02.Car car1 = new chapter08.ex02.Car();
		car1.print();
		
		System.out.println("==============");
		chapter08.ex02.Car car2 = new chapter08.ex02.Car("삼성","검정색",200);
		car2.print();
	
	}

}
