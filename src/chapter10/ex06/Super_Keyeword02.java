package chapter10.ex06;

class Aa {
	void abc() {
		System.out.println(" Aa 클래스의 abc() ");
	}
}

class Bb extends Aa {
	@Override
	
	
	void abc() {
		System.out.println("Bb 클래스의 abc()");
	}
	void bcd() {
		super.abc(); //<= this abc() 명시안하면 this , super는 부모 
	}
}

public class Super_Keyeword02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
