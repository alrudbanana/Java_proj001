package chapter07.ex03;


public class Ex01_1 {

	public static void main(String[] args) {
		// 가변길이 배열 문제 
			/*
			values[0] : 값이 정수 1~9이 들어올때 : 파워레벨 1~9입니다."
			values[1] : 값이 정수 1~9이 들어올때, : "스피드 레벨 1[9]입니다."	 	
			*/
		
		
		
		Array(10,4);
	}
	public static void Array (int...val) {
		if(val[0]>0 && val[0]<10) {
			System.out.printf("파워레벨 %d 입니다.",val[0]);
		}else { 
			System.out.println("잘못된 입력입니다.");
		}
		if(val[1]>0 && val[1]<10) {
			System.out.printf("스피드레벨 %d입니다.",val[1]);
		}else {
			System.out.println("잘못된입력입니다.");
		}
	}
}
