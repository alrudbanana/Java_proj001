package chapter04.ex03;

public class Ex03 {

	public static void main(String[] args) {
		/* <문제>  : 2중 For문을 사용해서 1단 ~ 9단 까지 출력 
		 * 1단
		 * 1*1=2 tap \t 1*2 =2 		/print 로 출력  
		 * 2단은 밑에
		 */
		
		//print () /t: 탭으로 구분 
		System.out.println("========print()============");
		for(int i = 1; i <10; i ++) {
			System.out.println(i+"단을 출력 :");
			
			for(int j = 1; j<10; j++ ) {
				System.out.print(i +"*"+ j + "=" + i * j + "\t"); 
				
			}
			System.out.println();
			System.out.print("\n");
		}

		
		
		//printf()를 사용해서 출력부분을 간결하게 처리 
		System.out.println("=========printf()===========");
		for(int i = 1; i <10; i ++) {
			System.out.println(i+"단을 출력 :");
			
			for(int j = 1; j<10; j++ ) {
				System.out.printf(" %d * %d = %d \t", i, j, i*j); 
				
			}
			System.out.println();
			System.out.print("\n");
		}

	}

}
	
		