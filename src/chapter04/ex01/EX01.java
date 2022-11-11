package chapter04.ex01;

import java.util.Scanner;

public class EX01 {

	public static void main(String[] args) {
		// IF 문을 사용해서  (if..else if..else if..else)
		// 스캐너를 사용해서 가지고 있는 돈을 입금 받습니다. 
		// 변수의 값이 0 ~ 3000 입금: 걸어서 다녀라 
		// 3000 ~ 30000 : 지하철 타고 다닙니다. 
		// 30000~ 100000 : 택시를 타고 다녀라
		// 100000~ : 비행기를 타고 다녀라 
		Scanner ms = new Scanner (System.in);
		System.out.println(" 교통비를 입금하십시오! : ");
		
		int money = ms.nextInt();
		
		if ( money >= 0 && money <= 3000) {
			System.out.println("걸어 다녀라");
		} else if ( money >= 3001 && money <= 30000 ) {
			System.out.println("지하철 타고 다녀라");
		} else if ( money >= 30000 && money <= 100000) {
			System.out.println("택시타고 다녀라");
		} else {
			System.out.println("비행기 타고 다녀라");
		}
		
		
		ms.close();
}
		

}

