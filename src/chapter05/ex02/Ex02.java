package chapter05.ex02;

public class Ex02 {

	public static void main(String[] args) {
		// <<문제>> arr1 배열 변수에 정수 1000개의 방을 생성 
		// for 문을 사용해서 각 방에 3의 배수 값을 저장 
		// for 문을 사용해서 각 방의 내용을 출력 
		
		
		int[] arr1 = new int[1000];
		for(int i = 1 ; i < 1000  ; i ++) {
			arr1[i] = i * 3 ;
		}
		for (int i = 1 ; i <1000 ; i ++) {
			System.out.println(arr1[i] + " ");
		}
		
	}

}
