package Chapter14.ex05;

//우리가 생성한 객체룰 자동으로 리소스 해제 하기 
		//Autocloseable 인터페이스를 구현해야한다.

class A implements AutoCloseable {
	String resouce;
	A (String resource){
		this.resouce = resource;
	}
	
	@Override
	public void close() throws Exception {	
		//close()메소드를 호출하는 곳에서 예외처리가 필요
		if (resouce != null) {
			resouce = null;
			System.out.println("리소스가 해제 되었습니다.");
		}
		
	}
}


public class TryWithResource03 {

	public static void main(String[] args) {
		//1. 리소스를 수동으로 제거하기 
		A a1 = null;
		
		try {
			a1 = new A ("문자열 입력");
			System.out.println(a1.resouce);
			System.out.println("=========================");
			
		}catch(Exception e) {
			System.out.println("예외발생");
			e.printStackTrace();
		}finally {
			
			//객체의 
			if(a1.resouce != null) {
				try {
					a1.close();
				} catch (Exception e) {
					
					e.printStackTrace();
				}
			}
			
		
		}

	}

}
