package chapter04.ex07;

public class Break_Control_Keyword {

	public static void main(String[] args) {
		// break  제어 키워드 : 제어문 (if(생략됨) , switch(명시해야됨), for, while, do while)
		// -제어문을 탈출 할때 사용됨
		//1. 단일 loop 에서 break 탈출 
		for ( int i = 0; i < 10 ; i ++) {
			System.out.println(i);
			break;
			//0
		}
		
		for ( int i = 0; i < 10 ; i ++) {
			if (i == 5) {  //if 조건을 사용해서 조건이 만족되었을때 탈출
			break;
	}
		}			//0, 1, 2, 3, 4, 5 
		
		System.out.println("========================");
		
		//2. 다중(이중) loop문에서 break 탈출 
		//case 1 : 하나의 반복문만 탈출하는 경우
			for(int i = 0; i < 5 ; i++) { // 0.1.2.3.4
				for(int j = 0 ; j <5 ; j++) { //0.1.2.3.4
					if ( j == 2) { //  안 쪽 for문만 빠져나온다. 
						break;
					}
					System.out.print(i + "," + j + " \t");//0,0/0 .1/0.2/0.3
				}
				System.out.println();
			}
			System.out.println("============LABEL을 사용해서 한번에 label 위치로 점프==============");
		//case 2 : 점프해서 한번에 바깥쪽의 for문을 탈출 (LABEL)
			pos1: for (int i = 0; i < 5 ; i++) {
				for(int j=0; j <5; j++) {
					if (j ==2 ) {
						break pos1;
					}
					System.out.println(i + ","+ j);
				}
				System.out.println();
			}
			
		//case 2 : 점프해서 한번에 바깥쪽의 for문을 탈출 (변수 값을 조정해서 탈출)
			for ( int i = 0; i < 5 ; i++) {
				for (int j = 0; j < 5; j++) {
					if (j ==2) {
						i = 100; // 바깥쪽 for문의 변수의 값을 큰 값을 넣어서 조건을 false로 만듬
						break;
					}
						System.out.println(i + ","+j);
					
						
					
				}
			}
			
	}
	
			}
	
	
	
	

