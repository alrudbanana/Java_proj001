package Chapter12.ex01;

abstract class Calc {	//사칙 연산을 계산 하는 계산기 클래스 
	abstract int add (int a, int b); //더하기 연산 
	abstract int diff (int a, int b); //빼기 연산
	abstract int mul (int a, int b); //곱하기 연산
	abstract double div (int a, int b); //나누기 연산
	
}

class Calc_Impl extends Calc {		//Calc 를 구현한 클래스 
	@Override //더하기 
	int add(int a, int b) {
		// TODO Auto-generated method stub
		return a + b ;
	}
	@Override
		int diff(int a, int b) {
			// TODO Auto-generated method stub
			return a - b ;
		}
	
	@Override
		int mul(int a, int b) {
			// TODO Auto-generated method stub
			return a * b ;
		}
	
	@Override
	double div(int a, int b) {
		
		return (double)a / b;
	}
	
}
abstract class Calculator {
	abstract int add (int a, int b); //더하기 연산 
	abstract int diff (int a, int b); //빼기 연산
	abstract int mul (int a, int b); //곱하기 연산
	abstract double div (int a, int b); //나누기 연산
}

public class Ex01 {

	public static void main(String[] args) {
	
		int a = 5;
		int b = 4;
		
		//1. 구현한 클래스의 메소드 호출부 출력 
		
		Calc cal = new Calc_Impl();
		
		System.out.println(cal.add(a, b));
		System.out.println(cal.diff(a, b));
		System.out.println(cal.div(a, b));
		System.out.println(cal.mul(a, b));
		
		System.out.println("=================");
		//2. 익명 클래스로 메소드 호출 후 출력 
		Calculator c1= new Calculator() {
			
			@Override
			int mul(int a, int b) {
				// TODO Auto-generated method stub
				return a + b;
			}
			
			@Override
			double div(int a, int b) {
				// TODO Auto-generated method stub
				return (double) a / b;
			}
			
			@Override
			int diff(int a, int b) {
				// TODO Auto-generated method stub
				return a - b ;
			}
			
			@Override
			int add(int a, int b) {
				// TODO Auto-generated method stub
				return a + b;
			}
		};
			c1.add(a, b);
			c1.diff(a, b);
			c1.div(a, b);
			c1.mul(a, b);
			System.out.println("============");
			System.out.println(c1.add(a, b));
			System.out.println(c1.diff(a, b));
			System.out.println(c1.div (a, b));
			System.out.println(c1.mul(a, b));
		
	}

}
