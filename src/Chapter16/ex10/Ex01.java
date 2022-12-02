package Chapter16.ex10;

//제너릭 클래스 / 제너릭 메소드를 사용해서 두 점의 좌표 값으로 넓이를 구하는 프로그램 작성 

//점의 좌표를 처리하는 클래스 생성 . <제너릭 클래스> 
class Point < X , Y >{
	X x; 
	Y y;
	
	//생성자를 사용해서 t,v의 값을 입력 
	Point (){}	
	Point (X x, Y y){		//X : x좌표, Y : Y좌표
		this.x = x;
		this.y = y;
	}
	//getter만 생성 
	public X getX() {
		return x;
	}
	public Y getY() {
		return y;
	}
	
	
}

class GenericMethod {
	public static <X,Y> double makeRectangle(Point<X,Y> p1, Point<X,Y> p2) {
		// 두 점의 좌표를 받아서 넓이를 계산해서 리턴으로 돌려줌
		double left = ((Number)p1.getX()).doubleValue();
		double right = ((Number)p2.getX()).doubleValue();
		double top = ((Number)p1.getY()).doubleValue();
		double bottom = ((Number)p2.getY()).doubleValue();
		
		double width = right - left;
		double height = bottom - top;
		
		return width * height;
	}
	
}

	
//제너릭 메소드 : 일반 클래스 내부에 제너릭 메소드 

	//makeRectangle () 메소드를 호출시 


public class Ex01 {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 두 점의 좌표를 저장하는 p1 ,p2
		
		
		
		Point<Integer, Double> p1 = new Point<Integer, Double>(0, 0.0);
		Point<Integer, Double> p2 = new Point<>(10, 10.0);
		
		//makeRectangle (p1, p2)
		double rect = GenericMethod.<Integer, Double>makeRectangle(p1, p2);
		System.out.println("두 점으로 만들어진 사각형의 넓이는 " + rect + "입니다.");
		
	}
}

