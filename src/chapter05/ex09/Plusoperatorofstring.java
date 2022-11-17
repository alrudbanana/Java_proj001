package chapter05.ex09;

public class Plusoperatorofstring {

	public static void main(String[] args) {
		// + : 문자열일때 문자열을 연결 
		// + : 정수 일때는 + 연산자로 사용 
		
		//1. 문자열 + 문자열
		
		String str1 = "안녕" +  "하세요!" + " !";
		System.out.println(str1);
		
		String str2 = "반갑";
		str2 += "습니다"; // str2 = str2 + 습니다 
		str2 += "!";	// str2 = str2+ !
		System.out.println(str2);
		//변수안의 내용을 대량으로 처리할때 
		
		//2. 문자열 + 기본자료형연결(boolean, byte, short, int, long, float,double,char)
		String str3 = "안녕" + 1; //<- 문자열로 변경 
		String str4 = "안녕" + false;
			//기본 자료형을 String 자료형으로 변환 : String.valueOf(1) //
		String str5 = "안녕" + String.valueOf(1);
		String str6 = "안뇽" + "1";
		
		System.out.println(str3); //안녕1
		System.out.println(str4); //안녕false
		
		System.out.println("=================");
	
		
	}

}
