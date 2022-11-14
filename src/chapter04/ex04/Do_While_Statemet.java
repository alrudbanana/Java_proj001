package chapter04.ex04;

public class Do_While_Statemet {

	public static void main(String[] args) {
		// do ~ while 문 : 실행문을 조건과 상관없이 반드시 1번은 실행시킨다. 
		// while : 조건을 만족해야지만 실행 블락을 실행한다. 
		
		/* while문
		 초기식 
		 while (조건) {
		 실행블락 ;
		 증감식 ;
		 }
		 
		 */
		
		
		/* do while문 : 
		초기식;
		do { 
		 	실행블락 ;
		 	증감식;
	 	} while (조건) ;
		 */
		
		// 1. while 문 
		System.out.println("===============while문 ================");
		int a = 0;
		while (a < 0) { //조건이 false 이므로 실행 block 이 실행되지 않는다. 
			System.out.println(a + " ");
		}
		
		
		// 2. do while 문 
		System.out.println("== do while 문 ==");
		a = 0;
		do {
			System.out.println(a + " ");
		}while(a < 0);
		
		// 3. 반복횟수가 10번인 경우 while 문과 do while 문 
		
		System.out.println(" == while 문을 사용해서 10번 출력 ==");
		a = 0; 
		while ( a < 10 ) {
			System.out.print(a + " ");
			a++;
		}
		System.out.println();
		
		System.out.println(" == do while 문 사용해서 10번 출력 ==");
		a = 0;
		do {
			System.out.print( a + " ");
			a++;
		}while(a < 10);
		
		
		
		
		
		
		
	}

}
