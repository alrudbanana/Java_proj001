package chapter03.ex06;

import java.util.Scanner;

public class Ex02 {public static void main(String[] args) {
		// 문제2. 스캐너로 3,6,9의 배수이면 " 3,6,9 의 배수입니다" 아니라면 "3,6,9의 배수가 아닙니다"
	
		Scanner sc = new Scanner (System.in);
		
		
		System.out.println("정수를 입력하세요 : ");
		int x = sc.nextInt();
		
	System.out.println( x + "는" + ((x % 3 ==0 ||  x % 6 ==0||x % 9 ==0 ) ?  "3,6,9의 배수입니다" : "3,6,9 의 배수가 아닙니다."));
		
	
	
	
	
	sc.close();
	
}
	
	

}
