package chapter07.ex05;

class student{
	//필드 선언 
	String stuName;			//학생이름 : 학생이름 없음
	int stuNo;				//학번 : 0
	String stuPhone;		//핸드폰 번호 : 000-0000-0000
	String stuAddr;			//주소 : 서울 
	int stuAge;				//나이 : 0
	double stuWeight;		//몸무게 : 0.0
	
	student(){	//기본 생성자에서 초기값을 할당
		stuName = "학생이름 없음";
		stuNo = 0;
		stuPhone = " 000-0000-0000";
		stuAddr = " 서울 ";
		stuAge = 0;
		stuWeight = 0.0;
	}
	student(String stuName){
		this();
		this.stuName = stuName;
	}
	student(String stuName, int stuNo){
		this(stuName);
		this.stuNo = stuNo;
	}
	student(String stuName, int stuNo, String phone){
		this(stuName,stuNo);
		this.stuPhone=phone;
	}
	student(String stuName, int stuNo, String phone,String stuAddr){
		this(stuName,stuNo,phone);
		this.stuAddr=stuAddr;
	}
	student(String stuName, int stuNo, String phone,String stuAddr, int age){
		this(stuName,stuNo,phone,stuAddr);
		this.stuAge=age;
	}
	student(String stuName, int stuNo, String phone, String stuAddr, int age, double weight){
		this(stuName,stuNo,phone,stuAddr,age);
		this.stuWeight=weight;
	}
	
	
	void print() {
		//필드의 내용을 출력
		System.out.println("학생 이름은 : " + stuName);
		System.out.println("학생 학번은 : " + stuNo);
		System.out.println("학생 핸드폰 번호는 : " + stuPhone);
		System.out.println("학생 주소는 : " + stuAddr);
		System.out.println("학생 나이는 : " + stuAge);
		System.out.println("학생 몸무게는 : " + stuWeight);
	}
	
}



public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		student st = new student();
		st.print();
		System.out.println("==============");
		
		student st1 = new student("이미경");
		st1.print();
		System.out.println("==============");
		
		student st2 = new student("이미경",20183350);
		st2.print();
		System.out.println("==============");
		
		student st3 = new student("이미경",20183350,"010-3039-9127");
		st3.print();
		System.out.println("==============");
		
		student st4 = new student("이미경",20183350,"010-3039-9127","서울");
		st4.print();
		System.out.println("==============");
		
		student st5 = new student("이미경",20183350,"010-3039-9127","서울",25);
		st5.print();
		System.out.println("==============");
		
		student st6 = new student("이미경",20183350,"010-3039-9127","서울",25,50.3);
		st6.print();
	}

}
