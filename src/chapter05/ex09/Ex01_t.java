package chapter05.ex09;

public class Ex01_t {

	public static void main(String[] args) {
		/*
		 국어 영어 수학 과학 		국어 영어 수학 과학 		국어 영어 수학 과학 		국어 영어 수학 과학 
	홍길동 70  88 77  99	  이순신 80	68	87	79	 김똘똘	60  86  87  30   홍길순  77	56  80  99
	
	메인 메소드 args로 아래와 같은 값이 인풋 되었을 경우 <출력>과 같이 출력해보세요 
	홍길동 70  88 77  99	이순신 80	68	87	79 김똘똘	60  86  87  30  홍길순  77 56  80  99
	
	for문을 사용해서 출력하세요 
	<출력>
		 국어 영어 수학 과학 <합계> <평균>
		===========================
	홍길동 70	88	77	99
	이순신 80 68 87 79
	김똘똘 60	86	87	30
	홍길순 77 56 80 99
	================================
	합계
	평균 	
		 */
		
		
		System.out.println("= 1. args 배열로 들어오는 모든 내용 출력 =" );
		for(int i = 0 ; i < args.length;i++) {
			System.out.print(args[i] + " ");
		}
		System.out.println();
		System.out.println();
		
		//step2 : 기본 출력 
		System.out.println("	국어	영어	수학	과학	<합계>	<평균>");
		System.out.println("====================================================");
		
		//이름 점수 출력 
		for(int i = 0 ; i <args.length;i++) {
			
			if ( i %5 == 0) { //5로 나누었을때 0일때 개행 , 0이 아닐때 제외
				if(i !=0) {
					System.out.println();
				}
			}
			System.out.print(args[i]+"\t");

		System.out.println();
		System.out.println("====================================================");
		System.out.println("<합계> : ");
		System.out.println("<평균> : ");
		
		System.out.println();
		System.out.println();
		
		
		//for문 밖에서 출력문 입력하기 때문에 지역변수 x
		//각 학생의 점수에 대한 합계 및 평균
		int sum1 = 0;
		double avg1 = 1.0;
		
		//아래 과목의 점수에대한 합계 및 평균 
		
		int kor_sum = 0;
		int eng_sum = 0;
		int math_sum = 0;
		int sci_sum = 0;
		
		double korAvg;
		double engAvg = 1.0;
		double mathAvg = 1.0;
		double sciAvg = 1.0;
		
		//합계에 대한 합계 , 평균에 대한 평균 
		int allsum = 0;
		double allAvg;
		
		//합계 구하기 
		
		if (i % 5 == 0) {
			sum1 = 0; // sum을 초기화 
		}
			
		if(i % 5 != 0) {
			sum1 +=Integer.parseInt(args[i]);
		}
		
		//평균계산 
		if(i == 4 || i ==9 || i == 14 || i ==19) { //이 인덱스 번호에 왔을때 합을 구함 
			avg1 =sum1/4.0;
		}
		//출력
		System.out.print(args[i] + "\t");
		if(i==4 || i == 9 || i == 14 || i == 19) {
			System.out.print(sum1 + "\t"+avg1);
		}
		
	}

}
	
}
