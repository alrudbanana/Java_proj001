package chapter03.ex06;

public class ConditionalOperator {

	public static void main(String[] args) {
		// 3항 연산자  	: if ~ else
			// (조건) ? 참:거짓 ; (조건) 참이면 ? 뒤의 <<참>>을 실행 , (조건) 거짓이면 ? <<거짓>> 실행 
		
		int value1 = ( 3 > 5 ) ? 6 : 9; // (조건) 이 false이므로 9가 value1에 들어감 
		// 괄호안의 계산이 참이면, 6 / 거짓이면 9가 들어감
		System.out.println(value1); 	//9 
		
		
		int value2 = ( 3 < 5 ) ? 6 : 9; //조건이 true 이기 때문에 6이 value2에 들어감 
		System.out.println(value2); //6
		
		//<문제> 스캐너로 정수 값을 인풋 받고 인풋 받은 정수 값이 홀수 이면 
		//"홀수" 라고 출력하고 , 인풋 받은 값이 "짝수" 라고 출력
		
		
	
		//

	}

}
