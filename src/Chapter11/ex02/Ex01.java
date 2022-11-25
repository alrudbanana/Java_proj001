package Chapter11.ex02;

class Student{
	//필드
	String name;
	
	Student() {}
	//합계와 평균을 출력하는 메소드 
	void sum_avg() {
		
	}
	@Override
	public String toString() {
		return "Student [name=" + name + "]";
	}
	
}

class Student_sub extends Student{
	//자식 필드 
	int kor;
	int eng;
	int math;
	
	int sum;
	double avg;
	

	//이름 과목 생성자 ,합계와 평균 계산 변수까지 
	Student_sub (String name, int kor, int eng, int math){
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math =math;
		this.sum = kor + eng + math;
		this.avg = this.sum / 3.0 ;
	}
	
	//과목별 생성자 (국어)
	Student_sub (int kor){
		this.kor = kor;
	}
	
	//부모의 sum_avg() 메소드를 오버라이딩해서 객체의 kor, eng, math의  합계와 평균을 출력하는 메소드 
	
	@Override
	void sum_avg() {
		System.out.println(name+ " : " + kor + " " + eng +" "+ math);
		System.out.println(name + "의"+ " 총 과목 합계는 : " + sum + " 평균은 : " + avg);
	
	}

	@Override
	public String toString() {
		return "Student_sub [name="+name+ ", kor=" + kor + ", eng=" + eng + ", math=" + math + ", sum=" + sum + ", avg=" + avg + "]";
	}
	
	
}

public class Ex01 {

	public static void main(String[] args) {
		//상속, 업캐스팅,다운캐스팅,객체를 배열에 넣어서 배열에 저장된 값을 출력 
		//생성자를 사용해서 객체 생성 시 필드의 값을 할당하고  
	/*홍길동 70 88 77 
	이순신 80 68 87 
	김똘똘 60 86 87 
	홍길순 60 86 87
	강감찬 55 66 77
	
	Student 배열변수 arr 변수에 모든 객체를 저장해서 (업캐스팅)
	 
	배열의 값을 for문으로 출력할 때 
	오버라이딩된 메소드 출력 < 각각 학생의 총 과목의 합계, 평균 >
	
	5명의 학생의 국어에 대한 합계와 평균(다운캐스팅)
	5명 학생의 각 과목별로 합계와 평균  (다운캐스팅)
	*/
		
		Student_sub s1 = new Student_sub("홍길동",70,88,77);
		s1.sum_avg();
		Student_sub s2 = new Student_sub("이순신",70,68,87);
		s2.sum_avg();
		Student_sub s3 = new Student_sub("김똘똘",60,86,87);
		s3.sum_avg();
		Student_sub s4 = new Student_sub("홍길순",77,56,80);
		s4.sum_avg();
		Student_sub s5 = new Student_sub("강감찬",55,66,77);
		s5.sum_avg();
		
		System.out.println("==================================");
		
		//arr[0]=s1;
		Student[] arr= new Student[] {new Student_sub("홍길동",70,88,77),new Student_sub("이순신",80, 68, 87),new Student_sub("김똘똘", 60, 86, 87 ), new Student_sub("홍길순", 77, 56, 80), new Student_sub("강감찬",55,66,77)};
		
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
		
		//학생별 국어 평균 
		int kor_sum =0, eng_sum =0, math_sum = 0;
		double kor_average,eng_average,math_average;
		
		for(Student a :arr) {
			Student_sub b=(Student_sub)a;
			kor_sum +=b.kor;
			eng_sum +=b.eng;
			math_sum +=b.math;
			
		}
		
		kor_average=kor_sum/5.0;
		eng_average=eng_sum/5.0;
		math_average=math_sum/5.0;
		
		//과목별 합계, 평균 출력 
		System.out.printf("5명의 국어 점수 합계 = %d, 평균 = %.1f\n",kor_sum,kor_average);
		System.out.printf("5명의 영어 점수 합계 = %d, 평균 = %.1f\n",eng_sum,eng_average);
		System.out.printf("5명의 수학 점수 합계 = %d, 평균 = %.1f\n",math_sum,math_average);
	
		
		
	}

}
