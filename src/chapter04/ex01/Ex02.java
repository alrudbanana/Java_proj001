package chapter04.ex01;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		// <스캐너에서 번호를 입력받아서 아래 내용을 작동 시키는 프로그램을 작성"
		// IF
		
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
			System.out.println("1. 점수의 합계와 평균값 내는것을 선택했습니다.");
			System.out.println("국어,수학,영어점수를 차례대로 입력하세요");
			kor = sc.nextInt();
			math = sc.nextInt();
			eng = sc.nextInt();
			System.out.println("점수의 합계 값은 : " + (sum = kor + math + eng) + " 평균값은 : "+ ( avg = sum / 3.0 )+ "입니다."  );
		} else if (select == 2) {
			System.out.println("2. 홀수/짝수 판별하는 프로그램입니다.");
			System.out.println("정수를 입력해주세요.");
			a = sc.nextInt();
			System.out.println((a % 2 == 0 ? "짝수입니다" : "홀수입니다."));
		} else if (select == 3) {
			System.out.println("3. 같은 이름인지 식별하는 프로그램입니다.");
			System.out.println("이름을 두개 입력해주세요");
			aName = sc.next();
			bName = sc.next();
			System.out.println (aName .equals(bName) ? "이름이 같습니다" : "이름이 다릅니다.");
			
		}
		
		sc.close();
		
		
	
	
	
	
	
	}

}
