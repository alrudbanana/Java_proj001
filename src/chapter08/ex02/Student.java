package chapter08.ex02;

public class Student {		//public : 필드, 메소드, 생성자 이름앞에 다른 패키지에서 사용할려면 
	
	// 필드 선언 
			String stuName;
			String stuNo;
			int stuYear;
			String stuAdd;
			
	//생성자 , 인풋 받은 값을 필드에 저장 
			public Student() {}
			public Student( String stuName, String stuNo, int stuYear, String stuAdd){
				this.stuName = stuName;
				this.stuNo=stuNo;
				this.stuYear=stuYear;
				this.stuAdd=stuAdd;
			}
	// 메소드 선언 : 필드의 내용을 출력 
		public void print() {
				System.out.println("학생이름은 : "+ stuName);
				System.out.println("학번 : "+ stuNo);
				System.out.println("학년 : "+ stuYear);
				System.out.println("주소 : "+ stuAdd);
			}

	public static void main(String[] args) {
		
		
		

	}

}
