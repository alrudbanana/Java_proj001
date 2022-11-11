package chapter04.ex02;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		// <문제1> switch 문을 사용하여 프로그램 하세요.
		// 스캐너로 정수 1 을 입력받으면 "금메달입니다" 츨력 
		// 스캐너로 정수 2 를 입력받으면 "은메달입니다" 출력 
		// 스캐너로 정수 3 을 입력받으면 "동메달입니다" 출력
		// 그 외의 값을 인풋 받으면 "메달이 없습니다" 출력 
		
		//<문제2>
		//스캐너로 문자열 gold를 인풋 받으면 "금메달입니다" 출력 
					 //silver
		//스캐너는 한번만 사용한다 -!
		int medal; 
		
		Scanner sc = new Scanner (System.in);
		System.out.println("정수를 입력하세요.");
		medal = sc.nextInt();
		switch (medal) {
		case 1 :
			System.out.println("금메달입니다.");
			break;
		case 2:
			System.out.println("은메달입니다.");
			break;
		case 3:
			System.out.println("동메달입니다.");
			break;
		default:
			System.out.println("메달이 없습니다.");
		}
		
		System.out.println("=====================");
	
		
		String medal2;
		System.out.println("메달의 색을 영어 소문자로 입력하세요");
		medal2 = sc.next();
		switch(medal2) {
		case "gold" :
			System.out.println("금메달입니다.");
			break;
		case "silver" :
			System.out.println("은메달입니다.");
			break;
		case "bronze" : 
			System.out.println("동메달입니다.");
			break;
		default: 
			System.out.println("메달이 없습니다.");
			
		}
		
		sc.close();
		
		
		
		
		
		
		
	}

}
