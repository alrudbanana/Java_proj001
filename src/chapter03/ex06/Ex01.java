package chapter03.ex06;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//<문제> 스캐너로 정수 값을 인풋 받고 인풋 받은 정수 값이 홀수 이면 
				//"홀수" 라고 출력하고 , 인풋 받은 값이 "짝수" 라고 출력
		// 삼항 연산자를 사용해서 
		
		Scanner sc = new Scanner(System.in);
	
		
		
		System.out.println("숫자를 입력하세요! >>> :  ");
		
		int num = sc.nextInt();
		System.out.println(num + "(은)" + (num % 2 == 0 ? "짝수입니다" : "홀수입니다"));
		
		sc.close();
	}

}
