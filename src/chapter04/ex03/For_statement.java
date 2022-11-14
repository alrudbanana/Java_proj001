package chapter04.ex03;

public class For_statement {

	public static void main(String[] args) {
		//조건이 ture인 동안 실행 블락을 반복해서 처리, 
		//조건이 false 이면 FOR문을 빠져나온다.
		
		/* for (초기값 ; 조건; 증감식) { 
		 	실행 블락 ; //조건이 true 일 동안 반복, false이면 빠져나온다. 
		 
		 */
		// 1. FOR문의 기본 구조 (println)
		int a; //변수를 block 밖에서 선언 , 전역변수 main method내에서 사용가능 
		for (a=0; a < 3; a++) {
			System.out.println(a);
		} // 0,1,2
		
		//2.
		
		for(int b = 0; b <10; b+=2) { //변수 b는 지역 변수  : for block내에서만 사용 
			System.out.print(b + " ");}
		
		System.out.println("======================");
	
		// int a; 위에서 선언 한 전역변수이기 때문에 다시 선언 불가능 
		for (a=0; a<20; a+=3) {
			System.out.print(a);
		}
		System.out.println();
		System.out.println("======================");
		for (int b = 0; b < 20; b += 4) {
			System.out.print(b);
			
		}
		System.out.println();
		System.out.println("======================");
		
		// 초기값 100 부터 1씩 빼면서 조건 i > 0
		for (int i =100; i > 0 ; i--) {
			System.out.print(i + " ");
		}
	
		System.out.println();
		System.out.println("======================");
		
		//
		for (int i = 1000; i > 0; i-=3) {
			System.out.print(i + " ");
		}
		
		System.out.println();
		System.out.println("======================");
		//여러개의 변수를 초기식 및 증감식에서 처리 가능
		
		for(int i=0, j = 0; i<100; i++,j++) {
			System.out.println(i + "," + j);
		}
		System.out.println();
		System.out.println("======================");
		//<문제> : i * j = 1단 출력 (구구단)
		// 			1* 1 = 1 이런식 
		
		for (int i=1, j=1; j <=9; j++) {
			System.out.println(i + "*" + j + "=" + (i * j) );
			
			
		}
		}
	}


