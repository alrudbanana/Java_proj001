package chapter07;
class  Student{
	
	//필드 선언 
	String stuName; //학생 이름
	int stuNum; //학번
	String stuAddr ; //학생의 주소 
	String stuPhone ; // 학생의 전화번호 
	double weight; // 학생의 몸무게를 저장 
	
	// 생성자 오버로딩 
	// 기본 생성자 , 매개변수 3개인 생성자 , 매개변수 5개인 생성자 
	Student ( ) {}
	
	//매개변수 3개 
	Student(String stuName, int stuNum, String stuAddr){
		this.stuName = stuName;
		this.stuNum =stuNum;
		this.stuAddr=stuAddr;
	}
	
	//매개변수 5개
	Student (String stuName , int stuNum , String stuAddr, String stuPhone, double Weight){
		this.stuName = stuName;
		this.stuNum = stuNum;
		this.stuAddr = stuAddr;
		this.stuPhone = stuPhone;
		this.weight = Weight;
	}
	//필드의 값을 출력하는 메소드 void print() { 필드의 값을 출력 }
	void print() {
		System.out.println("학생이름 : " + stuName);
		System.out.println("학번 : " + stuNum);
		System.out.println("학생의 주소 : " + stuAddr);
		System.out.println("학생의 전화번호 : " + stuPhone);
		System.out.println("학생의 몸무게 : " + weight);
	}
	
}
public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//기본 출력 
		Student stu = new Student();
		stu.print();
		System.out.println("===============");
		//3개 출력 
		Student stu2 = new Student("이미경",20183350,"성동구");
		stu2.print();
		System.out.println("===============");
		//5개 출력 
		Student stu3 = new Student("이미경",20183350,"강동구","010-6585-3550",64.53);
		stu3.print();
		System.out.println("===============");
	}

}
