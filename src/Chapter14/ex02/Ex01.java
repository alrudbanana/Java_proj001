package Chapter14.ex02;

public class Ex01 {

	public static void main(String[] args) {
		// try ~ catch ~ finally 구문을 사용해서 예외 처리 
		
		//실행시 예외 발생
		
		int [] arr = new int[] {1,2,3,4};
		
		
		try {
			System.out.println(arr[5]);
			System.out.println("try블락의 코드");
		}catch(IndexOutOfBoundsException e){
			System.out.println("catch 블락 작동됨");
		}
		finally {// TODO: handle finally clause
			System.out.println("catch 블락 : 예외와 상관 없이 항상 작동됨");
		}
		
		System.out.println("프로그램 종료 ");
	}

}
