package chapter05.ex02;

import java.util.Arrays;

public class Array_Input_Output {

	public static void main(String[] args) {
		// 배열에 값을 넣고 , 출력 하기 
		
		System.out.println("========1. 직접 값을 넣고 출력하는것=========");
		//배열 변수 선언 및 방 크기 초기화 
		int arr1[] = new int[5];
		
		//직접 해당 방 번호에 값을 할당
		arr1[0] = 10;
		arr1[1] = 20;
		arr1[2] = 30;
		arr1[3] = 20;
		arr1[4] = 50;
		//직접 방의 번호를 출력
		
		System.out.println("====1. for 문을 사용해서 대량으로 값을 넣고 값을 출력하기===");
		// arr2 에 방을 100개 선언, For문을 사용해서 각 방에 1부터 시작 1씩 증가해서 
		int[] arr2 = new int [100]; //arr2의 배열 방을 100개 
		//for 문을 사용해서 값 할당하기 : i : index (방번호)
		for (int i = 0; i < 100; i++) { 	// i : 0,1,3,4...99
			 arr2[i] = i + 1; // 각 방의 값을 자동으로 넣는다.
		}
		
		// for문을 사용해서 넣은 값을 출력하기 
		for (int i = 0 ; i < 100; i++) {
			System.out.print(arr2[i] + " "  );
		}
		System.out.println();
		
		System.out.println("==== 3. Enhanced for 문 (향상된 For문) =====");
		// Enhanced For : 배열의 각 방의 값을 출력 할 때 쉽게 출력할 수 있다.
		// -0 ~ 마지막 방 까지 한꺼번에 출력 
		
		int[] arr3 = new int[100];
		
		// for 문을 사용해서 7의 배수만 저장 
		System.out.println("== for 문을 사용해서 출력 ");
		
		for ( int i = 0 , j = 7 ; i < 100 ; i++, j+=7) {
			arr3[i] = j ; 
		}
		// 각 방의 내용을 for 문을 사용해서 출력
		for (int i =0; i <100 ; i++)
			System.out.print(arr3[i] + " ");
		System.out.println();
		
		System.out.println("== 향상된 For문 : Enhanced For문 ==");
		
		for (int k : arr3) { 
			System.out.print(k + " ");
		}
		System.out.println();
		System.out.println("====  Arrays. toString(배열변수) ======");
		// Arrays.toString(arr3) : 배열 변수에 저장된 모든 값들을 출력 
			// Arrays : 객체
			// toString () : 메소드 (함수) 	
				// 메소드 : 객체 지향 언어에서 함수를 메소드 (method)라고 호칭한다.
		System.out.print(Arrays.toString(arr3)); // 배열변수의 내용을 다 출력해라 
		
		System.out.println("=============베열의 방의 갯수를 출력 메소드=========");
		System.out.println(arr1.length); // 배열 변수 다음 .length
										 // 방의 갯수 5개
		System.out.println(arr2.length);
		System.out.println(arr3.length);
		
		System.out.println("========================");
		for (int i = 0 ; i < arr3.length; i++) {
			System.out.print(arr3[i] + " ");
		}
		
	}

}
