package chapter03.ex04;

public class LogicalOperator {

	public static void main(String[] args) {
		// 논리연산자  vs 비트 연산자 
		// 1. 논리연산자 ( AND ( && ) , OR (||) , XOR( ^ ), NOT ( ! )N
		// << 쇼트 서킷이 발생함 , 결과가 이상하게 출력이 될수도 있음 >>
		 	// < 쇼트 서킷이 발생됨 : && , || >
		// 1-1 AND ( && ) 
			// true && true ==> true
			// false && true ==> false
			// true && false ==> false
			// false && false ==> false
		System.out.println( true && true ); //true
		System.out.println( true && false); //false
		System.out.println( false && true); //false
		System.out.println( false && false ); //false
		
		//1-2 OR ( || )
			// true || true ==>true
			// true || false ==> false
			// false || true ==> true
			// false || true ==> true
		System.out.println(true || true); // true
		System.out.println(true || false); // true
		System.out.println(false || true); // true
		System.out.println(false || false); // flase
		System.out.println("=========================");
		
		//1-3. XOR ( ^ ) : 두 앞뒤 값이 같을때, false / 다를때 true 
		System.out.println(true ^ true); //false 
		System.out.println(false ^ false); // false
		System.out.println(true ^ false); //true		
		System.out.println(false ^ true); //true
		System.out.println(false ^ (5 < 2)); //true, 5<2)의 값이 false를 도출하기 때문에 
		System.out.println( (10 > 20) ^ ( 30 > 20)); //true
		System.out.println("===========================");
		
		//1-4 NOT ( ! ) : True 일때 Not => flase, false  일때 Not => True
		System.out.println( ! true); //false
		System.out.println( ! false); //true
		System.out.println(false || (5 < 3)); // false
		System.out.println(false || ! (5 < 3)); // true
		System.out.println( ! false || ! (5 < 3)); // true
		System.out.println("===========================");
		
		//2. 비트 연산자로 논리 연산이 가능하다. <===쇼트 서킷이 발생하지 않도록 처리 
		//		AND ( & ) , OR ( | ) , XOR ( ^ ) , NOT ( ~ , 비트 연산시 NOT사용 불가 , 오류 발생  ) 
		System.out.println(true & true); // true
		System.out.println(true | false); //true
		System.out.println(true | (5<3)); //true 
		System.out.println(true ^ true); //false
		System.out.println( ! true ); // 논리연산 됨 false
		System.out.println("=================================");
		
		//3. 쇼트 서킷 : 논리 연산자에서 앞의 내용으로 뒤의 값의 유무없이 식별 가능 하면 뒤의 값은 처리 하지 않음.
		
		System.out.println( true && true ); 
			// AND 연산에서 앞에 true가 오면 쇼트 서킷이 발생되지 않는다. 뒤의 값을 반드시 확인 
		System.out.println( false && true ); //쇼트 서킷이 발생 , 뒤의 값이 앤드 연산자에선 불필요함으로 삭제
			// AND 연산자에서는 처음 값이 false가 오게되면 뒤의 값이 어떤 값이 오더라도 false
		System.out.println( true || false);// 쇼트 서킷이 발생됨
			// OR 연산에서 앞의 값이 true가 오면, 뒤에 어떤 값 상관없으므로 쇼트 서킷이 발생한다. 
		System.out.println( false || true); //쇼트 서킷이 발생되지 않음.
		System.out.println( true || true); //쇼트 서킷이 발생됨 
			//OR연산에서 처음 값이 true 이면 쇼트 서킷이 발생됨 
		
		System.out.println("===========AND연산에서 쇼트 서킷 발생 및 방지 ==============================");
		int value1 = 3;
		System.out.println(false && ++value1 > 6); //쇼트 서킷이 발생됨 , 쇼트서킷 발생으로 ++ 뒤의값을 싱행을 하지 않아서 3이 출력
		System.out.println(value1); //3
		
		int value2 = 3;
		System.out.println(false  & ++value2 > 6); //쇼트 서킷이 발생됨 , 쇼트서킷 발생으로 ++ 뒤의값을 싱행을 하지 않아서 3이 출력
		System.out.println(value2); //4
		
		System.out.println("===========OR연산에서 쇼트 서킷 발생 및 방지 ==============================");
		int value3 = 3;
		System.out.println(true || ++value3 > 6); //논리연산자 ( : ||)
		System.out.println(value3); //3
		
		int value4 = 3;
		System.out.println(true  | ++value4 > 6); //비트연산자( : |) 비트연산자는 쇼트 서킷이 발생하지 않음 
		System.out.println(value4); //4
		
		//XOR ( ^ ) : 논리연산 , 비트연산 <== 뒤의 값을 반드시 확인해야 결과를 알 수 있으므로 쇼트서킷이
			//발생되지 않는다.
			//앞 뒤가 같으면 false , 앞뒤가 다르면 true
		System.out.println( true ^ true); //false
		
		
		
		
		
	}

}
