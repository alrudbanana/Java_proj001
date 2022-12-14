package chapter04.ex01;
public class If_Controll_Statement {

	public static void main(String[] args) {
		// IF 구문 사용하기 (
		//1. type1 	: if (조건) { 실행문 : 조건이 참 일때 실행; }
			// {} 을 생략이 가능한데, 
		int value1 = 5;
		if (value1 > 3) {
			//조건이 참일때 실행 block 
			System.out.println("실행1");
		}
		
			//조건이 거짓일때
			if (value1 < 3) {
				//조건이 참일때 실행 block 
				System.out.println("실행2");
		}
			System.out.println("=========={조건이 참일 경우 실행문}, {}생략 가능 ==============");
			//if 조건문에서 실행문이 1개일 경우만 {}생략이 가능 
			if (value1 < 3) 
				System.out.println("실행3"); //실행문 1개만 {} 가 생략되어서 처리 될 수 있다.
				System.out.println("실행4"); 
			System.out.println("==============================");
			
			//2. Type 2 : if (조건) { 조건이 참 일때 실행; } else { 조건이 거짓일때 실행; }
				//삼항 연산자로 변환이 가능 
			boolean bool1 = true;
			boolean bool2 = false;
			System.out.println("===========if를 사용해서 출력==========");
			
			if (bool1) {
				//조건이 참일때 실행
				System.out.println("참");
			}else {
				//조건이 거짓일때 실행
				System.out.println("거짓");
			}
			
			System.out.println((bool1) ? "참" : "거짓");
				
			//3. type3 : 조건이 여러개인 경우 : 
			// if (조건 1) {조건1이 참일때 실행 } else if (조건 2) { 조건 2가 참일때 실행 }
			//...else {조건에 존재하지 않을 경우 실행문}
			
			// 
			
			System.out.println("===========IF TYPE 3 ==============");
			int value3 = 85;
			if (value3 >= 90) {
				System.out.println("A학점");
			} else if (value3 >= 80) {
				System.out.println("B학점"); // if문을 빠져나온다. 실행 후 탈출
			} else if (value3 >= 70) {
				System.out.println("C학점");
			} else if (value3 >= 60) {
				System.out.println("D학점");
			}	else {
				//위의 조건이 모두 만족하지 않으면 실행 , 조건을 따로 달지 않아도 됨
				System.out.println("F학점");
			}
			
			System.out.println("======조건을 거꾸로 적용========");
			
			if (value3 >=70) { // 여기서 참, 이기 때문에 실행 후 탈출하게됨
				System.out.println("C학점");
			} else if (value3 >=80) {
				System.out.println("B학점");
			} else if (value3 >= 90) {
				System.out.println("A 학점");
			} else {
				System.out.println("F 학점");
			}
			System.out.println("========조건을 디테일하게 구성=========");
			if ( value3 >= 60 && value3 <70 ) {
				System.out.println(" D학점 ");
			}else if ( value3 >=70 && value3 <70 ) {
				System.out.println(" C학점 ");
			}else if ( value3 >= 80 && value3 <90 ) {
				System.out.println(" B학점 ");
			}else if ( value3 >= 90 && value3 <100 ) {
				System.out.println(" A 학점 ");
			}else if ( value3 >=0 && value3 <60 ) {
				System.out.println(" F학점 ");
			} else {
				System.out.println("정확한 점수가 아닙니다. 0 ~ 100 점 까지만 입력바람");
			}
			
	}
}


