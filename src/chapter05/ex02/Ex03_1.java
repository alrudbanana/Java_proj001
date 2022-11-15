package chapter05.ex02;

import java.util.Scanner;

public class Ex03_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("방의 갯수를 넣어주세요 . >>>>");
		int idx = sc.nextInt();// 방의 갯수를 지정받는 변수 
		
		int[] arr1 = new int [idx];//2의배수 저장 
		int[] arr2 = new int [idx]; //3의 배수 저장
		
		//arr1(2의 배수) , arr2(3의배수) 배열 변수에 값 저장 
		for ( int i = 0, j = 2 ; i<arr1.length;i++, j+=2) {
			arr1[i]=j;
		}
		for ( int i = 0, j = 3 ; i<arr2.length;i++,j+=3) {
			arr2[i]=j;
			}
		//출력 
		System.out.println("arr1출력");
		for (int k : arr1) {
			System.out.println(k + " ");
		}
		System.out.println();
		System.out.println("arr2출력");
		for (int i =0 ; i < arr2.length;i++) {
			System.out.println(arr2[i] +" ");
		}

}
}

