package chapter06;


class Man{
	
	
	//필드
	String name = "홍길동";
	int age = 30;
	String phone = "010-3039-9127";
	String addr = "서울시 종로구 인사동";
	double weight = 53.49;
	
	//기본 생성자는 생략됨 : A() {} 
	
	//메소드 : 
	void add1 () {
		//1~100까지의 2의 배수를 출력하고 더한 값을 출력
		int i ;
		int sum=0;
		for (i=2; i <= 100 ; i +=2) {
			if(i%2==0) {
				
			}
			
			System.out.print(i+" ");
				sum += i;	
			
			
				
			}
		System.out.println();
		System.out.println(sum);
			
		}
	
	
	void add2() {
		//1~500까지 3의 배수와 4의 배수를 출력하고 더한값 출력
		int i;
		int k;
		int sum = 0;
		for(i=3, k =4 ;i <= 500; i+=3 , k +=4) {
			if(i % 3 ==0 || k % 4 == 0) {
				System.out.print(i + " ");
			}
			
			sum = sum + i + k ;
		}
		System.out.println();
		System.out.println(sum);
	}
	
	void add3() {
		//1~1000까지 1씩 증가하고 4의 배수만 출력되지 않도록 하고 더한 값 출력
		int i;
		int sum = 0;
		for (i=1; i<1000; i++) {
			if(i % 4 != 0) {
				System.out.print(i + " ");
			}
			sum = sum + i ;
		}
		System.out.println();
		System.out.println(sum);
	}
	
	
	
}

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Man man = new Man();
		System.out.println(man.name);
		System.out.println(man.phone);
		System.out.println(man.age);
		System.out.println(man.addr);
		System.out.println(man.weight);
		man.add1();
		man.add2();
		man.add3();
	}

}
