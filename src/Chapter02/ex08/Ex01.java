package Chapter02.ex08;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		// <문제> 스캐너를 등록 하고 , 
		// 	 어머님이름,아버님이름,형제이름 ,자신이름 <String sc.next();
		// 어머니나이, 아버님 나이, 형제 나이, 자신나이 <sc.nextint();
		
		//콘솔에서 인풋받은 이름은 모두 출력 
		//나이의 합계와 평균을 출력 

		Scanner sc = new Scanner (System.in);
		
		String mom, fat, bro, me;
		int mom_n, fat_n, bro_n, me_n;
		
		System.out.println("어머님의 이름을 입력하세요. >>>");
		mom = sc.next();
		System.out.println("어머니의 나이를 입력하세요. >>>");
		mom_n = sc.nextInt();
		
		System.out.println("아버님의 이름을 입력하세요. >>>");
		fat = sc.next();
		System.out.println("아버님의 나이를 입력하세요. >>>");
		fat_n = sc.nextInt();
		
		System.out.println("동생의 이름을 입력하세요. >>>");
		bro = sc.next();
		System.out.println("동생의 나이를 입력하세요. >>>");
		bro_n = sc.nextInt();
		
		System.out.println("당신의 이름을 입력하세요. >>>");
		me = sc.next();
		System.out.println("당신의 나이를 입력하세요. >>>");
		me_n = sc.nextInt();
		
		System.out.println("당신의 가족의 이름은 "+ mom + fat + bro + me + "입니다.");
		
		int sum = mom_n + fat_n + bro_n + me_n;
		System.out.println("당신의 가족의 나이 합계는 " + sum + "입니다.");
		
	    double avg = sum / 4.0;
		System.out.println("당신의 가족의 나이 평균은 " + avg + "입니다.");
		
		
	}

}
