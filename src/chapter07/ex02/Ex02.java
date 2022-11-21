package chapter07.ex02;

import java.util.Arrays;

public class Ex02 {

public static void main(String[] args) {
	
	System.out.println("== 4의 배수 저장 후 출력 ==");
	int[] a = new int[300/4];
	for(int i = 0, j = 4; i < a.length; i++, j+=4) {
		a[i]=j;
	}
	//a배열의 값 출력
	System.out.println(a.length);
	for(int i  = 0; i<a.length;i++) {
		System.out.print(a[i]+ " ");
	}
	System.out.println();
	
	System.out.println("==5의 배수 저장 후 출력 ");
	int[]b = new int [300/5];
	for(int i = 0,  j = 5; i <b.length;i++,j+=5) {
		b[i]=j;
		System.out.print(b[i]+" ");
		
	}
	
	System.out.println();
	System.out.println("==arraysum 메소드 호출==");
	arraySum(a,b);
	
}
	public static void arraySum (int[]a, int[]b) {
		int[]c = new int [75];
		for(int i = 0; i<a.length;i++) {
			for(int j = 0 ; j < b.length; j++) {
				if(i>54) {
					
					c[i] = a[i] + 0;
				}
				if(i == j) {
					c[i]= a[i] + b[i];
				}
			}
		}
		
		System.out.println(Arrays.toString(c));
	}
}

