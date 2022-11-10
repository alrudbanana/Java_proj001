package Chapter02.ex07;

public class Operation_DataType {

	public static void main(String[] args) {
		// 같은 자료형 간의 연산 vs 다른 자료형 간의 연산 
		
		//1. 같은 자료형 간의 연산 
		int value1 = 3+5 ; //8
		double value2 = 8/5 ; //1.0 소숫점 이하의 자리는 x
		
		
		System.out.println(value1);
		System.out.println(value2);
		
		float data1 = 3.0f + 5.0f ;
		System.out.println(data1);
		
		double data2 = 8.0 / 5.0 ;
		System.out.println(data2); //1.6이 출력 
		
		double data3 = 8/5 ; // int/int = int(1)
		System.out.println(data3); //1.0
		
		double data4 = 8/5.0; // 정수의 8, double형으로 자동 업캐스팅 
		System.out.println(data4); // 1.6
		
		//주의 : 평균을 계산 할때 double
		
		System.out.println("============================");
		
		// 2. 다른 자료 형 간의 연산 (작은 자료형은 상위 자료형 으로 업캐스팅이 자동으로 일어나고 연산)
		
		// int data5 = 5 + 3.5; // 오류발생
		double data6 = 5 + 3.5;
		System.out.println(data6);
		
		int data7 = 5 + (int) 3.5;
		System.out.println(data7);
		int data8 = (int) (5 + 3.5);
		System.out.println(data8); // 
		
		double data9 = 5/2.0 ; // 정수 5가 double형으로 업캐스팅 되어서 연산 
		System.out.println(data9); 
		
		double data10 = 5/2; //정수 / 정수 이기 때문에 2만 정수로 가져오고 그 후에 double이 씌워지는 것 
		System.out.println(data10);
		
		System.out.println("=================");
		
		int data11 = 50;
		double data12 = 33.33;
		//업캐스팅 : data11 (int) ==> data11(double)
		System.out.println(data11 + data12); // int형 50이 double형으로 바뀌고 연산 
		//업캐스팅 : data11 (int) ==> data11(double)
		System.out.println(data11 / data12);
		//다운캐스팅 : data11 (int) ==> data11(int)
		System.out.println(data11 / (int) data12);
		
		System.out.println("===================");
		
		/* <문제> 
		// 국어 : 90, 수학 :88 , 영어 : 77 , 음악 : 90 , 과학 :99
		 * 각 과목의 점수를 int 의 변수를 만들어서 저장 후 합계 (Sum) ,평균(avg)값을 출력해라
		*/ 
		
		int a = 90 , b = 88 , c = 77 , d = 90 , e = 99 ;
		int sum = a + b + c + d + e;
		System.out.println(" 합계는 : " + sum);
		
		double avg= sum / 5.0 ;
		System.out.println(" 평균은 : " + avg);
		
		
				
		
	}

}
