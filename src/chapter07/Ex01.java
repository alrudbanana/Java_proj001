package chapter07;

class calc{
	
	
	//두 정수의 값을 받아서 더해서 값을 던져줌 
	int add (int a, int b) {
		System.out.print("두 정수의 합은: ");
		return a + b;
	}
	
	// 빼기 (diff)
	int diff (int a, int b) {
		System.out.print("두 정수를 뺀 값은 : ");
		return a - b;
	}
	
	
	// 곱하기 (mul)
	int mul (int a , int b) {
		System.out.print("두 정수를 곱한 값은 : " );
		return a * b;
	}
	// 나누기 (div) : (double)
	double div (double a , double b) {
		System.out.print("두 정수를 나눈 값은 : ");
		return a / b;
	}
	
	//면적 (Rec)(가로 : x , 세로 : y)
	double rec ( double x , double y) {
		System.out.print("면적의 값은 : " );
		return x * y ;
	}
}

public class Ex01 {

	public static void main(String[] args) {
		//
		calc c = new calc();
		
		System.out.println(c.add(10, 50));
		System.out.println(c.diff(10, 50));
		System.out.println(c.mul(40, 50));
		System.out.println(c.div(10, 50));
		System.out.println(c.rec(10, 50.8));
		
		/*/int add = c.add(1, 2);
		//System.out.println(add);
		
		int dif=c.diff(100, 1);
		System.out.println(dif);
		
		int mul = c.mul(2, 3);
		System.out.println(mul);
		
		double div= c.div(500, 7.50);
		System.out.println(div);
		double rec= c.rec(2.3, 4.8);
		System.out.println(rec);
		*/
		
		

	}

}
