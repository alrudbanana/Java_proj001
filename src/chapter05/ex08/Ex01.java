package chapter05.ex08;

public class Ex01 {

	public static void main(String[] args) {
		// <문제> 
		// 		args : 	합계 40 77 99 100 200 <- 변수를 던지고 
		
		//<< 출력>> 합계 : <정수를 더한 값을 출력> 
		
		String a = args[0];
		
		for(int i=0; i<args.length; i++) {
		
		}
		System.out.println();
		
		String b= args[1];
		String c = args[2];
		String d= args[3];
		String e = args[4];
		String f = args[5];
		
		System.out.println(a+b+c+d+e);

		int g = Integer.parseInt(b);
		int h = Integer.parseInt(c);
		int i = Integer.parseInt(d);
		int j = Integer.parseInt(e);
		int k= Integer.parseInt(f);
		
		System.out.print (a+ " : " + (g + h + i + j + k));
		System.out.println();
		/*String s = args[0]; //합계 
		int sum = 0 ; 
		for(int i = 1; i<args.length;i++) {
			sum += Integer.parseInt(args[i]);
		}
		System.out.println(s + ":");
		System.out.println(sum);
		
		*/
		System.out.println("===============");
		
		System.out.println("합계"+ 1 + 2 + 3); //합계 1 2 3 
		System.out.println();
		System.out.println(1+2+3+"합계");
	}

}
