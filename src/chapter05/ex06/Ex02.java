package chapter05.ex06;

import java.util.Arrays;

public class Ex02 {

	public static void main(String[] args) {
		// <<문제>>
		/*
		 	2차원 배열의 변수 : arr1
		 	arr1[0] <=2의 배수만 지정 
		 	arr1[1] <=5의 배수만 지정
		 	arr1[2] <=3의 배수와 8의 배수를 저장 
		 	arr1[3] <=1부터 시작해서 1씩 증가하는데 7의 배수는 저장하지 않는다. 
		 	
		 	행의 갯수 : 4개
		 	열의 갯수: 100개 
		 	
		 	1.for문 , 2. Enhanced For문 3. Arrays.toString(
		 	
		 */
		
	int[][] arr1 = new int [4][100];
			
			for (int i = 0 ; i < arr1.length;i++) {
				for(int j = 0 ; j <arr1[i].length;j++) {
					if(i==0) {
						for (int a = 1; ; a ++) {
							if(a % 2 == 0) {
								arr1[i][j]=a;
								
							}
						
					}
				}
				}
			}
				
			System.out.println("====for 문을 사용해서 내용 출력 =====");
			for (int i = 0 ; i < arr1.length; i++) {
				for (int j = 0 ; j < arr1[i].length; j++) {
					System.out.print(arr1[i][j] + " ");
				
					
				
		}
	
		
			}
				}
			}
	

		




