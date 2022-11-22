package chapter07.ex05;

class Book {
	String tittle;	// 책의 제목을 넣는 변수 
	String author;	// 책의 저자를 넣는 변수 
	
	Book(){
		tittle = "책제목 없음";
		author = "작자미상";
		
	}
	
	Book(String tittle){
		this();
		this.tittle = tittle;
	}
	
	Book(String tittle, String author){
		this(tittle);
		this.author = author;
	}
	
	//필드의 값을 출력해주는 메소드
	void print() {
		System.out.println("책의 제목은 :" + tittle);
		System.out.println("책의 저자는 :" + author);
	}
}








public class Book_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//기본 생성자 
		Book book1 = new Book();
		book1.print();
		
		//매개변수 1개인 생성자 호출 
		Book book2 = new Book("콩쥐팥쥐");
		book2.print();
		
		//매개변수 2개인 생성자 호출 
		Book book3 = new Book("콩쥐","나");
		book3.print();
	}

}
