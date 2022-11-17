package chapter05.ex09;

import java.util.Arrays;

public class String_Method {

	public static void main(String[] args) {
		//(객체형) String 클래스에서 사용되는 주요 메소드 (함수)
			//기본 자료형 : boolean,byte,short,int,long,float,double,char 		<=소문자
			//참조 자료형 : 배열 / 열거 / 객체 / 인터페이스 <=첫자가 모두 대문자
		
		//1. 문자열의 길이 (length())
		//[참조] 자료형	[참조] 변수
		String str1 = "Hello Java!";
		String str2 = "안녕하세요! 반갑습니다.";
		
		System.out.println(str1.length()); 	//글자의 갯수 : 11자 문자열의 길이 
		System.out.println(str2.length());	//13자
		
		//2. 문자열 검색 ( charAt(), indexOf(), lastIndexOf() )
		System.out.println(str1.charAt(1)); //1번 방의 문자를 출력 : e
		System.out.println(str2.charAt(1)); //1번 방의 문자를 출력 : 녕
		System.out.println("=======================");
			
			//indexOf(), lastIndexof() ; 문자 하나의 방 번호를 검색 
		System.out.println(str1.indexOf('a')); //문자 a가 저장된 방 번호를 출력 
		System.out.println(str1.indexOf('a'));
		System.out.println(str1.indexOf('a', 8)); //방번호 8번방 부터 검색 9출력 -->
		System.out.println(str1.lastIndexOf('a', 8)); //7 <--
		
		System.out.println("=========================");
			//문자열을 검색 해서 방번호를 출력 
		/*String str1 = "Hello Java!";
		String str2 = "안녕하세요! 반갑습니다.";
		*/
		System.out.println(str1.indexOf("Java")); 	//0
		System.out.println(str2.indexOf("하세요")); 	//2
		System.out.println(str1.lastIndexOf("ello")); //1
		
			//문자열 검색에 실패 시 : -1 
		System.out.println(str1.indexOf("bye"));
		
		
		//3. 문자열 변환 및 문자열 연결 : String.valueOf(), concat()
		//String.valueOf() : 기본 자료형을 문자열 자료형으로 변환
		
		//String str3 = 2.3; //오류발생 : 2.3(double형 Data를 String에 저장시 오류)
		String str3 = String.valueOf(2.3);
		System.out.println(str3);
		//String str4 = true ;
		String str4 = String.valueOf(true);
		System.out.println(str4);
		System.out.println("=========================");
		
		//concat() : + 연산자와 같이 문자열 , 문자열을 연결시키는 Method 
		String str5 = str3.concat(str4);
		String str6 = str3 + str4;
		System.out.println(str5);
		System.out.println(str6);
		
		//string.valueOf() + concat() ==> +
		//String str7 = "안녕" + 3; //안녕3 	3이 string 형으로 자동변환
		//String str8 = "안녕".concat(String.valueOf(3)); //내부적으로 작동됨 
		
		
		//4. 문자열 ==> byte[] (getBytes() )
		//	 문자열 ==> char[] (toCharArray() )
		
		String str10 = "Hello Java!";
		String str11 = "안녕하세요! 반갑습니다.";
		
			//getBytes(): 문자열을 1글자씩 잘라서 byte 배열에 저장 , 아스키 코드 
		byte[] arr1 = str10.getBytes();
		byte[] arr2 = str10.getBytes();
		
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		
		//toCharArray() :
		char[] arr3 = str10.toCharArray();
		char[] arr4 = str11.toCharArray();
		
		System.out.println(Arrays.toString(arr3));
		System.out.println(Arrays.toString(arr4));
		
		System.out.println(arr3[1]);
		
		//5. 대문자로 출력 : toUpperCase(), 소문자로 변환 : toLowerCase();
		System.out.println(str10.toLowerCase()); // 소문자변환 후 출력
		System.out.println(str10.toUpperCase()); // 대문자 
		System.out.println("=======================");
		
		//6. 문자열 수정 : replace ("수정할 원본", "수정할 내용");
		String str13 = "안녕 자바 world";
		
		System.out.println(str1.replace("Hello", "안녕"));
		System.out.println(str13.replace("world", "월드"));
		
		//substring (0,5) : 0번 방에 대해서 5번방까지만 출력 , 나머지 잘림
		System.out.println(str13.substring(0,5)); //0번~4번까지만 나옴
			//모든 프로그램에서 시작은 포함, 끝은 미포함 (=5번은 아니라는뜻)
		System.out.println(str13.substring(3,10));
		
		//split() : 특정 문자를 기준으로 잘라서 문자열 배열에 저장
		String[] strArray = "abc/dbf-ghi jkl".split("/|-| ");
		
		System.out.println(Arrays.toString(strArray));
		
		//trim() : 문자열 앞, 뒤의 공백을 제거하는 메소드 
		System.out.println("=======================");
		System.out.println("         abc            ".trim());
		
		//6. 문자열의 내용비교 ( equals(), equalsIgnorecase() )
		
			//equals() : Heap의 값을 비교 , 대문자 소문자 까지 체크
			//equalsIgnoreCase() : Heap의 값 비교, 대/소문자를 체크하지 않고 비교
		String str20 = new String("Java");
		String str21 = new String("Java");
		String str22 = new String("java");
	
		
		
		// == : Stack 메모리의 참조 주소 비교 
		System.out.println(str20 == str21); //전부 다 false
		System.out.println(str20 == str22);
		System.out.println(str21 == str22);
		System.out.println("=================");
		// equals() : 대소문자를 비교하면서 Heap의 값 비교
		System.out.println(str21.equals(str22)); //false
		System.out.println(str20.equals(str21)); //true
		System.out.println(str21.equalsIgnoreCase(str22)); //true . 대소문자 비교 안함 
	}

}
