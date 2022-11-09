package Chapter02.ex02;

public class NamingVariable {

	public static void main(String[] args) {
		// 변수에는 값을 대입해서 변화되는 값을 할당 할 수 있다. 
		// 변수 이름 지정하기 
		// 변수명은 소문자로 시작(권고) ,  Class 이름은 대문자 (필수, 대문자로 넣지 않으면 오류가 발생한다.)
		// 변수명으로 한글을 사용할 수 있다 (권장하지 않는다.) 
		// 변수명으로 특수문자는 _, $ 만 사용이 가능하다. 
		// 변수명으로 숫자는 사용이 가능하나 변수명 첫자리부터 숫자가 오면 오류 발생
		// 변수명으로 자바에서 사용하는 예약어(Pakaage, class, public..... , )
		// 
		// 자료명     변수명
		boolean aBcD; //1. boolean 변수 선언
		aBcD = true; // boolean True or False 에 넣을 수 있다. 
		aBcD = false;
		// aBcD = 10; 		오류발생 		
		
		byte 가나다라; //1byte 의 데이터만 저장 
		short _abcd; // _ , $를 사용할 수 있다. 
		boolean $_abcd; //다른 특수문자는 사용할 수 없다. 
		// boolean %abcde; // _,$이외의 특수문자는 변수명으로 사용이 불가능
		// char 3abdc;
		char a3bcd;
		long abcd3;
		//double private ; // 자바에서 사용되는 예약어는 변수명으로 사용할 수 없다.
		//double int ; // 변수명으로 예약어는 올수 없다.
		
		//int my work; // 변수명으로 공백은 올 수 없다. 
		int mywork; // 변수명은 처음자는 소문자, 이어서 여러단어를 적용할때 첫자 대문자.
		String myclassName; //권장 사항
		
		//상수 : 값을 넣으면 그 값을 변화 하지 못하도록 설정 
			// 변수 자료형 앞에 final 키가 붙으면 상수
			// -상수명은 전체를 대문자로 지정 (권장)
		
		
		double PI = 3.141592 ; //변수 : PI 변수에 값을 변화 시켜 줄 수 있다. 
		
		System.out.println(PI);
		// PI = 3.141592 ; // 밑에서 수정시 오류 출력
		
		final double PI2 = 3.1415923 ;
		System.out.println(PI2);
		//PI2 = 123.456;
		final int My_DATA = 10; 
		final float my_data = 20;
		System.out.println(My_DATA);
		System.out.println(my_data);//권고사항 위배 
	
		
		
		
	}

}
