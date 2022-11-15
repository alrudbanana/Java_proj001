package chapter05.ex02;

public class Ex02_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = new int[1000];
		for(int i = 1 , j=3 ; i < 1000  ; i ++ ,j +=3) {
			arr1[i] = j;
		}
		for (int i = 0 ; i <1000 ; i ++) {
			System.out.println(arr1[i] + " ");
		}
	}

}
