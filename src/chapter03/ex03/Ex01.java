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
	   
	   int a;
	   int b;
	   System.out.println("정수를 입력하세요: >>>");
	   a = number.nextInt();
	   System.out.println("2번째 정수를 입력하세요: >>>");
	   b = number.nextInt();
	   System.out.println ( a == b);
	  
	   	 // 참조 자료형 :aNAME.euals (bNAME) 
	   Scanner name_n = new Scanner (System.in);
	   String aName;
	   String bName;
	   System.out.println("이름을 입력하세요");
	   aName = name_n.next();
	   System.out.println("두번째 이름을 입력하세요");
	   bName = name_n.next();
	   System.out.println(aName .equals(bName));
}

}
