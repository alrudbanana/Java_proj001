package chapter05.ex08;

import java.util.Arrays;

public class Argument_Of_MainMethod {

	public static void main(String[] args) {
		// Main Method로 배의 값 인풋하기 
		
		//1. args : main 메소드로 String [] 배열을 담은 [배열]변수, 1차원 배열 
		System.out.println(args.length); 	//args 배열의 방의 갯수 
		System.out.println();
		
		//2. args 배열 변수에 담긴 각 방의 값을 for 문을 사용해서 출력하기 
		
		System.out.println("=======for문을 사용해서 출력========");
		for ( int i = 0 ; i < args.length; i++) {
			System.out.print(args[i] + " ");
		}
		
		System.out.println();
		System.out.println("=== Enhanced For 문을 사용해서 출력 ===");
		for ( String k : args) { 
			System.out.print(k + " ");
		}
		System.out.println();
		System.out.println("=== Arrays.toString 문을 사용해서 출력 ===");
		System.out.println(Arrays.toString(args));
		
		System.out.println("============String타입을 갖는 정수===================");
		
		String a = args[0]; 
		String b = args[1];
		String c = args[2];
		String d = args[3];
		
		
		System.out.println(a + b + c + d); // a,b,c,d : 정수가 아니라 Stirng 
			//1234, 여기서 + < 는 문자열 연결 
		
		System.out.println("============================");
		//String 타입의 숫자를 정수로 변환해서 변수에 할당. 
		int e = Integer.parseInt(a); //String 타입의 숫자형 정수로 변환
		int f = Integer.parseInt(b);
		int g = Integer.parseInt(c);
		int h = Integer.parseInt(d);
		
		System.out.println(e + f + g + h); //1+2+3+4
		
	}

}
