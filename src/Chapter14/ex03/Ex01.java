package Chapter14.ex03;

public class Ex01 {

	public static void main(String[] args) {
			//3개의 예외를 하나의 try ~ catch블락에 넣고, 3개의 예외를 하나의 try ~ catch블락에 넣고, 
			//각각의 예외에 대해서 catch블락. 
			//3개의 예외를 한꺼번에 처리 
		
		//System.out.println(3 / 0);//ArithmeticException
		System.out.println("================1번째 방법=================");
		int[] arr = new int[] {1,2,3};
		//System.out.println(arr[5]); //ArrayIndexOutOfBoundsException
		//int num = Integer.parseInt("20A");
		
		//1.각각에 대해서 catch 
		try {
			System.out.println(3 / 0);
		}catch(ArithmeticException e){
			System.out.println("0으로 나눌 수 없습니다.");
		}
		try {
			System.out.println(arr[5]);
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("방이 없습니다.");
		}
		try {
			int num = Integer.parseInt("20A");
		}catch(NumberFormatException e){
			System.out.println("문자열을 숫자로 바꿀수 없습니다.");
		}
		
		
		System.out.println("================2번째 방법=================");
		try {
			System.out.println(3 / 0);
			System.out.println(arr[5]);
			int num = Integer.parseInt("20A");
		}catch(ArithmeticException e){
			System.out.println("0으로 나눌 수 없습니다.");
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("방이 없습니다.");
		}catch(NumberFormatException e){
			System.out.println("문자열을 숫자로 바꿀수 없습니다.");
		}
		
		System.out.println("================3번째 방법=================");
		try {
			System.out.println(3 / 0);
			System.out.println(arr[5]);
			int num = Integer.parseInt("20A");
		}catch(ArithmeticException | ArrayIndexOutOfBoundsException | NumberFormatException e){
			System.out.println("3가지 오류가 동시에 일어났습니다.");
			System.out.println(e.getMessage());//예외의 간단한 정보를 출력 
			e.printStackTrace(); //예외의 세부적인 정보 출력 
		}
	
	}

}
 