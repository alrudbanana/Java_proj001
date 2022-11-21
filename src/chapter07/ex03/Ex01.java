package chapter07.ex03;

import java.util.Arrays;

public class Ex01 {

	public static void main(String[] args) {
		// 가변길이 배열 문제 
		/*
		 	values[0] : 값이 정수 1~9이 들어올때 : 파워레벨 1~9입니다."
		 	values[1] : 값이 정수 1~9이 들어올때, : "스피드 레벨 1[9]입니다."
		 	
		 */
	
		
		arrayFlexible(5,8);
	}
	public static void arrayFlexible ( int...values) {
			if(values[0] > 0 && values[0] <10) {
				System.out.printf("파워레벨 %d입니다.", values[0]);
			}else {
				System.out.println("잘못된 입력입니다 1~9 사이의 값만 넣으세요");
			}
			if(values[1] > 0 && values[1]<10) {
				System.out.printf("스피드 레벨 %d입니다.",values[1]);
			}else {
				System.out.println("잘못된 입력입니다 1~9 사이의 값만 넣으세요");
			}
		System.out.println(Arrays.toString(values));
	}
}
