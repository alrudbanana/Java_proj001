package chapter04.ex01;

import java.util.Scanner;

public class Ex02_Answer {public static void main(String[] args) {
	
	
	int select ; //프로그램을 선택하는 
	
	int kor;
	int math;
	int eng;
	
	double avg ;
	
	int sum; 
	
	int a ;
	
	String aName;
	String bName;
	
	System.out.println("=====================");
	Scanner sc = new Scanner (System.in);
	System.out.println("1. 학점의 합계/평균 | 2.홀수/짝수 | 3. 같은 이름식별");
	System.out.println("=====================");
	System.out.println("위의 번호를 선택하세요.>>>>>>");
	
	
	select = sc .nextInt();
	
	if (select == 1) { 
		System.out.println("1번 선택");
		
		System.out.println("국어,수학,영어점수를 차례대로 입력하세요");
		kor = sc.nextInt();
		math = sc.nextInt();
		eng = sc.nextInt();
		
		int sum1 = kor + eng + math ;
		double avg1 = sum1 / 3.0 ;
		System.out.println("점수의 합계는 : " + sum1 + ", 평균값은 : "+  avg1 + "입니다."  );
	} else if (select == 2) {
		System.out.println("2번 선택");
		System.out.println("정수를 입력해주세요.");
		a = sc.nextInt();
		System.out.println((a % 2 == 0 ? "짝수입니다" : "홀수입니다."));
	} else if (select == 3) {
		System.out.println("3번선택");
		System.out.println("이름을 두개 입력해주세요");
		aName = sc.next();
		bName = sc.next();
		if (aName.equals(bName)) { //참조 변수 이므로 equals 사용해서 값 비교
			System.out.println("두 값은 동일합니다.");
		}else {
			System.out.println("두 값은 다릅니다.");
		}
		
	 } else {
		 System.out.println("잘 못 입력하셨습니다");
		 sc.close();
		 
	}  
 }
}	



