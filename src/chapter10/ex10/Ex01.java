package chapter10.ex10;



class C {
	String stuId;
	String name;
	int age;
	
	C () {}
	
	C(String stuId){
		this.stuId = stuId;
		
	}
	
	public boolean equals(Object obj) {
		if( this.stuId == ((C)obj).stuId ) {
			return true;
		}else {
			return false;
		}
	}
	
	

	//c1.equals(c2) // studentId필드를 재정의 해서, 같으면 true 틀리면 flase
	
	//생성자 , 기본생성자1, 생성자2
	
	//
	//toString 메소드 재정의 : 필드의 값을 출력, 객체 
	@Override
	public String toString() {
	return "C [stuId=" + stuId + ", name=" + name + ", age=" + age + "]";
}

}
public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C c = new C();
		C c1 = new C ("미경");
		C c2 = new C ("미경");
		
		System.out.println(c1 == c2); //false
		System.out.println(c1.equals(c2)); //true
		
		System.out.println(c);
		System.out.println(c.toString());
		
	}

}
