package j0510_01;

import java.util.Scanner;

public class Class0510_08 {
	public static void main(String[] args) {
		//반복문 -for, while
//		int sum=0;

//		for(int i = 1; i <= 100; i++) {
//			sum += i;
//			System.out.println(i+":"+sum);
//		}
		
		
		
		
//		마지막만 나오고 싶다면
//		int sum=0;
//		int i = 1;
//		for(i = 1; i <= 100; i++) {
//			sum += i;//sum = sum+i;
//		}
//		System.out.println(i+":"+sum); 
//		//마지막에 함수에서 빠져 나와야 마지막 값이 나옴.
		
		
		
		
		
//		문제 : 숫자를 3번 반복해서 합을 출력하시오.
//		1.변수선언 num,sum
//		2.scan1번 선언
//		3.반복문
//		4. 숫자 입력 넣어줌
//		num = scan.nextInt();
//		2.sum 변수에 더하기 해줌
//		sum = sum+ num;
//		6.sum릏 출력
//		int num = 0;
//	    int sum = 0;	    
//		Scanner scan = new Scanner(System.in);		
//		for(int i = 1; i<=3; i++) {
//			System.out.println(i);
//			System.out.println("숫자를 입력해주세요.");
//		    num = scan.nextInt();
//		    sum+=num;		
//		}
//		System.out.println(sum);
		
		
//		교수님 답-1
//	   for(int i = 0; i<3; i++) {
//			System.out.println((i+1)+"번째 숫자를 입력해주세요.");
//		    num = scan.nextInt();
//		    sum+=num;		
//		}
//		
//		 System.out.println("합계: "+sum);
		
//		교수님 답-2 변형		구구단
//		for(int i = 2; i<=9; i++) {
//			System.out.printf("[ %d 단 ]\n",i);
//			for(int j=1;j<=9;j++){
//				
//	
//			//System.out.println(i+" * "+i+" = "+(i*i));
//			System.out.printf("%d*%d = %d\n",i,j,i*j);
//			}
//			System.out.println();// 구문 한번 돌고 난 뒤 빈칸
//	}
			
		
		
		
//			0-9까지 출력하시오.
//			for(int i =0; i<=9; i++) {
//				System.out.println(i);
//			}
	
		
		
		
		
			
//00 01 02 03 04 .... 09 10 11 ....99
	//중첩(이중) 구문을 사용해서 출력하시오.
//	for(int i=0;i<10;i++) {
//	   for(int j=0;j<10;j++) {
//		   System.out.printf("%d%d\n",i,j); //옆으로 확인하고 싶다면\n빼기
//	   }
//	}
		
		
		
		
//	i--	 , i-=1 , i=i-1
//	i+	 , i+=1 , i=i+1		
//	for(int i = 100; i>0; i-=5)	{
//		System.out.println(i);
//	}
	
//	for(int i = 0;i<10;i++) {
//		System.out.println(i);	
//	}
	//초기화
//	int i = 0;
//			while(i<10) {
//			System.out.println(i);		
//			i++;
//			}

		
	Scanner	scan = new Scanner(System.in);
		
		
//		랜덤숫자 1~100까지의 랜덤 숫자 1개를 출력하시오.
		int random = 0;
		random= (int)(Math.random()*100)+1;
		//System.out.println(random);

		
		
		
//		숫자 맞추기 프로그램
//		10번
		int i = 1;
		while(i<=10) {
			System.out.println(i+"번째 숫자를 입력하세요.");
		
			int input = scan.nextInt();
			if(input==random) {
				System.out.println("정답입니다.");
				break;
				}else if(input>random) {
					System.out.println("[오답]입력한 답보다 작은 수 입니다.");
				}else {
				System.out.println("[오답]입력한 답보다 큰수 입니다.");
			}
			i++;// 없으면 무한으로 돌음
		}
//		
		
	
	
	
	}

}
