package chapter04.ex04;

public class While_Statement {

	public static void main(String[] args) {
		// while문 : 반복문 , 조건이 true 동안 반복, 조건이 false 이면 실행 블락을 빠져나온다.  
		/*
		 	for(초기식; 조건 ; 증감식) {
		 		실행블락;
		 		}
		 */
		
		
		
		
		/*
		 초기 값 / while 문 밖에서 선언 
		 while (조건) {
		 	실행구문 ;
		 	증감식 ;
		 	}
		 	
		 */
		
		
		//1. while문의 기본 문법 구조 
		System.out.println("=========while문========");
		int a = 0;
		while (a <10 ) {
			System.out.print(a + " ");
			a++; //증감식을 처리하지 않으면 무한 루프
		}
		System.out.println( );
		//2. For문으로 변환 
		System.out.println("=========for문========");
		for (a = 0 ; a < 10; a++) {
			System.out.print(a + " ");
		}
		System.out.println();
		System.out.println("===========================");
		
		
		// while문 으로 vs for문으로 처리 ; 1 ~ 100 까지 처리 ;100 부터 1까지 2씩 감소 해서 출력 
		int b = 100 ; 
		while(b > 0) {
			System.out.print(b + " ");
			b-=2;
			}
		System.out.println();
		//for문 
		for (b=100; b>1; b-=2) {
			System.out.print(b +" ");
		}
		System.out.println();
		System.out.println("============while에서 무한루프===============");
		
		boolean ab = true;
		int d = 0; 		//기본 자료형은 반드시 초기값이 할당 되어 있어야 한다.
		while ( ab ) {
			System.out.println("무한루프" + d);
			
			if (d>100) {
				break;
			} d++;
			
			
		}
		
		System.out.println("while문 빠져나옴 ");
		
		
		
		
		
		
	}

}
