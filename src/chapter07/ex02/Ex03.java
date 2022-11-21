package chapter07.ex02;

import java.util.Arrays;

public class Ex03 {

	public static void main(String[] args) {
		//1~500까지의 수 
		// 배열 a: 7의 배수를 저장하는 배열 
		int [] a = new int[500/7];
		
		// a 배열 각 방에 7의 배수 저장 
		for(int i = 0,j = 7; i <a.length; i++, j+=7) {
			a[i]=j;			//배열 a의 각 방에 7의 배수 저장
		}
		System.out.println(a.length);
		System.out.println(Arrays.toString(a));
		
		// 배열 b: 9의 배수를 저장하는 배열 
		int[] b = new int [500/9];
		for(int i = 0, j = 9; i <b.length; i ++, j+=9) {
			b[i]=j;
		}
		System.out.println(b.length);
		System.out.println(Arrays.toString(b));
		// 두 배열의 각 방의 값을 더해서 출력해라 
		
		System.out.println("ArraySum 출력 ");
		
		arraySum(a,b);
		

	}
	
	public static void arraySum (int[] a, int[] b) {
		int[]c = new int [71]; // c: 방의 값을 더해서 구하는 배열
		for(int i = 0 ; i < a.length;i++) { //a배열 0~70
			for(int j = 0; j < b.length;j++) { //b배열 
				
				if(i>54) {
					c[i] = a[i] + 0;
				}
				if(i==j) {
					c[i]= a[i]+b[j]; //방번호가 같을때 두 값을 더해 줘야함
				}
			}
		}
		System.out.println(Arrays.toString(c));
	}

}
