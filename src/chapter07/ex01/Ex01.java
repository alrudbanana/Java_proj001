package chapter07.ex01;

public class Ex01 {

		public static int sum (int a, int b, int c) {
			return a + b + c;
		}
		
		public static double sum2 ( double a1 , double a2 ,double a3) {
			return a1 + a2 + a3;
		}
		
		public String product(String name , String proNo, String price) { 
			//인스턴스 메소드 : Static 이 붙지있지 않는 메소드 , 객체화해서 호출이 가능 
			return name + proNo + price;
		}
	public static void main(String[] args) {
	
		// 객체 생성, 메소드 호출 : 메인 메소드에서 해야함 
		
		//sSum1, sSum2 객체 생성 없이 바로 호출 : static 메소드 
		//sum1 (3,4,5);
		
		int sSum = sum(10,20,30); //호출해서 sSum 변수에 담고 변수출력 
		System.out.println(sSum);
		
		double sSum2 = sum2 (10.23 , 15.23 , 64.75);
		System.out.println(sSum2);
		
		
		//객체화 
		Ex01 t1 = new Ex01() ; //객체화 안하면 오류 발생 
		String product2 = t1.product("도브" , "50개" , "5000원");
		System.out.println(product2);
				
		}
		
		
		
		
		
		
		
		
	

	//정수값 3개를 인풋 받아 더한값을 정수로 리턴하는 메소드 (static)
	
	//실수 3개를 인풋 받아 더한 값으로 실수로 리턴 하는 메소드 (Static) 
	
	//문자열을 연결해서 출력 하는 메소드 (인스턴스 메소드 : static을 사용하지 않는 메소드) 
		//"제품이름" , "제품 수량" ,"제품가격" 매개변수로 받아서 함 
	
}

