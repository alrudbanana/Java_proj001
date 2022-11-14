package chapter04.ex03;

public class For_Statement03 {

	public static void main(String[] args) {
		// for문 내의 for 문 : 2중 for문 
		// for문을 사용해서 구구단 출력 
		
		//바깥 쪽 for 문 단을 출력하는 변수 
		for (int i = 1; i <10; i++) {
			//안쪽 for문 
			System.out.println(i + "단 출력 ");
			for (int j=1; j<10; j++) {
				System.out.println(i + "*"+ j + "=" + i * j);
			}
			System.out.println("==============");
		} 
	}

}
