package chapter05.ex09;

public class Ex01 {

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
	
	double avg =0.0;
	
	//이름 변수 String 저장
	String s = args[0]; String lee = args[1]; String kim = args[2]; String hong = args[3];
	System.out.print("\t"+"국어"+"\t"+"영어"+"\t"+"수학"+"\t"+"과학"+"\t"+"합계"+"\t"+"평균"+"\n");
	System.out.println("=============================================================");
	// 홍길동 점수 합계 평균 출력 
	System.out.print(s + "\t");
	for (int i = 4 ; i < 8 ;i++) {
		System.out.print(args[i]+"\t");
	}
	//홍길동 합계 
		int sum = 0;
		for(int i = 4 ; i < 8 ; i++) {
			
			sum += Integer.parseInt(args[i]);
		}
			System.out.print(sum+"\t");
	//홍길동 평균
		avg = sum/4.0;
		System.out.print(avg+"\n");

	// 이순신 점수 출력
	System.out.print(lee + "\t");
	for (int k = 8 ; k < 12 ;k++) {
		System.out.print(args[k]+ "\t");
	}
	//이순신 합계 
			int lsum = 0;
			for(int i = 8 ; i < 12 ; i++) {
				
				lsum += Integer.parseInt(args[i]);
			}
				System.out.print(lsum+"\t");
		//홍길동 평균
			avg = lsum/4.0;
			System.out.print(avg+"\n");
			
	//김똘똘 점수 출력
	System.out.print(kim+"\t");
	for(int i = 12; i <16 ; i++) {
		System.out.print(args[i]+"\t");
	}
	//김똘똘 합계 출력 
	int ksum =0;
	for (int i = 12 ; i <16 ; i++) {
		ksum +=Integer.parseInt(args[i]);
	}
	System.out.print(ksum+"\t");
	//김똘똘 평균 출력 
	avg = ksum/4.0;
	System.out.print(avg+"\n");
	
	
	//홍길순 이름 점수 출력 
	System.out.print(hong + "\t");
	for(int i = 16 ; i <20; i++) {
		System.out.print(args[i]+"\t");
	}
	//홍길순 합계
	int hsum=0;
	for(int i = 16 ;i <20; i++) {
		hsum +=Integer.parseInt(args[i]);
	}
	System.out.print(hsum+"\t");
	
	//홍길순 평균 
	avg = hsum/4.0;
	System.out.print(hsum/4.0+ "\n");
	
	System.out.print("=========================================================="+"\n");
	
	
	System.out.print("합계"+"\t");
	//국어 합계
	int korea = 0;
	for(int i=4;i<20;i+=4) {
		korea +=Integer.parseInt(args[i]);
	}
	System.out.print(korea+"\t");
	
	//영어 합계
	int eng = 0 ;
	for (int i = 5 ; i <20 ; i+=4) {
		eng +=Integer.parseInt(args[i]);
	}
	System.out.print(eng+"\t");
	
	//수학합계
	int math = 0;
	for(int i = 6; i <20 ; i+=4) {
		math +=Integer.parseInt(args[i]);
	}
	System.out.print( math +"\t");
	
	
	//과학 합계 
	int sci = 0 ;
	for (int i = 7 ; i<= 20 ; i+=4 ) {
		sci +=Integer.parseInt(args[i]);
	}
	System.out.print(sci + "\t");
	
	
	//합계
	int total = 0;
	total = korea + eng + sci + math;
	System.out.print(total+"\t");
	
	//총 평균
	int tAvg = total / 4 ;
	System.out.print(tAvg+"\n");
	
	System.out.print("평균"+"\t");
	//국어 평균
	double korea_sum = korea/4.0;
	System.out.print(korea_sum+"\t");
	//영어 평균
	double  eng_sum = eng/4.0;
	System.out.print(eng_sum+"\t");
	//수학평균
	double math_sum = math/4.0;
	System.out.print(math_sum+"\t");
	//과학 평균
	double sci_sum = sci/4.0;
	System.out.print(sci_sum+"\t");
	
	//합계의 평균 
	double t_total = total/4.0;
	System.out.print(t_total+"\t");
	
	//평균의 평균
	double t_ftotal = t_total/4.0;
	System.out.println(t_ftotal);
	}
	}
	

	


