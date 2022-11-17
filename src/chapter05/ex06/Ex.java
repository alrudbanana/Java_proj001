package chapter05.ex06;

import java.util.Arrays;

public class Ex {

	public static void main(String[] args) {
		// 2차 정방형 배열 
		
		//1. 배열의 선언 
		int[][] arr1 = new int[5][100]; //5는 행의 갯수 100은 열의 갯수 
		
		System.out.println(arr1.length); // 5 , arr1.length
		System.out.println(arr1[0].length); // 100 열의 인덱스번호 , arr1[5].length
											// 0번 행의 열의 갯수 
		
		
		//2. 2차원 배열의 값 넣기 : 이중 for ( for -for ) 을 사용해서 값을 넣기
		//아래 for문은 행을 정의해줌	: i <==g
		
		int a = 0;
		for (int i = 0; i < arr1.length; i++ ) {
			// 안쪽 for문은 열을 정의 해줌 : j는 열의 인덱스 번호 
			for ( int j = 0 ; j < arr1[i].length;j++,a++) {
				arr1[i][j] = a + 1;
				
			}
		}
		
		//3. 배열의 값을 출력하기 (for - for)
		for ( int i = 0 ; i < arr1.length; i++) { // 행을 루프 
			for (int j =0; j < arr1[i].length; j++) {
				System.out.print(arr1[i][j]+ " ");
			}
			System.out.println();
		}
		 
		
		System.out.println("=========Enhanced For 문을 출력=========");
		//4. Enhanced For 문 사용해서 값 출력 
		for (int[] k : arr1) { //arr1 의 루프를 돌면서 행을 꺼내와서 k 변수에 할당
			for(int b : k) {	//일차원 배열의 각 방의 값을 끄집어 와서 b변수에 할당한다.
				System.out.print(b + " ");
			}
			System.out.println();
			System.out.println("==============");
		}
		//값을 밖에다 할 경우 1~400까지 100씩 나눠서 들어가는대 안에다 초기화 하니까 1~100까지만 늘어남 
		
		System.out.println("==========Arrays.toString()로 출력===========");
		//5. Arrays.toString() <==1차원 배열의 값을 출력 
			//arr1 : 2차원 배열, Arrays~는 일차원만 출력함. k변수에 int를 담은 것 
		for ( int []k : arr1) {
			System.out.println(Arrays.toString(k));
		}
		
		
	}

}
