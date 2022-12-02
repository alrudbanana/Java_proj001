package Chapter17.ex01;
// 배열과 컬렉션의 차이점	
/*1. 동일한 타입을 저정 
2. 방의 크기가 고정: 빙의 크기가 수정이 불가능하다. (값을 선언한 뒤에는 값을 늘리거나 수정이 불가능하다.)
2. 컬렉션 :
1. 동일한 타입을 저장 
2. 제너릭 타입 , 객체를 생성시에 타입을 지정해서 저장.
3. 방의 크기가 고정되어 있지 않다.  자동으로 늘어가고 자동으로 줄어든다. 
4.
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayVSList {

	public static void main(String[] args) {
		//1.배열 (Array)
		String [] arr = new String[] {"가","나","다","라","마","바","사"};
			//배열 방의 크기 출력 
		System.out.println(arr.length);	//7
			//배열의 방의 값을 삭제 시, 자동으로 방의크기가 줄어들지 않는다. 비어있다.
		arr[2]=null;
		arr[5]=null;
			//배열의 값을 출력 
		System.out.println(Arrays.toString(arr));
		System.out.println("===============================");
		
		//2. 컬렉션 (List) <== arrayList
		
		//List : 인터페이스, 객체화 할수 없다. 타입으로는 지정이 가능하다 
			
		//ArrayList<>,Vector<>,LinkedList<> (구현클래스로 겍체화)
		List<String> aList = new ArrayList<>();
			
		//List: 방의 크기를 알려주는 메소드 : aList.size()
		System.out.println(aList.size());
		
		//List에 값넣기 .add() <= 메소드 
		aList.add("가"); aList.add("나");aList.add("다");aList.add("라");
		aList.add("마");aList.add("사");

		System.out.println(aList.size());//방의 크기를 알려줌 
		
		//방의 값을 출력하기 
		//모든 컬랙션은 객체 자체를 출력시 Object 클래스의 toString()이 재정의 되어있다.
		System.out.println(aList);
		System.out.println(aList.toString());
		
		//* 컬렉션의 값을 삭제 .remove()
		
		aList.remove("다");
		aList.remove("바");
		
		System.out.println(aList);
		//자동으로 뒤에있는 값을 앞으로 당겨오고 삭제된것을 확인 가능 
	}

}
