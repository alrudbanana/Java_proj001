package chapter03.ex03;

import java.util.Scanner;

public class Ex01 { 
   public static void main(String[] args) {
	   //<실습문제>
	   // 정수 2개를 스캐너로 인풋 받고 두 값이 같으면 true, 다르면 false 출력
	   // 이름 2개를 스캐너로 인풋 받고 두 값이 같으면 True, 다르면 Fasle 출력
	   	 // 등가 연산자 사용. 
	   	 // 기본 자료형 : == 
	   Scanner number = new Scanner (System.in);
	   System.out.println("정수 2개, 이름 2개를 공백으로 구분해서 넣어주세요"); //선생님
	   int a;
	   int b;
	   String aName;
	   String bName;
	  
	   a = number.nextInt();
	   b = number.nextInt();
	   aName = number.next();
	   bName = number.next();
	   
	   //기본 자료형 값 비교 : == 
	   
	   System.out.println ( "두값이 같으면 true, 다르면 false : " + ( a == b));
	   System.out.println("두 이름이 같으면 true, 다르면 false: " +  aName.equals(bName));
	   
	  
	   	 // 참조 자료형 :aNAME.euals (bNAME) 
	   
	   number.close();
	   
}

}
