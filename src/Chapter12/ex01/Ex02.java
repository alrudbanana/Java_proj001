package Chapter12.ex01;

abstract class Calc2 {
	abstract void add(int a, int b);
	abstract void diff(int a, int b);
	abstract void mul(int a, int b);
	abstract void div(int a, int b);
}

class Calc_Impl2 extends Calc2 {
	@Override
	void add(int a, int b) {
		System.out.println("더하기 : " + (a + b));
		
	}
	@Override
	void diff(int a, int b) {
		System.out.println("빼기 : " + (a - b));
		
	}
	@Override
	void div(int a, int b) {
		System.out.println("곱하기 : " + a * b);
		
	}
	@Override
	void mul(int a, int b) {
		System.out.println("나누기 : " + (double)a /(double) b);
		
	}
}

abstract class Cal3 {
	abstract void add(int a, int b);
	abstract void diff(int a, int b);
	abstract void mul(int a, int b);
	abstract void div(int a, int b);
}


public class Ex02 {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		
		Calc2 c2 = new Calc_Impl2 () ;
		c2.add(a, b);
		c2.diff(a, b);
		c2.div(a, b);
		c2.mul(a, b);
		
		System.out.println("============");
		
		
		Cal3 c3  = new Cal3 () {
		@Override
		void add(int a, int b) {
			System.out.println("더하기 : " + (a + b));
			
		}
		@Override
			void diff(int a, int b) {
			System.out.println("빼기 : " + (a - b));
				
			}
		@Override
			void div(int a, int b) {
			System.out.println("나누기 : " + a / b);
				
			}
		@Override
			void mul(int a, int b) {
			System.out.println("곱하기 : " + a * b);
				
			}
		};
		
		c3.add(a, b);
		c3.diff(a, b);
		c3.div(a, b);
		c3.div(a, b);
		
	}

}
