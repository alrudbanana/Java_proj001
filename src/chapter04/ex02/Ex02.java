package chapter04.ex02;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		
		
		
		//<문제> 스캐너로  1월 ~ 12월 까지 월을 입력받아서 해당 월의 일수를 출력해 주세요
		// 출력 : 1월은 31일 입니다
		// month 월 day 일
		Scanner sc = new Scanner (System.in);
		
		int month ;
		int day = 30;
		
		System.out.println("1월 ~ 12월 사이를 입력하시면 일수를 알려드립니다.");
		System.out.println("입력하세요 >>>>>");
		month = sc.nextInt();
		
	  switch (month){
			case 1, 3, 5, 7, 8, 10, 12  :
			System.out.println( month + "월은"+ (day+1) + "일 입니다.");
			break;
			case 4, 6, 9, 11 :
				System.out.println( month + "월은" + day + "일 입니다.");
			break;
			case 2 : 
				System.out.println( month + "월은" + (day-2) + "일 입니다.");
				break;
			default:
				System.out.println("잘 못입력했습니다.");
		sc.close();
		
		}
	  
	}

}
