package chapter05.ex08;

public class Ex01_01 {

	public static void main(String[] args) {
		// 
		
		String s = args[0]; //합계 
		int sum = 0 ; 
		for(int i = 1; i<args.length;i++) {
			sum += Integer.parseInt(args[i]);
		}
		System.out.println(s + ":");
		System.out.println(sum);
		
		
		System.out.println("===============");
		
		
		
	}

}
