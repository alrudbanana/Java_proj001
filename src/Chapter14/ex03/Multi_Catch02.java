package Chapter14.ex03;

public class Multi_Catch02 {

	public static void main(String[] args) {
		try {
			System.out.println(3 / 1); //실행예외 : ArithmeticException
			
			int[] arr = new int[] {1,2,3};//ArrayIndexOutOfBoundsException
			System.out.println(arr[2]);//NumberFormatException
			
			int num = Integer.parseInt("20A");
			
		}catch(Exception e){ //Exception : 모든 예외의 부모 
			System.out.println("모든 예외처리");
			
			//try 블락에서 어떤 예외가 발생되었는지 알 수 있도록 출력 
		System.out.println(e.getMessage());
		e.printStackTrace();
	}

}
}