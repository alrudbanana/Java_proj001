package chapter04.ex05;

import java.util.Scanner;

public class Ex01 {
	
	public static void main(String[] args) {
		// <문제> do-while 문으로 무한 루프를 돌립니다. 
		// 스캐너에서 정수 1을 넣으면 "1. 평균 출력" 으로 출력 
		// 스캐너에서 정수 2을 넣으면 "2. 합계 출력" 으로 출력
		// 스캐너에서 정수 3을 넣으면 "3. 이름 출력" 으로 출력
		// 4번을 누르면 do-while문을 빠져나온 뒤 " 프로그램 종료 "
		Scanner sc = new Scanner (System.in);
		int a;
		
		do {
			System.out.println("==================================================");
			System.out.println("1. 평균출력 | 2. 합계출력 | 3. 이름 출력 | 4. 프로그램 종료");
			System.out.println("==================================================");
			System.out.println(" 위 번호를 입력하세요>> ");
			a =sc.nextInt();
			
			if (a ==1) {
				System.out.println("1. 평균출력");
			}else if (a==2) {
				System.out.println("2. 합계출력");
			}else if (a==3 ) {
				System.out.println("3. 이름출력");
			}else if (a==4) {
				System.out.println("4. 프로그램 종료");
				break;
			}else {
				System.out.println("잘못된 출력입니다.");
			}
		}while( true );
		
		System.out.println("do- while문을 빠져나왔습니다.");
		
		sc.close();
	}
			

	}
