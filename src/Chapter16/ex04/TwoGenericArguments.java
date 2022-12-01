package Chapter16.ex04;

//제너릭 클래스 : 타입변수가 2개인 제너릭 클래스 

class KeyValue<K,V>{
	private K key;
	private V value;

	
	//getter *(필드의 값을 호출), Setter *(필드의 값을 입력)
public K getKey() {
		return key;
	}



	public void setKey(K key) {
		this.key = key;
	}



	public V getValue() {
		return value;
	}



	public void setValue(V value) {
		this.value = value;
	}


}
public class TwoGenericArguments {

	public static void main(String[] args) {
		// 1. <String, Integer> 타입으로 KeyValue 객체 생성 
		KeyValue <String, Integer> kv1 = new KeyValue<> ();
				// 	k		V
		
		//setter를 사용해서 값 할당 
		kv1.setKey("사과");	//string
		kv1.setValue(1000);	//Integer
		
		//getter 를 사용해서 값 출력 
		String key1 = kv1.getKey();
		Integer val1 = kv1.getValue();
		
		System.out.println("key: "+ key1 + "value : "+ val1);
		
		System.out.println(kv1.getKey()+ " , "+kv1.getValue());
		
		System.out.println("============================");
		
		//2.<Integer, String>
		KeyValue <Integer,String> kv2 = new KeyValue<>();
		
		//setter를 사용해서 값을 입력 
		kv2.setKey(404);
		kv2.setValue("NotFound: 요청한 페이지를 찾지 못했습니다.");
		
		//getter를 사용해서 값 출력 
		System.out.println(kv2.getKey());
		System.out.println(kv2.getValue());
		
		System.out.println("============================");
		//3.<String, void> <==Void: 해당 필드를 사용하지 않음 : 주의 :  <<Void>>
		KeyValue<String, Void> kv3 = new KeyValue<>();
		kv3.setKey("키값만 사용");
		System.out.println(kv3.getKey());
		
	}

}

